
import java.util.*;
import java.io.*;
import java.net.*;

public class MultiplayerSnakeGame {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("Server started at " + new Date());

        int sessionNo = 1;

        while (true) {
            Socket player1 = serverSocket.accept();
            System.out.println("Player 1 joined session " + sessionNo);
            new DataOutputStream(player1.getOutputStream()).writeInt(1);

            Socket player2 = serverSocket.accept();
            System.out.println("Player 2 joined session " + sessionNo);
            new DataOutputStream(player2.getOutputStream()).writeInt(2);

            new Thread(new HandleASession(player1, player2)).start();
            sessionNo++;
        }
    }
}

class HandleASession implements Runnable {
    private Socket player1;
    private Socket player2;

    public HandleASession(Socket player1, Socket player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void run() {
        try {
            DataInputStream fromPlayer1 = new DataInputStream(player1.getInputStream());
            DataOutputStream toPlayer1 = new DataOutputStream(player1.getOutputStream());
            DataInputStream fromPlayer2 = new DataInputStream(player2.getInputStream());
            DataOutputStream toPlayer2 = new DataOutputStream(player2.getOutputStream());

            // TODO: Implement game logic here
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
