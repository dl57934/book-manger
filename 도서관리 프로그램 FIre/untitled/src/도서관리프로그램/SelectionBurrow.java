package 도서관리프로그램;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectionBurrow extends JPanel {

    /**
     * Create the panel.
     */
    public SelectionBurrow(JFrame jFrame,int i) {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel label_1 = new JLabel("\uCC45 \uB300\uCD9C");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        label_1.setBackground(Color.BLACK);
        label_1.setBounds(169, 50, 106, 46);
        add(label_1);

        JLabel label_2 = new JLabel("\uCC45 \uC5F0\uC7A5");
        label_2.setForeground(Color.WHITE);
        label_2.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        label_2.setBackground(Color.BLACK);
        label_2.setBounds(169, 251, 106, 46);
        add(label_2);

        JButton btnPush = new JButton("PUSH1");
        btnPush.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        btnPush.setForeground(Color.WHITE);
        btnPush.setBackground(Color.BLACK);
        btnPush.setBounds(136, 332, 174, 60);
        add(btnPush);
        btnPush.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            if(i== 0)
            {
                jFrame.setBounds(100,100,480,580);
                jFrame.setContentPane(new BurrowExtends(jFrame,i));
            }
                if (i==1)
                {
                    jFrame.setBounds(100,100,480,580);
                    jFrame.setContentPane(new BurrowExtends(jFrame,i));
                }
                if(i==2)
                {
                    jFrame.setBounds(100,100,480,580);
                    jFrame.setContentPane(new BurrowExtends(jFrame,i));
                }
            }
        });
        JButton button = new JButton("PUSH2");
        button.setForeground(Color.WHITE);
        button.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        button.setBackground(Color.BLACK);
        button.setBounds(136, 137, 174, 60);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(i==0)
                {
                    jFrame.setBounds(100,100,480,580);
                    jFrame.setContentPane(new BurrowBookStudent(jFrame));
                }
                else if(i == 1)
                {
                    jFrame.setBounds(100,100,480,580);
                    jFrame.setContentPane(new BurrowBookGuest(jFrame));
                }
                else if (i==2)
                {
                    jFrame.setBounds(100,100,480,580);
                    jFrame.setContentPane(new BurrowBookStaff(jFrame));
                }
            }
        });

    }
}
