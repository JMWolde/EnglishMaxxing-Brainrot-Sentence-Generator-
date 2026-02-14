import javax.swing.*;
import java.awt.*;

public class Main {
    private static String Sentence = "";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowUI);
    }

    private static void createAndShowUI() {
        JFrame frame = new JFrame("EnglishMaxxing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        frame.setContentPane(panel);

        // ===== CENTER TEXT =====
        JTextArea label = new JTextArea("Welcome!");
        label.setWrapStyleWord(true);
        label.setLineWrap(true);
        label.setEditable(false);
        label.setOpaque(false);
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 25));

        // Give it a reasonable preferred size so it doesn't wrap weirdly
        label.setColumns(40);
        label.setRows(4);

        JPanel centerWrap = new JPanel(new GridBagLayout());
        centerWrap.setOpaque(false);
        centerWrap.add(label);

        panel.add(centerWrap, BorderLayout.CENTER);

        // ===== LIST (RIGHT SIDE) =====
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);

        JScrollPane listScroll = new JScrollPane(list);
        listScroll.setPreferredSize(new Dimension(350, 0));
        panel.add(listScroll, BorderLayout.EAST);

        // ===== BUTTONS (BOTTOM) =====
        JButton GenButton = new JButton("Generate");
        JButton SaveButton = new JButton("Save");
        JButton DisplayButton = new JButton("Display Saved");

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.add(GenButton);
        buttonPanel.add(SaveButton);
        buttonPanel.add(DisplayButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        // ===== SHOW FRAME =====
        frame.setSize(1200, 700);           // use smaller while debugging
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // ===== YOUR LOGIC =====
        WordBase wb = new WordBase();
        SaveSystem sys = new SaveSystem();

        GenButton.addActionListener(e -> {
            Sentence = wb.GetString();
            label.setText(Sentence);

            // Force layout refresh if needed
            label.revalidate();
            label.repaint();
        });

        SaveButton.addActionListener(e -> {
            boolean exists = false;

            if (sys.getSentences() == null || sys.getSentences().isEmpty()) {
                sys.saveSentences(Sentence);
                return;
            }

            for (String s : sys.getSentences()) {
                if (s.equals(Sentence)) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                sys.saveSentences(Sentence);
            }
        });

        DisplayButton.addActionListener(e -> {
            model.clear();
            for (String s : sys.getSentences()) {
                model.addElement(s);
            }
        });
    }
}
