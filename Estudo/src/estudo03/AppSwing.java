package estudo03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppSwing {
    private JButton button_msg;
    private JPanel panelMain;

    public AppSwing() {
        button_msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AppSwing");

        frame.setContentPane(new AppSwing().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
