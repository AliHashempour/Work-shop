import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Handler implements Runnable {

    Socket client;

    public Handler(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            DataInputStream inputStream = new DataInputStream(client.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
            StringBuilder sentence = new StringBuilder();
            while (true) {
                String original = inputStream.readUTF();
                sentence.append(original).append(" ");
                if (original.equalsIgnoreCase("done")) {
                    break;
                }
                outputStream.writeUTF(String.valueOf(sentence));

            }
            inputStream.close();
            outputStream.close();
            client.close();

        } catch (IOException e) {
            System.out.println("successful");
        }
    }
}
