package 도서관리프로그램;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class relationgpeople extends JPanel {

    /**
     * Create the panel.
     */
    public relationgpeople(JFrame jframe) {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("\uBA64\uBC84");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(186, 51, 70, 54);
        add(lblNewLabel);

        JLabel label = new JLabel("\uBA64\uBC84 \uCD94\uAC00");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("a옛날사진관3", Font.PLAIN, 35));
        label.setBackground(Color.BLACK);
        label.setBounds(149, 149, 174, 54);
        add(label);

        JLabel label_1 = new JLabel("\uBA64\uBC84 \uBCF4\uAE30");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 35));
        label_1.setBackground(Color.BLACK);
        label_1.setBounds(149, 321, 174, 54);
        add(label_1);

        JButton btnNewButton = new JButton("Push1");
        btnNewButton.setFont(new Font("a옛날사진관3", Font.PLAIN, 20));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setBounds(166, 237, 105, 44);
        add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jframe.setBounds(100,100,530,600);
                jframe.setContentPane(new SetMember(jframe));
            }
        });
        JButton btnPush = new JButton("Push2");
        btnPush.setForeground(Color.WHITE);
        btnPush.setFont(new Font("a옛날사진관3", Font.PLAIN, 20));
        btnPush.setBackground(Color.BLACK);
        btnPush.setBounds(166, 408, 105, 44);
        add(btnPush);
        btnPush.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jframe.setBounds(100,100,500,600);
                jframe.setContentPane(new StaffList(jframe));
            }
        });

    }
}
