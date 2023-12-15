import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);

        JLabel label1 = new JLabel("Login");
        JTextField textField1 = new JTextField(10);
        textField1.setSize(10, 30);
        JPanel panel1 = new JPanel();
        panel1.add(label1);
        panel1.add(textField1);
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER));


        JLabel label2 = new JLabel("Password");
        JTextField textField2 = new JPasswordField(10);
        JPanel panel2 = new JPanel();
        panel2.add(label2);
        panel2.add(textField2);
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));

        JCheckBox checkBox = new JCheckBox();
        JLabel label3 = new JLabel("Ceva");
        JPanel panel3 = new JPanel();
        panel3.add(checkBox);
        panel3.add(label3);
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER));


        JButton button = new JButton("Login");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Apasare");
            }
        });

        JPanel panel4 = new JPanel();
        panel4.add(button);
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER));


        JPanel panel = new JPanel(new GridLayout());
        panel.add(panel1);
        panel.add(panel2);
        panel.add(panel3);
        panel.add(panel4);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));


        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}