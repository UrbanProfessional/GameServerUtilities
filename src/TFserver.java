public class TFserver extends Server {
    private String map;

    public TFserver() {
        super();
        map = "";
    }

    public TFserver(String ipU) {
        super(ipU);
        map = "";
    }

    public TFserver(int pingU, int playersU, String mapU, String ipU) {
        super(pingU,playersU, ipU);
        map = mapU;
    }
}
