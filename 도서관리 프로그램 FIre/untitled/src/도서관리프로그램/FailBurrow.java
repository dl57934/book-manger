package 도서관리프로그램;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FailBurrow extends JPanel {

    /**
     * Create the panel.
     */
    public FailBurrow(JFrame jFrame) {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("\uC774\uBBF8 \uB300\uCD9C\uC911\uC785\uB2C8\uB2E4");
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel.setBounds(108, 178, 239, 64);
        add(lblNewLabel);
        jFrame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    jFrame.setBounds(100,100,480,600);
                     jFrame.setContentPane(new SeeBook(jFrame,0));
                }
            }
        });
    }

}
