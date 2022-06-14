import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener {
    private JPanel panel, background;
    private boolean buildServer = false;
    private String inputtedIP;

    public void launchGUI() {

//Top Bar Panel
        panel = new JPanel();
        Color c1 = new Color(3, 19, 38);
        panel.setBackground(c1);
        panel.setLayout(new GridLayout(3,5));
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));
        JLabel title = new JLabel("   Server List");
        title.setForeground(Color.white);
        panel.add(title);
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));
        JButton add = new JButton("Add");
        add.addActionListener(this);
        panel.add(add);
        panel.add(new JLabel(""));
        panel.add(new JButton("Click Me"));
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));
        panel.add(new JLabel(""));

//Background Color Panel
        background = new JPanel();
        background.setBackground(Color.BLACK);
        background.setLayout(new GridLayout(5,1,5,5));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setTitle("Server Tracker");
        setSize(500, 500);
        setLocationRelativeTo(null);
        add(background);
        background.add(panel);
    }

//Add Server to the list
    public void build(Server s){
        GUIItem g = new GUIItem(s);
        background.add(g.getPanel());
    }

//Make Screen Visible
    public void update() {
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){  
        GUIInput i = new GUIInput(this);
        i.launchGUI();
    }  


    public static void main(String[] args) {
        GUI g = new GUI();
        g.launchGUI();
        g.update();
    }
}
