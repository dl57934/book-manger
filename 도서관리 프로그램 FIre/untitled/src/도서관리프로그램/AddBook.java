package 도서관리프로그램;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class AddBook extends JPanel {
String bookName="";
String author="";
String whoMade="";
String fusion="";
String str2="";
FileWriter writer = null;
FileReader fileReader ;
FileWriter writer2;
    /**
     * Create the panel.
     */
    public AddBook(JFrame jFrame) {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("\uCC45 \uCD94\uAC00");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setBounds(186, 26, 87, 42);
        add(lblNewLabel);

        JLabel label = new JLabel("\uCC45 \uC774\uB984");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label.setBackground(Color.BLACK);
        label.setBounds(186, 106, 87, 42);
        add(label);

        JLabel label_1 = new JLabel("\uC791\uAC00");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_1.setBackground(Color.BLACK);
        label_1.setBounds(199, 217, 87, 42);
        add(label_1);

        JLabel label_2 = new JLabel("\uCD9C\uD310\uC0AC");
        label_2.setForeground(Color.WHITE);
        label_2.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_2.setBackground(Color.BLACK);
        label_2.setBounds(199, 345, 87, 42);
        add(label_2);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(124, 170, 213, 24);
        add(textArea);
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()== KeyEvent.VK_ENTER) {
                    bookName = textArea.getText();
                    System.out.println(bookName);
                }
            }
        });

        JTextArea textArea_1 = new JTextArea();
        textArea_1.setBounds(124, 285, 213, 24);
        add(textArea_1);
        textArea_1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()== KeyEvent.VK_ENTER) {
                    author = textArea_1.getText();
                    System.out.println(author);
                }
            }
        });
        JTextArea textArea_2 = new JTextArea();
        textArea_2.setBounds(124, 411, 213, 24);
        add(textArea_2);
        textArea_2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()== KeyEvent.VK_ENTER) {
                    whoMade = textArea_2.getText();
                    System.out.println(whoMade);
                    fusion = bookName +"/"+author + "/"+whoMade+"/"+"대출가능";
                    System.out.println(fusion);
                    try
                    {
                        writer = new FileWriter("책목록",true);
                        BufferedWriter bufferedWriter = new BufferedWriter(writer);
                        bufferedWriter.newLine();
                        bufferedWriter.write(fusion);
                        bufferedWriter.close();
                        jFrame.setBounds(100,100,480,600);
                        jFrame.setContentPane(new CompleteAddBook());
                        fileReader = new FileReader("책목록");
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        writer2 = new FileWriter("책목록2");
                        BufferedWriter bufferedWriter1 = new BufferedWriter(writer2);
                        while((str2=bufferedReader.readLine())!=null)
                        {
                            bufferedWriter1.append(str2);
                            bufferedWriter1.newLine();
                        }
                        bufferedReader.close();
                        bufferedWriter1.close();
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
