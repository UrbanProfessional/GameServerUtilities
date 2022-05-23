import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
    
    JPanel panel = new JPanel();
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(true);
    window.setTitle("Server Utilities - By Urban");
    window.setSize(500, 500);
    window.setLocationRelativeTo(null);
    window.setVisible(true);
    window.add(panel);

    panel.setLayout(null);

    JLabel label = new JLabel("Server");
    label.setBounds(10,20,80,25);
    panel.add(label);

    JTextField inputIP = new JTextField();
    inputIP.setBounds(100,20,165,25);
    panel.add(inputIP);

    JLabel psswdLabel = new JLabel("Server Password");
    psswdLabel.setBounds(10,50,80,25);
    panel.add(psswdLabel);

    }
}
