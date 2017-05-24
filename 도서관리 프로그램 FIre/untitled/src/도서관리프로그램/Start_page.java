package 도서관리프로그램; /**
 * Created by dl579 on 2017-05-24.
 */

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Start_page extends JFrame {

    private JPanel contentPane;


    relation_Book book1 = new relation_Book();
    relationgpeople people = new relationgpeople();
    relationpolicy policy = new relationpolicy();

    public Start_page() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 513);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(0, 0, 482, 122);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("book management");
        lblNewLabel.setBounds(49, 29, 367, 48);
        panel.add(lblNewLabel);
        lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.ITALIC, 40));

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.BLACK);
        panel_1.setBounds(0, 121, 482, 122);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("\uCC45\uACFC \uAD00\uB828\uD574\uC11C");
        lblNewLabel_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 29));
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setBounds(49, 32, 195, 53);
        panel_1.add(lblNewLabel_1);

        JButton btnNewButton = new JButton("push1");
        btnNewButton.setBackground(Color.WHITE);
        btnNewButton.setForeground(Color.BLACK);
        btnNewButton.setFont(new Font("a옛날사진관3", Font.PLAIN, 19));
        btnNewButton.setBounds(296, 48, 105, 27);
        panel_1.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(book1);
                setBounds(100, 100, 500, 530);
                requestFocus();
            }
        });
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.BLACK);
        panel_2.setBounds(0, 243, 482, 112);
        contentPane.add(panel_2);
        panel_2.setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("\uBA64\uBC84\uC640 \uAD00\uB828\uD574\uC11C");
        lblNewLabel_2.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel_2.setBounds(32, 24, 227, 62);
        lblNewLabel_2.setForeground(Color.WHITE);
        panel_2.add(lblNewLabel_2);

        JButton btnNewButton_1 = new JButton("push2");
        btnNewButton_1.setBackground(Color.WHITE);
        btnNewButton_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 19));
        btnNewButton_1.setBounds(298, 46, 105, 27);
        panel_2.add(btnNewButton_1);
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(people);
                setBounds(100, 100, 500, 530);
                requestFocus();
            }
        });

        JPanel panel_3 = new JPanel();
        panel_3.setBackground(Color.BLACK);
        panel_3.setBounds(0, 354, 482, 112);
        contentPane.add(panel_3);
        panel_3.setLayout(null);

        JLabel lblNewLabel_3 = new JLabel("\uC815\uCC45\uACFC \uAD00\uB828");
        lblNewLabel_3.setForeground(Color.WHITE);
        lblNewLabel_3.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel_3.setBackground(Color.WHITE);
        lblNewLabel_3.setBounds(40, 27, 184, 48);
        panel_3.add(lblNewLabel_3);
        JButton btnPush = new JButton("push3");
        btnPush.setForeground(Color.BLACK);
        btnPush.setBackground(Color.WHITE);
        btnPush.setFont(new Font("a옛날사진관3", Font.PLAIN, 19));
        btnPush.setBounds(302, 42, 105, 27);
        panel_3.add(btnPush);
        btnPush.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(policy);
                setBounds(100, 100, 500, 530);
                requestFocus();
            }
        });
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE)
                setBounds(100, 100, 500, 530);
                    setContentPane(contentPane);
            }
        });
        this.setFocusable(true);
        setVisible(true);
    }
}
