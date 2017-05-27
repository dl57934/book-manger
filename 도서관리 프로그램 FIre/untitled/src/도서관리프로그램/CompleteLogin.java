package 도서관리프로그램;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CompleteLogin extends JPanel {

    /**
     * Create the panel.
     */
    public CompleteLogin(JFrame jFrame,String name) {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel(name+" 환영합니다");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 40));
        lblNewLabel.setBounds(14, 166, 380, 103);
        add(lblNewLabel);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                    jFrame.setContentPane(new BurrowBookStudent(jFrame));
            }
        });

    }

}
