import java.io.IOException;
import java.net.*;

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

    public static long ping(String ip) 
        throws UnknownHostException, IOException {
        long ping = 0;
        boolean up = false;
        long sTime = System.currentTimeMillis();
        up = InetAddress.getByName(ip).isReachable(5000);
        long eTime = System.currentTimeMillis() - sTime;
        ping = eTime;

        if (up) {
        return ping;
        } else {
        return -1;
        }
    }

    public static void main(String[] args) 
        throws UnknownHostException, IOException {
        System.out.println(ping("127.0.0.1"));
    }
}
