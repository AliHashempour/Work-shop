package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public void connectToServer() {
        Scanner scanner = new Scanner(System.in);
        try {
            Socket mySocket = new Socket("localhost", 8585);
            DataInputStream dataInputStream = new DataInputStream(mySocket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(mySocket.getOutputStream());
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("done")) {
                    System.out.println("bye");
                    break;
                }
                dataOutputStream.writeUTF(input);
                System.out.println(dataInputStream.readUTF() + "");

            }
            mySocket.close();
            dataInputStream.close();
            dataOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.connectToServer();
    }
}
