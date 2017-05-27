package 도서관리프로그램;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class CheckSameName extends JPanel {

    /**
     * Create the panel.
     */
    public CheckSameName() {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("\uC77C\uCE58\uD558\uB294 \uC774\uB984\uC774 \uC5C6\uC2B5\uB2C8\uB2E4.");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 35));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(14, 170, 422, 82);
        add(lblNewLabel);

    }

}
