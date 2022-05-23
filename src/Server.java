public class Server {
    private boolean isOnline;
    private int ping, players;

    public Server() {
        isOnline = false;
        ping = 0;
        players = 0;
    }

    public Server(boolean isOnlineU) {
        isOnline = isOnlineU;
        ping = 0;
        players = 0;
    }

    public Server(boolean isOnlineU, int pingU, int playersU) {
        isOnline = isOnlineU;
        ping = pingU;
        players = playersU;
    }
}
