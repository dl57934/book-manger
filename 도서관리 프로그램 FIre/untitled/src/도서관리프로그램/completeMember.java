package 도서관리프로그램;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class completeMember extends JPanel {

    /**
     * Create the panel.
     */
    public completeMember() {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("\uBA64\uBC84\uCD94\uAC00 \uC644\uB8CC");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 50));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setBounds(63, 131, 344, 137);
        add(lblNewLabel);

    }

}
