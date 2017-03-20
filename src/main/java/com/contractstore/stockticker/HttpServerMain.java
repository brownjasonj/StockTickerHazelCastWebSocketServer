package com.contractstore.stockticker;

import org.glassfish.tyrus.server.Server;

import com.contractstore.ExampleProtoBuf;
import com.contractstore.stockticker.web.StockWebSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main class.
 *
 */
public class HttpServerMain  {

	/**
     * Starts Grizzly HTTP server exposing JAX-RS resources defined in this application.
     * @return Grizzly HTTP server.
     */
    public static Server startServer() {
        Server webSocketServer = new Server("localhost", 8025, "/websockets", StockWebSocket.class);

                
        ExampleProtoBuf.SearchRequest sr = ExampleProtoBuf.SearchRequest.newBuilder().setAnotherresult(10).build();
        sr.toByteArray();
        
        return webSocketServer;
    }

    /**
     * Main method.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Server webSocketServer = new Server("localhost", 8025, "/websockets", StockWebSocket.class);

    	try {
    		webSocketServer.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Please press a key to stop the server.");
            reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	webSocketServer.stop();
        }
    }
}

