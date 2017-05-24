package 도서관리프로그램; /**
 * Created by dl579 on 2017-05-24.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class relationgpeople extends JPanel {

    SetMember setMember = new SetMember();
    CheckMember checkMember = new CheckMember();
    DeleteMember deleteMember = new DeleteMember();

    Start_page page;
    public relationgpeople() {
        setBackground(Color.BLACK);
        setLayout(null);
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(0, 70, 500, 152);
        add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("\uBA64\uBC84 \uB4F1\uB85D");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 29));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(66, 55, 136, 42);
        panel.add(lblNewLabel);

        JButton btnPush = new JButton("push1");
        btnPush.setFont(new Font("a옛날사진관3", Font.PLAIN, 19));
        btnPush.setBounds(301, 66, 105, 27);
        panel.add(btnPush);
        btnPush.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             page = new Start_page();
                page.setBounds(100,100,530,600);
                page.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
                            page.dispose();
                    }
                });
             page.setContentPane(setMember);
            }
        });

        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(Color.BLACK);
        panel_1.setBounds(0, 216, 500, 152);
        add(panel_1);

        JLabel label = new JLabel("\uBA64\uBC84 \uC81C\uAC70");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("a옛날사진관3", Font.PLAIN, 29));
        label.setBounds(66, 55, 136, 42);
        panel_1.add(label);

        JButton button = new JButton("push2");
        button.setFont(new Font("a옛날사진관3", Font.PLAIN, 19));
        button.setBounds(301, 66, 105, 27);
        panel_1.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page = new Start_page();
                page.setBounds(100,100,530,600);
                page.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
                            page.dispose();
                    }
                });
                page.setContentPane(deleteMember);
            }
        });
        JPanel panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setBackground(Color.BLACK);
        panel_2.setBounds(0, 356, 500, 152);
        add(panel_2);

        JLabel label_1 = new JLabel("\uBA64\uBC84 \uD655\uC778");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 29));
        label_1.setBounds(66, 55, 136, 42);
        panel_2.add(label_1);

        JButton button_1 = new JButton("push3");
        button_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 19));
        button_1.setBounds(301, 66, 105, 27);
        panel_2.add(button_1);
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                page = new Start_page();
                page.setBounds(100,100,530,600);
                page.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
                            page.dispose();
                    }
                });
                page.setContentPane(checkMember);
            }
        });

        JLabel lblNewLabel_1 = new JLabel("\uBA64\uBC84");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 35));
        lblNewLabel_1.setBounds(194, 12, 187, 31);
        add(lblNewLabel_1);
        this.setFocusable(true);
    }

}
