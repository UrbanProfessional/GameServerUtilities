import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private JPanel panel, stage;

    public void launchGUI() {
        panel = new JPanel();
        Color c1 = new Color(3, 19, 38);
        panel.setBackground(c1);
        panel.setLayout(new BorderLayout());

        stage = new JPanel();
        Color c2 = new Color(23, 44, 66);
        stage.setBackground(c2);
        stage.setBounds(100,100,200,200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setTitle("Server Utilities - By Urban");
        setSize(500, 500);
        setLocationRelativeTo(null);
        add(panel);
        panel.add(stage);
    }

    public void build(Server s){
        GUIItem g = new GUIItem(s);
        stage.add(g.getPanel());
    }

    public void update() {
        setVisible(true);
    }

    public static void main(String[] args) {
        GUI g = new GUI();
        g.launchGUI();
        Server s = new Server("mofucraft.net");
        g.build(s);
        g.update();
    }
}
