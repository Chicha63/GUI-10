import javax.swing.*;
import java.awt.*;

public class Main {
    static StringOper oper = new StringOper();
    public static void main(String[] args) {

        JFrame frame = new JFrame("Words");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        JPanel panel1 = new JPanel();
        JButton button1 = new JButton("Back");
        JButton button2 = new JButton("Show words");
        button1.setEnabled(false);
        button2.addActionListener(e -> {
            oper.setString(textArea.getText());
            oper.setWords();
            textArea.setText(oper.getWords());
            button1.setEnabled(true);
            button2.setEnabled(false);
        });
        button1.addActionListener(e -> {
            textArea.setText(oper.getString());
            oper.clear();
            button1.setEnabled(false);
            button2.setEnabled(true);
        });
        panel1.add(button1);
        panel1.add(button2);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panel1, BorderLayout.SOUTH);
        frame.setSize(400,400);
        frame.setVisible(true);
    }

}