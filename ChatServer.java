import java.net.*;
import java.io.*;

public class ChatServer {
    public static void main(String args[]) throws Exception {
        // 1. Server start karein
        ServerSocket ss = new ServerSocket(8847);
        System.out.println("Server start ho gaya. Client ka wait kar raha hu...");

        Socket s = ss.accept();
        System.out.println("Client connect ho gaya! (Type 'stop' to end chat)");

        // 2. Streams banayein (Data aane aur jane ke liye)
        DataInputStream din = new DataInputStream(s.getInputStream()); // Client ki baat sunne ke liye
        DataOutputStream dout = new DataOutputStream(s.getOutputStream()); // Client ko bolne ke liye

        // Keyboard se type karne ke liye
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strClient = "", strServer = "";

        // 3. Chat Loop (Jab tak koi 'stop' na bole)
        while (!strClient.equals("stop")) {
            // Pehle Client ka message read karein
            strClient = din.readUTF();
            System.out.println("Client ne kaha: " + strClient);

            // Ab Server (Aap) apna reply type karega
            System.out.print("Aap (Server): ");
            strServer = br.readLine();
            dout.writeUTF(strServer);
            dout.flush();
        }

        // 4. Close connections
        din.close();
        s.close();
        ss.close();
    }
}
