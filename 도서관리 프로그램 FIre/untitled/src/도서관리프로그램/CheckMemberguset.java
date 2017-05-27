package 도서관리프로그램;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CheckMemberguset extends JPanel {
    private JTable table;
    FileReader fileReader;
    /**
     * Create the panel.
     */
    public CheckMemberguset() {
        setBackground(Color.BLACK);
        setLayout(new BorderLayout(0, 0));

        JLabel lblNewLabel = new JLabel("\uAC8C\uC2A4\uD2B8 \uBAA9\uB85D");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        add(lblNewLabel, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane();
        add(scrollPane, BorderLayout.CENTER);

        table = new JTable();
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
                        "이름", "번호", "직업"
                }
        ));
        table.setFont(new Font("a옛날사진관3", Font.PLAIN, 12));
        scrollPane.setViewportView(table);
        String str2[];
        try
        {
            fileReader = new FileReader("게스트목록");
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
