package 도서관리프로그램;

/**
 * Created by dl579 on 2017-05-25.
 */

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class StaffList extends JPanel
{
        public StaffList(JFrame jFrame) {
            setBackground(Color.BLACK);
            setLayout(null);

            JLabel lblStaffList = new JLabel("Member List");
            lblStaffList.setFont(new Font("a옛날사진관3", Font.PLAIN, 35));
            lblStaffList.setForeground(Color.WHITE);
            lblStaffList.setBackground(Color.BLACK);
            lblStaffList.setBounds(140, 24, 250, 68);
            add(lblStaffList);
            JButton btnNewButton = new JButton("\uD559\uC0DD\uBAA9\uB85D");
            btnNewButton.setBackground(Color.BLACK);
            btnNewButton.setForeground(Color.WHITE);
            btnNewButton.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
            btnNewButton.setBounds(128, 121, 215, 68);
            add(btnNewButton);   //학생
            btnNewButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                 jFrame.setContentPane(new CheckMember());
                    jFrame.setBounds(100, 100, 530, 600);
                }
            });
            JButton button = new JButton("\uC2A4\uD0DC\uD504\uBAA9\uB85D");
            button.setForeground(Color.WHITE);
            button.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
            button.setBackground(Color.BLACK);
            button.setBounds(128, 270, 215, 68);
            add(button);//스태프
            button.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 jFrame.setContentPane(new CheckMemberStaff());
                 jFrame.setBounds(100, 100, 530, 600);
                             }
              });
            JButton button_1 = new JButton("\uAC8C\uC2A4\uD2B8\uBAA9\uB85D");
            button_1.setForeground(Color.WHITE);
            button_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
            button_1.setBackground(Color.BLACK);
            button_1.setBounds(128, 425, 215, 68);
            add(button_1);//게스트목록
            button_1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jFrame.setContentPane(new CheckMemberguset());
                    jFrame.setBounds(100, 100, 530, 600);
                }
            });
        }
    }

