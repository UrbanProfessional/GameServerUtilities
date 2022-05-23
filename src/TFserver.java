public class TFserver extends Server {
    private String map;

    public TFserver() {
        super();
        map = "";
    }

    public TFserver(boolean isOnlineU, String ipU) {
        super(isOnlineU, ipU);
        map = "";
    }

    public TFserver(boolean isOnlineU, int pingU, int playersU, String mapU, String ipU) {
        super(isOnlineU,pingU,playersU, ipU);
        map = mapU;
    }
}
