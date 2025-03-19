import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        int port = 12345;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            try (Socket socket = serverSocket.accept()) {
                System.out.println("Client connected");

                Scanner scanner = new Scanner(System.in);
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                String message;
                String response;

                while (true) {
                    response = reader.readLine();
                    System.out.println("Received from client: " + response);

                    if (response.equalsIgnoreCase("Client Over")) {
                        break;
                    }

                    System.out.print("Enter message for client: ");
                    message = scanner.nextLine();
                    writer.println(message);

                    if (message.equalsIgnoreCase("Server Over")) {
                        break;
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
