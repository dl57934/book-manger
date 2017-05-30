package 도서관리프로그램;

import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CompleteBurrow extends JPanel {

    /**
     * Create the panel.
     */
    public CompleteBurrow(JFrame jFrame) {
        setBackground(Color.BLACK);
        setLayout(null);
        JLabel lblNewLabel = new JLabel("\uB300\uCD9C \uC644\uB8CC");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 40));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setBounds(141, 194, 174, 48);
        add(lblNewLabel);
       jFrame.addKeyListener(new KeyAdapter() {
           @Override
           public void keyPressed(KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER)
               {
                   jFrame.setBounds(100,100,530,600);
                   jFrame.setContentPane(new SeeBook(jFrame,0));
               }
           }
       });
    }

}
