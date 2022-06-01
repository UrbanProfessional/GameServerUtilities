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

    public Server(String ipU) {
        isOnline = serverUp(ipU, 443);
        ping = 0;
        players = 0;
        ip = ipU;
    }

    public Server(int pingU, int playersU, String ipU) {
        isOnline = serverUp(ipU, 443);
        ping = pingU;
        players = playersU;
        ip = ipU;
    }

    private static int ping(String ip) {
        long start;
        long ping;
        try {
            start = System.currentTimeMillis();
            System.out.println(start);
            Socket server = new Socket();
            SocketAddress sockAddr = new InetSocketAddress(ip, 443);
            server.connect(sockAddr, 5000);
            ping = System.currentTimeMillis();
            System.out.println(ping);
            server.close();
            return (int) (ping - start);
            } catch (Exception e) {
                return 0;
            }
    }

    private static boolean serverUp(String ip, int port) {
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
/*
    public static void main(String[] args) 
        throws Exception {
        System.out.println(ping("172.58.224.33"));
        System.out.println(serverUp("172.58.224.33", 443));
        System.out.println(InetAddress.getLocalHost());
    }
*/
    public String getIP() {
        return ip;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public int ping() {
        return ping;
    }

    public void update() {
        isOnline = serverUp(ip, 443);
        ping = ping(ip);
    }
}
