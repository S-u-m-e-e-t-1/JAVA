import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 12345;

        try (Socket socket = new Socket(hostname, port)) {
            System.out.println("Client connected");

            Scanner scanner = new Scanner(System.in);
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String message;
            String response;

            while (true) {
                System.out.print("Enter message for server: ");
                message = scanner.nextLine();
                writer.println(message);

                if (message.equalsIgnoreCase("Client Over")) {
                    break;
                }

                response = reader.readLine();
                System.out.println("Received from server: " + response);

                if (response.equalsIgnoreCase("Server Over")) {
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
