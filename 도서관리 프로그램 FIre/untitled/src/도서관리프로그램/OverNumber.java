package 도서관리프로그램;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class OverNumber extends JPanel {

    /**
     * Create the panel.
     */
    public OverNumber() {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("\uBC88\uD638 \uC218 \uCD08\uACFC");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 50));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setBounds(73, 208, 304, 77);
        add(lblNewLabel);

    }

}
