import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
JFrame frame = new JFrame("App");
JPanel panel = new JPanel();
panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
JLabel label = new JLabel("Welcome!");
JButton button = new JButton("Generate");
frame.add(button);
frame.add(label);
panel.add(label);
panel.add(button);
frame.add(panel);

label.setFont(new Font("Comic-Sans", Font.BOLD, 30));
frame.setSize(1920, 1080);
frame.getContentPane().setBackground(Color.white);
frame.setVisible(true);
        WordBase wb = new WordBase();
        button.addActionListener(e -> {
           label.setText(wb.ToString());
        });
    }




    }
