import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    int contor = 0;
    JFrame frame = new JFrame("hello swing");
    JPanel jpane = new JPanel();
    JLabel jLabel = new JLabel("contor");
    JButton button1 = new JButton("0");
    JButton button2 = new JButton("Reset");

    public static void main(String[] args) {
        Main cls = new Main();
        cls.createGUI();
    }

    public void createGUI() {
        button1.setFont(new Font("Arial", Font.BOLD, 72));
        button1.addActionListener(new ButtonListener());
        button2.setFont(new Font("Arrial", Font.BOLD, 72));
        button2.addActionListener(new Reset());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        jpane.add(jLabel);
        jpane.add(button1);
        jpane.add(button2);
        frame.add(jpane);
        frame.setVisible(true);
    }

    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            contor++;
            button1.setText(contor + "");
        }
    }

    public class Reset implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            contor = 0;
            button1.setText("0");
        }
    }
}