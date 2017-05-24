package 도서관리프로그램;

/**
 * Created by dl579 on 2017-05-24.
 */
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class CheckMember extends JPanel {

    /**
     * Create the panel.
     */
    public CheckMember() {
        setBackground(Color.BLACK);
        setLayout(null);

        JScrollBar scrollBar = new JScrollBar();
        add(scrollBar);
        scrollBar.setBounds(465, 70, 21, 418);

        JLabel lblNewLabel = new JLabel("\uBA64\uBC84\uD655\uC778");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(194, 12, 121, 54);
        add(lblNewLabel);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(14, 70, 472, 418);
        add(textArea);

    }
}
