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

    public int ping() {
        return 1;
    }
}
