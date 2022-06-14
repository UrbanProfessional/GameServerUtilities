import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIInput implements ActionListener {

    public GUIInput(GUI gU) {
        g = gU;
    }

    private String textInput;
    private JTextField inputIP;
    private GUI g;
    public void launchGUI() {
        JFrame serverInput = new JFrame();
        serverInput.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        serverInput.setResizable(false);
        serverInput.setTitle("Server List Input");
        serverInput.setSize(300,150);
        serverInput.setLocationRelativeTo(null);

        JPanel inputScreen = new JPanel();  
        inputScreen.setBackground(Color.BLACK);
        inputScreen.setLayout(new GridLayout(3, 1));

        JLabel inputTitle = new JLabel("Input IP:");
        inputTitle.setForeground(Color.white);
        inputScreen.add(inputTitle);

        inputIP = new JTextField();
        inputScreen.add(inputIP);

        JButton submit = new JButton("Submit");
        inputScreen.add(submit);
        submit.addActionListener(this);

        serverInput.add(inputScreen);
        serverInput.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){ 
        Server s = new Server(inputIP.getText());
        g.build(s);
        g.update();
    }  

}
