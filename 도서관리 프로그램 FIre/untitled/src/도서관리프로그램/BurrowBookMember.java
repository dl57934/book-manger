package 도서관리프로그램;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BurrowBookMember extends JPanel {

    /**
     * Create the panel.
     */
    public BurrowBookMember(JFrame jFrame) {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("\uCC45 \uB300\uCD9C");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 35));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(157, 38, 125, 41);
        add(lblNewLabel);

        JButton btnNewButton = new JButton("PUSH");//학생
        btnNewButton.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setBounds(157, 154, 105, 37);
        add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setBounds(100,100,480,600);
                jFrame.setContentPane(new SelectionBurrow(jFrame,0));
            }
        });

        JButton button = new JButton("PUSH");//게스트
        button.setForeground(Color.WHITE);
        button.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        button.setBackground(Color.BLACK);
        button.setBounds(157, 263, 105, 37);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setBounds(100,100,480,600);
                jFrame.setContentPane(new SelectionBurrow(jFrame,1));
            }
        });
        JButton button_1 = new JButton("PUSH");//스태프
        button_1.setForeground(Color.WHITE);
        button_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        button_1.setBackground(Color.BLACK);
        button_1.setBounds(157, 369, 105, 37);
        add(button_1);
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setBounds(100,100,480,600);
                jFrame.setContentPane(new SelectionBurrow(jFrame,2));
            }
        });
        JLabel lblNewLabel_1 = new JLabel("학생");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        lblNewLabel_1.setBounds(183, 103, 64, 41);
        add(lblNewLabel_1);

        JLabel label = new JLabel("게스트");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label.setBounds(167, 210, 79, 41);
        add(label);

        JLabel label_1 = new JLabel("스태프");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_1.setBounds(167, 316, 79, 41);
        add(label_1);

    }
}
