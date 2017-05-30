package 도서관리프로그램;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BurrowExtends extends JPanel {
  String name="";
  String membernum="";
  int j=0;
    /**
     * Create the panel.
     */
    public BurrowExtends(JFrame jFrame,int i) {
        CheckMember jtable = new CheckMember();
        CheckMemberStaff checkMemberStaff = new CheckMemberStaff();
        CheckMemberguset checkMemberguset =new CheckMemberguset();
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel label = new JLabel("\uCC45 \uC5F0\uC7A5");
        label.setBounds(181, 36, 80, 42);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label.setBackground(Color.BLACK);
        add(label);



        JTextArea textArea = new JTextArea();
        textArea.setForeground(Color.BLACK);
        textArea.setBackground(Color.WHITE);
        textArea.setBounds(121, 170, 205, 24);
        add(textArea);

        JLabel label_2 = new JLabel("\uBE4C\uB9B0 \uC0AC\uB78C");
        label_2.setForeground(Color.WHITE);
        label_2.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_2.setBackground(Color.BLACK);
        label_2.setBounds(168, 100, 105, 43);
        add(label_2);


        JLabel label_3 = new JLabel("\uD68C\uC6D0 \uBC88\uD638");
        label_3.setForeground(Color.WHITE);
        label_3.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
        label_3.setBackground(Color.BLACK);
        label_3.setBounds(168, 250, 105, 43);
        add(label_3);

        JTextArea textArea_2 = new JTextArea();
        textArea_2.setForeground(Color.BLACK);
        textArea_2.setBackground(Color.WHITE);
        textArea_2.setBounds(121, 350, 205, 24);
        add(textArea_2);

        if(i == 0) //0은 학생
        {
            textArea.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode() == KeyEvent.VK_ENTER)
                    {
                        name = textArea.getText();
                        System.out.println(name);
                        while(  true) {
                            System.out.println(jtable.table.getValueAt(i,0));
                            if(jtable.table.getValueAt(j,0).equals(name))
                            {
                                System.out.println("일치합니다");
                                break;
                            }
                            else if (jtable.table.getValueAt(j,0) .equals( null))
                            {
                                jFrame.setBounds(100,100,450,450);
                                jFrame.setContentPane(new CheckSameName());
                                break;
                            }
                            j++;
                        }

                    }
                }
            });


            textArea_2.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                        membernum = textArea_2.getText();
                        System.out.println(membernum);
                        while (true) {
                            System.out.println(jtable.table.getValueAt(j, 1));
                            if (jtable.table.getValueAt(j, 1).equals(membernum)) {
                                System.out.println("일치합니다");
                                jFrame.setBounds(100, 100, 450, 450);
                                jFrame.setContentPane(new CompleteLogin(jFrame,name,1));
                                break;
                            } else if (jtable.table.getValueAt(j, 0) == null) {
                                jFrame.setBounds(100, 100, 450, 450);
                                jFrame.setContentPane(new CheckSameName());
                                break;
                            }
                            j++;
                        }
                    }
                }
            });


        }
        if(i==1) //1은 게스트
        {
            textArea.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode() == KeyEvent.VK_ENTER)
                    {
                        name = textArea.getText();
                        System.out.println(name);
                        while(  true) {
                            System.out.println(checkMemberguset.table.getValueAt(i,0));
                            if(checkMemberguset.table.getValueAt(j,0).equals(name))
                            {
                                System.out.println("일치합니다");
                                break;
                            }
                            else if (checkMemberguset.table.getValueAt(j,0) .equals( null))
                            {
                                jFrame.setBounds(100,100,450,450);
                                jFrame.setContentPane(new CheckSameName());
                                break;
                            }
                            j++;
                        }

                    }
                }
            });


            textArea_2.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                        membernum = textArea_2.getText();
                        System.out.println(membernum);
                        while (true) {
                            System.out.println(checkMemberguset.table.getValueAt(j, 1));
                            if (checkMemberguset.table.getValueAt(j, 1).equals(membernum)) {
                                System.out.println("일치합니다");
                               jFrame.setBounds(100, 100, 450, 450);
                                jFrame.setContentPane(new CompleteLogin(jFrame,name,1));
                                break;
                            } else if (checkMemberguset.table.getValueAt(j, 0) == null) {
                                jFrame.setBounds(100, 100, 450, 450);
                                jFrame.setContentPane(new CheckSameName());
                                break;
                            }
                            j++;
                        }
                    }
                }
            });

        }
        if(i==2) //2는 스태프
        {
            textArea.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode() == KeyEvent.VK_ENTER)
                    {
                        name = textArea.getText();
                        System.out.println(name);
                        while(  true) {
                            System.out.println(checkMemberStaff.table.getValueAt(i,0));
                            if(checkMemberStaff.table.getValueAt(j,0).equals(name))
                            {
                                System.out.println("일치합니다");
                                break;
                            }
                            else if (checkMemberStaff.table.getValueAt(j,0) .equals( null))
                            {
                                jFrame.setBounds(100,100,450,450);
                                jFrame.setContentPane(new CheckSameName());
                                break;
                            }
                            j++;
                        }

                    }
                }
            });


            textArea_2.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                        membernum = textArea_2.getText();
                        System.out.println(membernum);
                        while (true) {
                            System.out.println(checkMemberStaff.table.getValueAt(j, 1));
                            if (checkMemberStaff.table.getValueAt(j, 1).equals(membernum)) {
                                System.out.println("일치합니다");
                                jFrame.setBounds(100, 100, 450, 450);
                                jFrame.setContentPane(new CompleteLogin(jFrame,name,1));
                                break;
                            } else if (checkMemberStaff.table.getValueAt(j, 0) == null) {
                                jFrame.setBounds(100, 100, 450, 450);
                                jFrame.setContentPane(new CheckSameName());
                                break;
                            }
                            j++;
                        }
                    }
                }
            });
        }
    }
}
