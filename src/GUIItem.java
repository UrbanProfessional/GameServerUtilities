import javax.swing.*;

public class GUIItem {
    JPanel j = new JPanel();
    public GUIItem(Server s) {
        j.setSize(100,100);
        String up = "DOWN";
        JLabel ip = new JLabel(s.getIP());

        if (s.isOnline()) {
            up = "UP";
        } else {
            up = "DOWN";
        }
        JLabel isUP = new JLabel(up);
        JLabel ping = new JLabel(s.ping() + "");

        j.add(ip);
        j.add(isUP);
        j.add(ping);
    }

    public JPanel getPanel() {
        return j;
    }
}
