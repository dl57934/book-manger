package 도서관리프로그램;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CompleteReturn extends JPanel {
    /**
     * Create the panel.
     */
    public CompleteReturn(JFrame jFrame) {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("\uBC18\uB0A9\uC644\uB8CC");
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel.setBounds(154, 188, 134, 58);
        add(lblNewLabel);
        jFrame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                jFrame.setBounds(100,100,530,600);
                jFrame.setContentPane(new SeeBook(jFrame,1));
            }
        });

    }

}
