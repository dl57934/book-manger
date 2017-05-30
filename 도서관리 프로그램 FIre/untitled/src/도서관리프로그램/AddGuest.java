package 도서관리프로그램;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class AddGuest extends JPanel {
    String name ="";
    String num="";
    String job="";
    String fusion="";
    /**
     * Create the panel.
     */
    FileWriter fileWriter;
    public AddGuest(JFrame jFrame) {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("\uAC8C\uC2A4\uD2B8 \uBA64\uBC84\uCD94\uAC00");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(118, 35, 205, 51);
        add(lblNewLabel);

        JLabel label = new JLabel("\uC774\uB984");
        label.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label.setBackground(Color.BLACK);
        label.setForeground(Color.WHITE);
        label.setBounds(191, 101, 62, 42);
        add(label);

        JTextArea textArea = new JTextArea();
        textArea.setForeground(Color.BLACK);
        textArea.setBackground(Color.WHITE);
        textArea.setBounds(118, 169, 205, 24);
        add(textArea);
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    name = textArea.getText();
                    System.out.println(name);
                }
            }
        });
        JLabel label_1 = new JLabel("\uB3C4\uC11C\uAD00 \uBC88\uD638(7\uC790\uB9AC)");
        label_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_1.setForeground(Color.WHITE);
        label_1.setBounds(118, 234, 219, 51);
        add(label_1);

        JTextArea textArea_1 = new JTextArea();
        textArea_1.setForeground(Color.BLACK);
        textArea_1.setBackground(Color.WHITE);
        textArea_1.setBounds(118, 303, 205, 24);
        add(textArea_1);
        textArea_1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    num = textArea_1.getText();
                    System.out.println(num);
                    if (num.length() >= 8) {
                        jFrame.setBounds(100, 100, 480, 500);
                        jFrame.setContentPane(new OverNumber());
                    }
                }
            }
        });
        JLabel label_2 = new JLabel("\uC9C1\uC5C5");
        label_2.setForeground(Color.WHITE);
        label_2.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_2.setBounds(191, 354, 62, 51);
        add(label_2);

        JTextArea textArea_2 = new JTextArea();
        textArea_2.setForeground(Color.BLACK);
        textArea_2.setBackground(Color.WHITE);
        textArea_2.setBounds(118, 421, 205, 24);
        add(textArea_2);
        textArea_2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    job = textArea_2.getText();
                    System.out.println(job);
                    fusion = "\n"+name+"/"+num + "/"+job;
                    System.out.println(fusion);
                    try{
                        fileWriter = new FileWriter("게스트목록",true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        bufferedWriter.write(fusion);
                        bufferedWriter.close();
                        jFrame.setBounds(100,100,480,600);
                        jFrame.setContentPane(new completeMember());
                    }
                    catch (Exception g)
                    {
                        g.printStackTrace();
                    }
                }
            }
        });

    }
}
