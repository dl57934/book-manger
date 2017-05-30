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

public class CheckReturnBook extends JPanel {
int i =0;
String str2[],str3="",str="",str4="";
FileWriter fileWriter2,fileWriter;
FileReader fileReader, fileReader2;
    /**
     * Create the panel.
     */
    public CheckReturnBook(JFrame jFrame,Object name,int row) {
        SeeBook seeBook = new SeeBook(jFrame);

        setBackground(Color.BLACK);
        setLayout(null);
        JLabel lblNewLabel = new JLabel("\uBC18\uB0A9\uD558\uC2DC\uACA0\uC2B5\uB2C8\uAE4C?");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setBounds(103, 77, 255, 49);
        add(lblNewLabel);

        JButton btnNewButton = new JButton("YES");
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        btnNewButton.setBounds(46, 210, 142, 55);
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
                            str3+="대출가능";
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
                jFrame.setContentPane(new CompleteReturn(jFrame));
            }
        });
        JButton btnNo = new JButton("NO");
        btnNo.setForeground(Color.WHITE);
        btnNo.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        btnNo.setBackground(Color.BLACK);
        btnNo.setBounds(264, 210, 142, 55);
        add(btnNo);
        btnNo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setBounds(100,100,530,600);
                jFrame.setContentPane(new SeeBook(jFrame,1));
            }
        });
    }
}
