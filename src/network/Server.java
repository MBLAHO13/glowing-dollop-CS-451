package network;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import java.io.IOException;
import java.net.ServerSocket;


/**
 *
 */
public class Server {
    private static final int SERVER_PORT = 4443;

    public static void startServer() throws IOException {
        //System.setProperty("javax.net.debug", "ssl");
        System.setProperty("javax.net.ssl.keyStore", "keystore.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "checkers");
        // SSL Taken from the Oracle Docs
        ServerSocket listener = null;
        // Instantiate the ssl socket factory with default setting
        SSLServerSocketFactory sslSrvFact =
                (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();


        try {
            listener = (SSLServerSocket) sslSrvFact.createServerSocket(SERVER_PORT);
            System.out.println("Server warmed up and waiting for connections");
            while (true) {
                new ServerThread(listener.accept()).start();
            }
        } finally {
            if (listener != null) {
                listener.close();
            }
        }
    }
}
