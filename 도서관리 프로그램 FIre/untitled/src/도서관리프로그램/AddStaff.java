package 도서관리프로그램;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class AddStaff extends JPanel {
String name;
String num;
String High;
String fusion;
    /**
     * Create the panel.
     */
    FileWriter fileWriter;
    public AddStaff(JFrame jFrame) {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel label = new JLabel("\uC2A4\uD0DC\uD504 \uBA64\uBC84\uCD94\uAC00");
        label.setBounds(135, 43, 205, 36);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        label.setBackground(Color.BLACK);
        add(label);

        JLabel label_1 = new JLabel("\uC774\uB984");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_1.setBackground(Color.BLACK);
        label_1.setBounds(200, 119, 62, 42);
        add(label_1);

        JTextArea textArea = new JTextArea();
        textArea.setForeground(Color.BLACK);
        textArea.setBackground(Color.WHITE);
        textArea.setBounds(135, 182, 205, 24);
        add(textArea);
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    name = textArea.getText();
                    System.out.println(name);

                }
            }
        });
        JTextArea textArea_1 = new JTextArea();
        textArea_1.setForeground(Color.BLACK);
        textArea_1.setBackground(Color.WHITE);
        textArea_1.setBounds(135, 308, 205, 24);
        add(textArea_1);
        textArea_1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    num = textArea_1.getText();
                    System.out.println(num);
                    if(num.length() >= 8)
                    {
                        jFrame.setBounds(100, 100, 480, 500);
                        jFrame.setContentPane(new OverNumber());
                    }
                }
            }
        });
        JLabel label_2 = new JLabel("\uB3C4\uC11C\uAD00 \uBC88\uD638(7\uC790\uB9AC)");
        label_2.setForeground(Color.WHITE);
        label_2.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_2.setBounds(137, 233, 219, 51);
        add(label_2);

        JLabel label_3 = new JLabel("\uC9C1\uC5C5");
        label_3.setForeground(Color.WHITE);
        label_3.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_3.setBounds(200, 344, 62, 51);
        add(label_3);

        JTextArea textArea_2 = new JTextArea();
        textArea_2.setForeground(Color.BLACK);
        textArea_2.setBackground(Color.WHITE);
        textArea_2.setBounds(135, 414, 205, 24);
        add(textArea_2);
        textArea_2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             if(e.getKeyCode() == KeyEvent.VK_ENTER)
             {
                 High = textArea_2.getText();
                 System.out.println(High);
                 fusion = "\n"+name+"/"+num + "/"+High;
                 System.out.println(fusion);
                 try{
                     fileWriter = new FileWriter("스태프목록",true);
                     BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                     bufferedWriter.write(fusion);
                     bufferedWriter.close();
                     jFrame.setBounds(100,100,480,600);
                     jFrame.setContentPane(new completeMember());
                 }
                 catch(Exception g)
                 {
                     g.printStackTrace();
                 }
             }
            }
        });

    }

}
