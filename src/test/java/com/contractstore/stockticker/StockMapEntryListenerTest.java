package com.contractstore.stockticker;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.concurrent.ExecutionException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.contractstore.stockticker.cluster.ClientUtility;
import com.contractstore.stockticker.cluster.ClusterUtility;
import com.contractstore.stockticker.model.StockRecord;

import com.hazelcast.core.Cluster;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class StockMapEntryListenerTest {

	private static ClusterUtility clusterUtility;
	private static int initialClusterSize = 3;
	private static int backupCount = 1;
	private static String mapName = "stock-map";
	
	final static Random random = new Random();

	final static LinkedHashMap<String, StockRecord> stockMap = new LinkedHashMap<String, StockRecord>() {{
		put("C2B2", new StockRecord("C2B2", "C2B2 Consulting Limited", roundResult(new BigDecimal(generateInitialPrice()))));
		put("TPK", new StockRecord("TPK", "Travis Perkins Limited", roundResult(new BigDecimal(generateInitialPrice()))));
		put("ORL", new StockRecord("ORL", "Oracle", roundResult(new BigDecimal(generateInitialPrice()))));
		put("BPL", new StockRecord("BPL", "British Petroleum", roundResult(new BigDecimal(generateInitialPrice()))));
		put("IBM", new StockRecord("IBM", "IBM Computers", roundResult(new BigDecimal(generateInitialPrice()))));
		put("DEB", new StockRecord("DEB", "Debenhams", roundResult(new BigDecimal(generateInitialPrice()))));
		put("TCG", new StockRecord("TCG", "Thomson Cook Group", roundResult(new BigDecimal(generateInitialPrice()))));
		put("TYT", new StockRecord("TYT", "Toyota", roundResult(new BigDecimal(generateInitialPrice()))));
	}};
	
	static BigDecimal roundResult(BigDecimal unroundedValue) {
		return unroundedValue.setScale(2, BigDecimal.ROUND_HALF_UP);
	}
	
	static double generateInitialPrice() {
		return random.nextDouble() * 10;
	}

	@BeforeClass
	public static void setupCluster() {
		clusterUtility = new ClusterUtility(initialClusterSize);
		clusterUtility.populateStockDataset(mapName, stockMap, backupCount);
	}

	@AfterClass
	public static void teardownCluster() {
		clusterUtility.shutdown();
	}

	@Test
	public void startCluster() throws InterruptedException, ExecutionException, IOException {

		HazelcastInstance client = ClientUtility.createClient();
		
		StockUpdater stockUpdater = new StockUpdater(mapName);
		Thread stockUpdaterThread = new Thread(stockUpdater);
		stockUpdaterThread.start();
        
        Cluster cluster = client.getCluster();
        assertTrue(cluster.getMembers().size() == initialClusterSize);

        System.in.read();

		stockUpdater.setStopFlag(true);
      
        client.shutdown();

	}
	
}
class StockUpdater implements Runnable {
	
	private Random random = new Random();
	
	private IMap<String, StockRecord> stockMap;

	private Double maximumMovement = 0.5D;
	
	private boolean stopFlag = false;
	
	StockUpdater(String mapName) {
		HazelcastInstance client = ClientUtility.createClient();
		stockMap = client.getMap(mapName);
	}
	
	@Override
	public void run() {

		while (!stopFlag) {

			int stockPositionToUpdate = random.nextInt(StockMapEntryListenerTest.stockMap.size());
			StockRecord stockRecordToUpdate = stockMap.get(stockMap.keySet().toArray()[stockPositionToUpdate]);

			BigDecimal currentValue = stockRecordToUpdate.getValue();
			BigDecimal change = new BigDecimal(random.nextDouble() * maximumMovement);
			boolean positiveDirectionOfChange = random.nextBoolean();
			
			if (!positiveDirectionOfChange && wouldResultInNegativeValue(currentValue, change)) {
				positiveDirectionOfChange = !positiveDirectionOfChange;
			}
			
			if (positiveDirectionOfChange) {
				stockRecordToUpdate.setValue(increasePrice(currentValue, change));
			} else {
				stockRecordToUpdate.setValue(reducePrice(currentValue, change));
			}
			
			System.out.println("Updating " + stockRecordToUpdate.getSymbol() + " new value: " + stockRecordToUpdate.getValue());
			
			stockRecordToUpdate.setLastUpdate(new Date());

			stockMap.put(stockRecordToUpdate.getSymbol(), stockRecordToUpdate);
			
			try {
				Thread.currentThread().sleep(500L);
			} catch (InterruptedException exception) {
				
			}
		}
		
		System.out.println("Stopping updater thread");
		
	}

	public void setStopFlag(boolean stop) {
		this.stopFlag = stop;
	}
	
	private boolean wouldResultInNegativeValue(BigDecimal currentValue, BigDecimal change) {
		BigDecimal result = reducePrice(currentValue, change);
		if (result.compareTo(BigDecimal.ZERO) <= 0) {
			return true;
		}
		return false;
	}
	
	private BigDecimal reducePrice(BigDecimal currentValue, BigDecimal change) {
		return StockMapEntryListenerTest.roundResult(currentValue.subtract(change));
	}
	private BigDecimal increasePrice(BigDecimal currentValue, BigDecimal change) {
		return StockMapEntryListenerTest.roundResult(currentValue.add(change));
	}

}
