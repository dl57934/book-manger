package 도서관리프로그램;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class relation_Book extends JPanel {

    /**
     * Create the panel.
     */
    public relation_Book(JFrame jFrame ) {

        setBackground(Color.BLACK);
        setLayout(null);
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(0, 255, 501, 127);
        add(panel);
        panel.setLayout(null);

        JButton button_1 = new JButton("push1");//책등록
        button_1.setBounds(313, 49, 103, 31);
        button_1.setForeground(Color.BLACK);
        button_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 19));
        button_1.setBackground(Color.WHITE);
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setBounds(100,100,500,600);
                jFrame.setContentPane(new AddBook(jFrame));
            }
        });

        panel.add(button_1);

        JLabel label_3 = new JLabel("\uCC45 \uB4F1\uB85D");
        label_3.setForeground(Color.WHITE);
        label_3.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        label_3.setBounds(68, 43, 93, 36);
        panel.add(label_3);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.BLACK);
        panel_1.setBounds(0, 375, 501, 127);
        add(panel_1);
        panel_1.setLayout(null);

        JLabel label_2 = new JLabel("\uB4F1\uB85D\uB41C \uCC45\uD655\uC778");
        label_2.setBounds(50, 47, 162, 36);
        label_2.setForeground(Color.WHITE);
        label_2.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        panel_1.add(label_2);

        JButton button_2 = new JButton("push2"); //등록된 책확인
        button_2.setBounds(314, 52, 103, 31);
        button_2.setForeground(Color.BLACK);
        button_2.setFont(new Font("a옛날사진관3", Font.PLAIN, 19));
        button_2.setBackground(Color.WHITE);
        panel_1.add(button_2);
        button_2. addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setBounds(100,100,530,600);
                jFrame.setContentPane(new SeeBook(jFrame));
            }
        });

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.BLACK);
        panel_2.setBounds(0, 128, 501, 127);
        add(panel_2);
        panel_2.setLayout(null);

        JLabel label = new JLabel("\uCC45 \uBC18\uB0A9");
        label.setBounds(66, 42, 93, 36);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        panel_2.add(label);

        JButton button = new JButton("push3"); // 책반납
        button.setBounds(308, 48, 108, 31);
        button.setForeground(Color.BLACK);
        button.setFont(new Font("a옛날사진관3", Font.PLAIN, 19));
        button.setBackground(Color.WHITE);
        panel_2.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setBounds(100,100,480,600);
             jFrame.setContentPane(new returnBook());
            }
        });

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(Color.BLACK);
        panel_3.setBounds(0, 0, 501, 133);
        add(panel_3);
        panel_3.setLayout(null);

        JLabel lblNewLabel = new JLabel("\uCC45 \uB300\uCD9C");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel.setBounds(63, 30, 110, 55);
        panel_3.add(lblNewLabel);

        JButton btnNewButton = new JButton("push4");//책 대출
        btnNewButton.setFont(new Font("a옛날사진관3", Font.PLAIN, 19));
        btnNewButton.setForeground(Color.BLACK);
        btnNewButton.setBackground(Color.WHITE);
        btnNewButton.setBounds(311, 47, 105, 27);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setBounds(100,100,480,500);
            jFrame.setContentPane(new SelectionBurrow(jFrame));
            }
        });
        panel_3.add(btnNewButton);
        this.setFocusable(true);
    }
}
