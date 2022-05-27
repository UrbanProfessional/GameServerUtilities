import java.net.*;
import java.io.*;
import java.util.*;

public class Server {
    private boolean isOnline;
    private int ping, players, port;
    private String ip;
     

    public Server() {
        isOnline = false;
        ping = 0;
        players = 0;
        ip = "";
    }

    public Server(boolean isOnlineU, String ipU) {
        isOnline = isOnlineU;
        ping = 0;
        players = 0;
        ip = ipU;
    }

    public Server(boolean isOnlineU, int pingU, int playersU, String ipU) {
        isOnline = isOnlineU;
        ping = pingU;
        players = playersU;
        ip = ipU;
    }

    public static boolean ping(String ip) {
        boolean ret = false;
        try {
            ret = InetAddress.getByName(ip).isReachable(5000);
        } catch (Exception e) {
            e.printStackTrace();
            return ret;
        }
        if (!ret) {
        System.out.println("Is this program running as administrator?");
        }
        return ret;
    }

    public static boolean serverUp(String ip, int port) {
        try {
        Socket server = new Socket();
        SocketAddress sockAddr = new InetSocketAddress(ip, port);
        server.connect(sockAddr, 5000);
        boolean up = server.isConnected();
        server.close();
        return up;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) 
        throws Exception {
        System.out.println(ping("91.216.250.33"));
        System.out.println(serverUp("91.216.250.33", 27015));
        System.out.println(InetAddress.getLocalHost());
    }
}
