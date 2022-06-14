import java.awt.Color;

import javax.swing.*;

public class GUIItem {
    JPanel j = new JPanel();
    public GUIItem(Server s) {
        j.setVisible(true);
        s.update();
        j.setBounds(0,200,0,200);
        Color c2 = new Color(36, 36, 36);
        j.setBackground(c2);
        String up = "DOWN";

        JLabel ip = new JLabel(s.getIP());
        JLabel isUP = new JLabel(up);
        JLabel ping = new JLabel(s.ping() + "");

        if (s.isOnline()) {
            isUP.setText("UP");
            isUP.setForeground(Color.green);
            ip.setForeground(Color.green);            
        } else {
            isUP.setText("DOWN");
            isUP.setForeground(Color.red); 
            ip.setForeground(Color.yellow);  
        }

        if (!(s.getIP().contains("."))) {
            ip.setForeground(Color.red); 
        }

        if (s.ping() > 0 && s.ping() < 50) {
            ping.setForeground(Color.green);
        } else if (s.ping() > 50 && s.ping() < 100) {
            ping.setForeground(Color.yellow);
        } else if (s.ping() > 100) {
            ping.setForeground(Color.red);
        }

        j.add(ip);
        j.add(isUP);
        j.add(ping);
    }

    public JPanel getPanel() {
        return j;
    }

}
