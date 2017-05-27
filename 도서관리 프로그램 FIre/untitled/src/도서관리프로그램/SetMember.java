package 도서관리프로그램; /**
 * Created by dl579 on 2017-05-24.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetMember extends JPanel {

    /**
     * Create the panel.
     */
    public SetMember(JFrame jFrame) {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("\uBA64\uBC84 \uCD94\uAC00");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(190, 0, 113, 64);
        add(lblNewLabel);

        JButton btnNewButton = new JButton("\uD559\uC0DD \uCD94\uAC00");
        btnNewButton.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        btnNewButton.setForeground(Color.BLACK);
        btnNewButton.setBackground(Color.WHITE);
        btnNewButton.setBounds(109, 116, 280, 64);
        add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setBounds(100, 100, 450, 500);
                jFrame.setContentPane(new AddStudent(jFrame));
            }
        });
        JButton button = new JButton("\uC2A4\uD0DC\uD504 \uCD94\uAC00");
        button.setBackground(Color.WHITE);
        button.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        button.setBounds(109, 251, 280, 64);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setBounds(100, 100, 480, 550);
                jFrame.setContentPane(new AddStaff(jFrame));
            }
        });
        JButton button_1 = new JButton("\uAC8C\uC2A4\uD2B8 \uCD94\uAC00");
        button_1.setBackground(Color.WHITE);
        button_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        button_1.setBounds(109, 389, 280, 64);
        add(button_1);
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setBounds(100, 100, 450, 550);
                jFrame.setContentPane(new AddGuest(jFrame));
            }
        });
        this.setFocusable(true);
    }
}
