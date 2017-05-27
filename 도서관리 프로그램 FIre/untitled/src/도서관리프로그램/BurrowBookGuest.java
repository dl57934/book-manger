package 도서관리프로그램;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class BurrowBookGuest extends JPanel {
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Create the panel.
     */
    public BurrowBookGuest(JFrame jFrame) {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("\uAC8C\uC2A4\uD2B8 \uB300\uCD9C");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setBounds(137, 32, 162, 42);
        add(lblNewLabel);

        JLabel label = new JLabel("\uC774\uB984");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label.setBackground(Color.BLACK);
        label.setBounds(186, 114, 60, 42);
        add(label);

        JLabel label_1 = new JLabel("\uB3C4\uC11C\uAD00 \uBC88\uD638");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_1.setBackground(Color.BLACK);
        label_1.setBounds(155, 242, 134, 42);
        add(label_1);

        textField = new JTextField();
        textField.setBounds(137, 168, 162, 24);
        add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(137, 331, 162, 24);
        add(textField_1);

    }
}
