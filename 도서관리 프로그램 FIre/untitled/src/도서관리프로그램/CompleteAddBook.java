package 도서관리프로그램;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class CompleteAddBook extends JPanel {

    /**
     * Create the panel.
     */
    public CompleteAddBook() {
        setBackground(Color.BLACK);
        setLayout(null);
        JLabel label = new JLabel("\uCC45 \uCD94\uAC00 \uC644\uB8CC");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("a옛날사진관3", Font.PLAIN, 50));
        label.setBackground(Color.BLACK);
        label.setBounds(89, 174, 290, 97);
        add(label);

    }
}
