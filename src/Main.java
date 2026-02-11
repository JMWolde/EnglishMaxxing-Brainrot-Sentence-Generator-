import javax.swing.*;
import java.awt.*;
import java.lang.annotation.ElementType;
import java.util.*;

public class Main {
    private static String Sentence = "";
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        JFrame frame = new JFrame("App");
JPanel panel = new JPanel();
panel.setLayout(new FlowLayout(FlowLayout.CENTER, 90, 450));
JLabel label = new JLabel("Welcome!");
DefaultListModel<String> model = new DefaultListModel<>();
JList<String> list = new JList<>(model);

// Buttons
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


label.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
frame.setSize(1920, 1080);
frame.setTitle("EnglishMaxxing");
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
