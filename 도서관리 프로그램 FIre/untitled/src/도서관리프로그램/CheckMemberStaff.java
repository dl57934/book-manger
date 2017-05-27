package 도서관리프로그램;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CheckMemberStaff extends JPanel {
    JTable table;
    FileReader fileReader;
    /**
     * Create the panel.
     */
    public CheckMemberStaff() {
        setBackground(Color.BLACK);
        setLayout(new BorderLayout(0, 0));

        JLabel lblNewLabel = new JLabel("\uC2A4\uD0DC\uD504 \uBAA9\uB85D");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBackground(Color.BLACK);
        add(lblNewLabel, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane();
        add(scrollPane, BorderLayout.CENTER);

        table = new JTable();
        table.setFont(new Font("a옛날사진관3", Font.PLAIN, 15));
        table.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                },
                new String[] {
                        "이름", "교번", "직업"
                }
        ));
        scrollPane.setViewportView(table);
        table.setFont(new Font("a옛날사진관3", Font.PLAIN, 12));
        String str2[];
        try
        {
            fileReader = new FileReader("스태프목록");
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
