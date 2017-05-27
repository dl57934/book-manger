package 도서관리프로그램;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class BurrowBook extends JPanel {

    /**
     * Create the panel.
     */
    public BurrowBook() {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel label = new JLabel("\uCC45 \uB300\uCD9C");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label.setBackground(Color.BLACK);
        label.setBounds(183, 23, 87, 42);
        add(label);

        JTextArea textArea = new JTextArea();
        textArea.setForeground(Color.BLACK);
        textArea.setBackground(Color.WHITE);
        textArea.setBounds(122, 152, 205, 24);
        add(textArea);

        JTextArea textArea_1 = new JTextArea();
        textArea_1.setForeground(Color.BLACK);
        textArea_1.setBackground(Color.WHITE);
        textArea_1.setBounds(122, 279, 205, 24);
        add(textArea_1);

        JTextArea textArea_2 = new JTextArea();
        textArea_2.setForeground(Color.BLACK);
        textArea_2.setBackground(Color.WHITE);
        textArea_2.setBounds(122, 406, 205, 24);
        add(textArea_2);

        JLabel label_1 = new JLabel("\uCC45 \uC81C\uBAA9");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_1.setBackground(Color.BLACK);
        label_1.setBounds(183, 97, 92, 43);
        add(label_1);

        JLabel label_2 = new JLabel("  이름");
        label_2.setForeground(Color.WHITE);
        label_2.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_2.setBackground(Color.BLACK);
        label_2.setBounds(170, 224, 105, 43);
        add(label_2);

        JLabel label_3 = new JLabel("\uD68C\uC6D0 \uBC88\uD638");
        label_3.setForeground(Color.WHITE);
        label_3.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_3.setBackground(Color.BLACK);
        label_3.setBounds(170, 351, 105, 43);
        add(label_3);

    }

}
