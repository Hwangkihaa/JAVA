package network;

import item.ExpenseItem;

import java.io.*;
import java.net.*;
import java.util.List;

public class NetworkManager {
    private static final int PORT = 12345;

    public static void sendData(String hostname, List<ExpenseItem> items) throws IOException {
        try (Socket socket = new Socket(hostname, PORT);
             ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())) {
            out.writeObject(items);
        }
    }

    @SuppressWarnings("unchecked")
    public static List<ExpenseItem> receiveData() throws IOException, ClassNotFoundException {
        try (ServerSocket serverSocket = new ServerSocket(PORT);
             Socket socket = serverSocket.accept();
             ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {
            return (List<ExpenseItem>) in.readObject();
        }
    }
}
