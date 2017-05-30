package 도서관리프로그램;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FailReturn extends JPanel {

    /**
     * Create the panel.
     */
    public FailReturn(JFrame jFrame) {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("\uBC18\uB0A9 \uBD88\uAC00\uC785\uB2C8\uB2E4.");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(112, 179, 215, 69);
        add(lblNewLabel);
       jFrame.addKeyListener(new KeyAdapter() {
           @Override
           public void keyPressed(KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER)
               {
                   jFrame.setBounds(100,100,480,580);
                   jFrame.setContentPane(new SeeBook(jFrame,1));
               }
           }
       });
    }

}
