package 도서관리프로그램;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.table.DefaultTableModel;

public class SeeBook extends JPanel {
    JTable table;
    FileReader fileReader;
    /**
     * Create the panel.
     */
    public SeeBook(JFrame jFrame) {
        setBackground(Color.BLACK);
        setLayout(new BorderLayout(0, 0));

        JLabel lblNewLabel = new JLabel("\uCC45\uBAA9\uB85D");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel.setForeground(Color.WHITE);
        add(lblNewLabel, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane();
        add(scrollPane, BorderLayout.CENTER);

        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null,"대출가능"},
                        {null, null, null,"대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null,"대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null,"대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null,"대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null,"대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null,"대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null,"대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                        {null, null, null, "대출가능"},
                },
                new String[] {
                        "\uCC45\uC81C\uBAA9", "\uCD9C\uD310\uC0AC", "\uC791\uAC00", "\uB300\uCD9C\uC5EC\uBD80"
                }
        ));
        table.getColumnModel().getColumn(0).setPreferredWidth(128);
        table.getColumnModel().getColumn(1).setPreferredWidth(82);
        table.getColumnModel().getColumn(2).setPreferredWidth(84);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);
        table.setFont(new Font("a옛날사진관3", Font.PLAIN, 12));
        scrollPane.setViewportView(table);
        String str2[];
        try
        {
            fileReader = new FileReader("책목록");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = "";
            int i = 0;
            while ((str=bufferedReader.readLine()) != null) {
                str2 = str.split("/");
                table.setValueAt(str2[0],i,0);
                table.setValueAt(str2[1],i,1);
                table.setValueAt(str2[2],i,2);
                i++;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

