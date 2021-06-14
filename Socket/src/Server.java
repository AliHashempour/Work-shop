import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    public void connect() {
        try (ServerSocket myServer = new ServerSocket(8585)) {
            Socket theClient = null;
            System.out.println("Server is listening...");
            while (true) {
                theClient = myServer.accept();
                System.out.println("client detected");
                Thread thread = new Thread(new Handler(theClient));
                thread.start();
            }

        } catch (IOException e) {
            System.out.println("successful");
        }
    }


    public static void main(String[] args) {
        Server server = new Server();
        server.connect();
    }
}
