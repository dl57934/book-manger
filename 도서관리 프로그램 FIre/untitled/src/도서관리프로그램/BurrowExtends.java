package 도서관리프로그램;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;

public class BurrowExtends extends JPanel {

    /**
     * Create the panel.
     */
    public BurrowExtends(JFrame jFrame,int i) {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel label = new JLabel("\uCC45 \uC5F0\uC7A5");
        label.setBounds(181, 36, 80, 42);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label.setBackground(Color.BLACK);
        add(label);

        JLabel label_1 = new JLabel("\uCC45 \uC81C\uBAA9");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_1.setBackground(Color.BLACK);
        label_1.setBounds(181, 106, 92, 43);
        add(label_1);

        JTextArea textArea = new JTextArea();
        textArea.setForeground(Color.BLACK);
        textArea.setBackground(Color.WHITE);
        textArea.setBounds(121, 310, 205, 24);
        add(textArea);

        JLabel label_2 = new JLabel("\uBE4C\uB9B0 \uC0AC\uB78C");
        label_2.setForeground(Color.WHITE);
        label_2.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_2.setBackground(Color.BLACK);
        label_2.setBounds(168, 229, 105, 43);
        add(label_2);

        JTextArea textArea_1 = new JTextArea();
        textArea_1.setForeground(Color.BLACK);
        textArea_1.setBackground(Color.WHITE);
        textArea_1.setBounds(121, 179, 205, 24);
        add(textArea_1);

        JLabel label_3 = new JLabel("\uD68C\uC6D0 \uBC88\uD638");
        label_3.setForeground(Color.WHITE);
        label_3.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_3.setBackground(Color.BLACK);
        label_3.setBounds(168, 366, 105, 43);
        add(label_3);

        JTextArea textArea_2 = new JTextArea();
        textArea_2.setForeground(Color.BLACK);
        textArea_2.setBackground(Color.WHITE);
        textArea_2.setBounds(121, 444, 205, 24);
        add(textArea_2);

        if(i == 0) //0은 학생
        {

        }
        if(i==1) //1은 게스트
        {

        }
        if(i==2) //2는 스태프
        {

        }
    }
}
