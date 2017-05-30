package 도서관리프로그램;

/**
 * Created by dl579 on 2017-05-26.
 */

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class returnBook extends JPanel {
        /**
         * Create the panel.
         */
        String name="";
        int i=0;
        public returnBook(JFrame jFrame,int j) {
            CheckMember jtable = new CheckMember();
            setBackground(Color.BLACK);
            setLayout(null);

            JLabel lblNewLabel = new JLabel("\uCC45 \uBC18\uB0A9");
            lblNewLabel.setBackground(Color.BLACK);
            lblNewLabel.setForeground(Color.WHITE);
            lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
            lblNewLabel.setBounds(179, 32, 105, 36);
            add(lblNewLabel);

            JLabel label = new JLabel("\uBE4C\uB9B0 \uC0AC\uB78C");
            label.setForeground(Color.WHITE);
            label.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
            label.setBackground(Color.BLACK);
            label.setBounds(166, 150, 105, 43);
            add(label);

            JTextArea textArea_1 = new JTextArea();
            textArea_1.setBounds(131, 200, 181, 24);
            add(textArea_1);

            JLabel label_1 = new JLabel("\uD68C\uC6D0 \uBC88\uD638");
            label_1.setForeground(Color.WHITE);
            label_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
            label_1.setBackground(Color.BLACK);
            label_1.setBounds(166, 367, 105, 43);
            add(label_1);

            JTextArea textArea_2 = new JTextArea();
            textArea_2.setBounds(131, 422, 181, 24);
            add(textArea_2);
            textArea_2.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode()==KeyEvent.VK_ENTER)
                    {
                        jFrame.setBounds(100,100,530,600);
                        jFrame.setContentPane(new SeeBook(jFrame,1));
                    }
                }
            });

        }

    }
