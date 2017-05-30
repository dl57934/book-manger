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

public class CheckBurrow extends JPanel {
FileWriter fileWriter;
FileWriter fileWriter2;
FileReader fileReader;
FileReader fileReader2;
String str="";
String str2[];
String str3="";
    String str4="";
    /**
     * Create the panel.
     */
    public CheckBurrow(JFrame jFrame,Object name,int row) {
        SeeBook seeBook = new SeeBook(jFrame,0);
        setBackground(Color.BLACK);
        setLayout(null);
        JLabel lblNewLabel = new JLabel(name+"을(를)빌리 시겠습니까?");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 18));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(34, 50, 402, 76);
        add(lblNewLabel);

        JButton btnNewButton = new JButton("YES");
        btnNewButton.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setBounds(14, 204, 168, 76);
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
                            str3+="대출중";
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
                jFrame.setContentPane(new CompleteBurrow(jFrame));
            }
        });
        JButton btnNo = new JButton("NO");
        btnNo.setForeground(Color.WHITE);
        btnNo.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        btnNo.setBackground(Color.BLACK);
        btnNo.setBounds(257, 204, 168, 76);
        add(btnNo);
        btnNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setBounds(100,100,530,600);
                jFrame.setContentPane(new SeeBook(jFrame,0));
            }
        });

    }
}
