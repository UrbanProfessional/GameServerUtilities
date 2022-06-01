import javax.swing.*;
import java.awt.*;

public class GUI {
    JPanel panel = new JPanel();
    JFrame window = new JFrame();

    public void launchGUI() {
        Color c = new Color(20,20,20);
        panel.setBackground(c);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setTitle("Server Utilities - By Urban");
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    }

    public void build(Server s){
        GUIItem g = new GUIItem(s);
        panel.add(g.getPanel());
    }

    public void update() {
        window.setVisible(true);
    }

    public static void main(String[] args) {
        GUI g = new GUI();
        g.launchGUI();
        Server s = new Server("mofucraft.net");
        g.build(s);
        g.update();
    }
}
