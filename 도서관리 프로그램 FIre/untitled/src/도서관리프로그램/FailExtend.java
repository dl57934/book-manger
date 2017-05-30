package 도서관리프로그램;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FailExtend extends JPanel {

    /**
     * Create the panel.
     */
    public FailExtend(JFrame jFrame) {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("\uC5F0\uC7A5\uBD88\uAC00\uB2A5\uD569\uB2C8\uB2E4.");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 35));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(90, 212, 283, 48);
        add(lblNewLabel);
        jFrame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    jFrame.setBounds(100,100,480,600);
                    jFrame.setContentPane(new SeeBook(jFrame,2));
                }
            }
        });
    }

}
