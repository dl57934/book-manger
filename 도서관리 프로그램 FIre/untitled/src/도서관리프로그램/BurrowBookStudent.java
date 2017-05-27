package 도서관리프로그램;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class BurrowBookStudent extends JPanel {
    String  bookName;
    String  name;
    String  membernum;
    int i =0;
    /**
     * Create the panel.
     */
    public BurrowBookStudent(JFrame jFrame) {

        CheckMember jtable = new CheckMember();
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel label = new JLabel("\uCC45 \uB300\uCD9C");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label.setBackground(Color.BLACK);
        label.setBounds(183, 23, 87, 42);
        add(label);

        JTextArea textArea_1 = new JTextArea();
        textArea_1.setForeground(Color.BLACK);
        textArea_1.setBackground(Color.WHITE);
        textArea_1.setBounds(122, 200, 205, 24);
        add(textArea_1);
        textArea_1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    name = textArea_1.getText();
                    System.out.println(name);
                    while(  true) {
                        System.out.println(jtable.table.getValueAt(i,0));
                        if(jtable.table.getValueAt(i,0).equals(name))
                        {
                            System.out.println("일치합니다");
                            break;
                        }
                        else if (jtable.table.getValueAt(i,0) == null)
                        {
                            jFrame.setBounds(100,100,450,450);
                            jFrame.setContentPane(new CheckSameName());
                            break;
                        }
                        i++;
                    }

                }
            }
        });
        JTextArea textArea_2 = new JTextArea();
        textArea_2.setForeground(Color.BLACK);
        textArea_2.setBackground(Color.WHITE);
        textArea_2.setBounds(122, 406, 205, 24);
        add(textArea_2);
        textArea_2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    membernum = textArea_2.getText();
                    System.out.println(membernum);
                    while (true) {
                        System.out.println(jtable.table.getValueAt(i, 1));
                        if (jtable.table.getValueAt(i, 1).equals(membernum)) {
                            System.out.println("일치합니다");
                            jFrame.setBounds(100, 100, 450, 450);
                            jFrame.setContentPane(new CompleteLogin(jFrame,name));
                            break;
                        } else if (jtable.table.getValueAt(i, 0) == null) {
                            jFrame.setBounds(100, 100, 450, 450);
                            jFrame.setContentPane(new CheckSameName());
                            break;
                        }
                        i++;
                    }
                }
            }
        });




        JLabel label_2 = new JLabel("  이름");
        label_2.setForeground(Color.WHITE);
        label_2.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_2.setBackground(Color.BLACK);
        label_2.setBounds(170, 100, 105, 43);
        add(label_2);

        JLabel label_3 = new JLabel("\uD68C\uC6D0 \uBC88\uD638");
        label_3.setForeground(Color.WHITE);
        label_3.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_3.setBackground(Color.BLACK);
        label_3.setBounds(170, 300, 105, 43);
        add(label_3);

    }

}
