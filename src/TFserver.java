public class TFserver extends Server {
    private String map;

    public TFserver() {
        super();
        map = "";
    }

    public TFserver(boolean isOnlineU) {
        super(isOnlineU);
        map = "";
    }

    public TFserver(boolean isOnlineU, int pingU, int playersU, String mapU) {
        super(isOnlineU,pingU,playersU);
        map = mapU;
    }
}
