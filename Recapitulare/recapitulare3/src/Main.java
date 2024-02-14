import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("titlu");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("ceva");
        JButton button = new JButton("apasa");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);

        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("altceva");
            }
        });

        panel.add(label);
        panel.add(button);
        frame.add(panel);
    }
}