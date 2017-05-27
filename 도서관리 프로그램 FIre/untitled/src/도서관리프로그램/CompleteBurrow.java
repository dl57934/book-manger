package 도서관리프로그램;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class CompleteBurrow extends JPanel {

    /**
     * Create the panel.
     */
    public CompleteBurrow() {
        setBackground(Color.BLACK);
        setLayout(null);
        JLabel lblNewLabel = new JLabel("\uB300\uCD9C \uC644\uB8CC");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 40));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setBounds(141, 194, 174, 48);
        add(lblNewLabel);

    }

}
