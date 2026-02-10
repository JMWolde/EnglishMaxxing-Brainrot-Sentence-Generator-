import javax.swing.*;
import java.awt.*;
import java.lang.annotation.ElementType;
import java.util.*;

public class Main {
    private static String Sentence = "";
    public static void main(String[] args) {

JFrame frame = new JFrame("App");
JPanel panel = new JPanel();
panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
JLabel label = new JLabel("Welcome!");
DefaultListModel<String> model = new DefaultListModel<>();
JList<String> list = new JList<>(model);
JButton GenButton = new JButton("Generate");
JButton SaveButton = new JButton("Save");
JButton DisplayButton = new JButton("Display Saved");
frame.add(DisplayButton);
frame.add(SaveButton);
frame.add(list);
frame.add(GenButton);
frame.add(label);
panel.add(DisplayButton);
panel.add(label);
panel.add(list);
panel.add(SaveButton);
panel.add(GenButton);
frame.add(panel);
label.setFont(new Font("Comic-Sans", Font.BOLD, 30));
frame.setSize(1920, 1080);
frame.setTitle("EnglishMaxxing");
frame.getContentPane().setBackground(Color.white);
frame.setVisible(true);
        WordBase wb = new WordBase();
        SaveSystem sys = new SaveSystem();
        GenButton.addActionListener(e -> {
            Sentence = wb.ToString();
           label.setText(Sentence);
        });
        SaveButton.addActionListener(e -> {
            boolean exists = false;
            if (sys.getSentences() == null || sys.getSentences().isEmpty()) {
                sys.saveSentences(Sentence);
            }
            for (String s : sys.getSentences()) {
                if (s.equals(Sentence)) {
                    exists = true;
                    break;
                }
                    if (!exists) {
                        sys.saveSentences(Sentence);
                    }
                }

        });
        DisplayButton.addActionListener(e -> {
            for (String s : sys.getSentences()) {
                model.addElement(s);
            }
        });
    }




    }
