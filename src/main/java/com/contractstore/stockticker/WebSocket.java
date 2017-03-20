/**
 * 
 */
package com.contractstore.stockticker;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/stock")
public class WebSocket {

	private static final Set<WebSocket> connections = new CopyOnWriteArraySet<WebSocket>();

	private Session session;

	private String listenerId = null;

	public WebSocket() {
	}

	@OnOpen
	public void start(Session session) {
		this.session = session;
		connections.add(this);
	}

	@OnClose
	public void end() {
		connections.remove(this);
	}

	@OnMessage
	public void incoming(String message) {
		if (message.equals("open")) {
			send(this, "hello");
		}
	}

	@OnError
	public void onError(Throwable t) throws Throwable {
	}

	private static void send(WebSocket client, String message) {
		try {
			synchronized (client) {
				client.session.getBasicRemote().sendText(message);
			}
		} catch (IOException e) {
			connections.remove(client);
			try {
				client.session.close();
			} catch (IOException ioException) {

			}
		}
	}

}
