package network;

import network.messages.Packet;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.function.Consumer;

/**
 *
 */
public class ClientThread extends Thread {
    private static final String SERVER_HOSTNAME = "www.centralark.org";
    private static final int SERVER_PORT = 4443;
    private String data;
    private Consumer<Packet> callback;

    public ClientThread(String data, Consumer<Packet> callback) {
        this.data = data;
        this.callback = callback;
    }

    @Override
    public void run() {
        //System.setProperty("javax.net.debug", "ssl");
        System.setProperty("javax.net.ssl.trustStore", "client.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "checkers");
        SSLSocket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        SSLSocketFactory sslFact =
                (SSLSocketFactory) SSLSocketFactory.getDefault();
        try {
            socket = (SSLSocket) sslFact.createSocket(SERVER_HOSTNAME, SERVER_PORT);
            socket.setEnabledCipherSuites(new String[]{"TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA"});
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            out.write(data + "\n");
            out.flush();
            String input = in.readLine();
            System.out.println(input);
            Packet packet = Packet.fromJson(input);
            if (input == null || input.equals(".")) {
                return;
            }
            if (packet == null || packet.getData() == null) {
                callback.accept(Packet.perror("Could not parse data"));
                return; // Error from client side, nothing to do
            }
            Client.client.setToken(packet.getToken());
            callback.accept(packet);
        } catch (IOException e) {
            callback.accept(Packet.perror("Could not connect"));
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                // This is not fatal, but where there's smoke there's fire!
                e.printStackTrace();
            }
        }
    }
}
