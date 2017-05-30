package 도서관리프로그램;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CheckExtendBook extends JPanel {
String str2[];
String str3="";
String str4="";
String str="";
FileReader fileReader2;
FileReader fileReader;
FileWriter fileWriter;
 FileWriter fileWriter2;
    /**
     * Create the panel.
     */
    public CheckExtendBook(JFrame jFrame, Object name, int row) {
        setBackground(Color.BLACK);
        setLayout(null);
        SeeBook seeBook = new SeeBook(jFrame);
        JLabel lblNewLabel = new JLabel("\uB300\uCD9C \uC5F0\uC7A5");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 35));
        lblNewLabel.setBounds(147, 68, 156, 41);
        add(lblNewLabel);

        JButton btnNewButton = new JButton("YES");
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setFont(new Font("a옛날사진관3", Font.PLAIN, 23));
        btnNewButton.setBounds(74, 222, 105, 58);
        add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(seeBook.table.getValueAt(row,3));
                try
                {
                    fileReader2 = new FileReader("책목록2");
                    BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
                    fileWriter = new FileWriter("책목록");
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    while ((str=bufferedReader2.readLine()) != null) {
                        str2 = str.split("/");
                        if(seeBook.table.getValueAt(row,0).equals(str2[0]))
                        {
                            System.out.println("일치");
                            for(int i = 0;i<3;i++)
                                str3+=str2[i]+"/";
                            str3+="연장";
                            bufferedWriter.append(str3);
                            bufferedWriter.newLine();
                        }
                        else
                        {
                            System.out.println("일치X");
                            bufferedWriter.append(str);
                            bufferedWriter.newLine();
                        }
                    }
                    bufferedWriter.close();
                    bufferedReader2.close();
                    fileReader = new FileReader("책목록");
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    fileWriter2 = new FileWriter("책목록2");
                    BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);
                    while ((str4 =bufferedReader.readLine()) != null) {
                        System.out.println("Fire");
                        bufferedWriter2.append(str4);
                        bufferedWriter2.newLine();
                    }
                    bufferedWriter2.close();
                    bufferedReader.close();
                }
                catch (Exception g)
                {
                    g.printStackTrace();
                }
                jFrame.setBounds(100,100,450,450);
                jFrame.setContentPane(new CompleteExtends(jFrame));
            }
        });
        JButton btnNo = new JButton("NO");
        btnNo.setForeground(Color.WHITE);
        btnNo.setFont(new Font("a옛날사진관3", Font.PLAIN, 23));
        btnNo.setBackground(Color.BLACK);
        btnNo.setBounds(264, 222, 105, 58);
        add(btnNo);
         btnNo.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 jFrame.setBounds(100,100,530,600);
                 jFrame.setContentPane(new SeeBook(jFrame,2));
             }
         });
    }

}
