package 도서관리프로그램;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BurrowBookStaff extends JPanel {
       String name ;
       String memberNum;
       int i = 0;
    /**
     * Create the panel.
     */
    public BurrowBookStaff(JFrame jFrame) {
        CheckMemberStaff checkMember = new CheckMemberStaff();
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("\uC2A4\uD0DC\uD504 \uB300\uCD9C");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel.setBounds(130, 24, 165, 47);
        add(lblNewLabel);

        JLabel label = new JLabel("\uC774\uB984");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        label.setBounds(167, 106, 77, 47);
        add(label);

        JLabel label_1 = new JLabel("\uAD50\uBC88");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        label_1.setBounds(167, 254, 77, 47);
        add(label_1);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(107, 187, 201, 24);
        add(textArea);
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                i=0;
            if(e.getKeyCode() == KeyEvent.VK_ENTER)
            {
                name = textArea.getText();
                System.out.println(name);
                while(true)
                {
                    System.out.println(checkMember.table.getValueAt(i,0));
                    if( checkMember.table.getValueAt(i,0).equals(name)) {
                        System.out.println("일치합니다");

                        break;
                    }
                    else if(checkMember.table.getValueAt(i,0)==null)
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
        JTextArea textArea_1 = new JTextArea();
        textArea_1.setBounds(107, 349, 201, 24);
        add(textArea_1);
        textArea_1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                i=0;
               if(e.getKeyCode() == KeyEvent.VK_ENTER)
               {
                   memberNum = textArea_1.getText();
                   System.out.println(memberNum);
                   while(true) {
                       if (checkMember.table.getValueAt(i, 1).equals(memberNum)) {
                           System.out.println("일치합니다");
                           jFrame.setBounds(100,100,450,480);
                           jFrame.setContentPane(new CompleteLogin(jFrame,name));
                           break;
                       }
                       else if(checkMember.table.getValueAt(i,1)==null)
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

    }
}
