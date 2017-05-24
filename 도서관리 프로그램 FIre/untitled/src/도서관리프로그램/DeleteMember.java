package 도서관리프로그램;

/**
 * Created by dl579 on 2017-05-24.
 */
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class DeleteMember extends JPanel {

    /**
     * Create the panel.
     */
    public DeleteMember() {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel label = new JLabel("\uBA64\uBC84\uC0AD\uC81C");
        label.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        label.setBackground(Color.BLACK);
        label.setForeground(Color.WHITE);
        label.setBounds(172, 12, 120, 57);
        add(label);

        JLabel lblNewLabel = new JLabel("\uC0AD\uC81C\uD560 \uC774\uB984 \uC785\uB825");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 20));
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(14, 101, 241, 45);
        add(lblNewLabel);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(14, 158, 346, 24);
        add(textArea);

        JLabel label_1 = new JLabel("\uC0AD\uC81C\uD560 \uD559\uBC88 \uC785\uB825");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 20));
        label_1.setBackground(Color.BLACK);
        label_1.setBounds(14, 240, 241, 45);
        add(label_1);

        JTextArea textArea_1 = new JTextArea();
        textArea_1.setBounds(14, 314, 346, 24);
        add(textArea_1);

    }

}
