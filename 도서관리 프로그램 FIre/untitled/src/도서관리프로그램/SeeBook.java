package 도서관리프로그램;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.table.DefaultTableModel;

public class SeeBook extends JPanel  {
    JTable table;
    FileReader fileReader;
    String bookname;
    String canBurrow = "대출가능";
    String cantBurrow = "대출불가";
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
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null,null},
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null,null},
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
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
                table.setValueAt(str2[3],i,3);
                i++;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public SeeBook(JFrame jFrame,int i) {
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
                new Object[][] {{null, null, null,null},
                        {null, null, null, null},
                        {null, null, null,null},
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null,null},
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null,null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
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
        String canBurrow="대출가능";
        String extend = "연장";
        String cantBurrow="대출중";
        //대출
        if(i==0) {
            table.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = table.getSelectedRow();
                    int column = table.getSelectedColumn();
                    System.out.println(row + "행 " + column + "열 " + table.getValueAt(row, column) + " 선택했음");
                    if (table.getValueAt(row, 3).equals(canBurrow)) {
                        System.out.println("대출 가능합니다");
                        jFrame.setBounds(100, 100, 480, 480);
                        jFrame.setContentPane(new CheckBurrow(jFrame, table.getValueAt(row, 0), row));
                    } else if (table.getValueAt(row, 3).equals(cantBurrow)||table.getValueAt(row, 3).equals(extend)) {
                        System.out.println("대출 불가합니다.");
                        jFrame.setBounds(100, 100, 480, 480);
                        jFrame.setContentPane(new FailBurrow(jFrame));
                    }
                }

            });
        }
        //반납
        if(i==1)
        {
            table.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = table.getSelectedRow();
                    int column = table.getSelectedColumn();
                    System.out.println(row + "행 " + column + "열 " + table.getValueAt(row, column) + " 선택했음");
                    if (table.getValueAt(row, 3).equals(canBurrow)) {
                        System.out.println("반납불가능합니다");
                        jFrame.setBounds(100, 100, 480, 480);
                        jFrame.setContentPane(new FailReturn(jFrame));
                    } else if (table.getValueAt(row, 3).equals(cantBurrow)|| table.getValueAt(row, 3).equals(extend)) {
                        System.out.println("반납하자");
                        jFrame.setBounds(100, 100, 480, 480);
                        jFrame.setContentPane(new CheckReturnBook(jFrame, table.getValueAt(row, 0), row));
                    }
                }

            });
        }
        //연장
        if(i==2)
        {
            table.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = table.getSelectedRow();
                    int column = table.getSelectedColumn();
                    System.out.println(row + "행 " + column + "열 " + table.getValueAt(row, column) + " 선택했음");
                    if (table.getValueAt(row, 3).equals(canBurrow)|| table.getValueAt(row, 3).equals(extend)) {
                        System.out.println("연장불가능합니다");
                        jFrame.setBounds(100, 100, 480, 480);
                        jFrame.setContentPane(new FailExtend(jFrame));
                    } else if (table.getValueAt(row, 3).equals(cantBurrow)) {
                        System.out.println("연장하자");
                        jFrame.setBounds(100, 100, 480, 480);
                        jFrame.setContentPane(new CheckExtendBook(jFrame, table.getValueAt(row, 0), row));
                    }
                }

            });
        }
            try
        {
            fileReader = new FileReader("책목록");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = "";
            int j = 0;
            while ((str=bufferedReader.readLine()) != null) {
                str2 = str.split("/");
                table.setValueAt(str2[0],j,0);
                table.setValueAt(str2[1],j,1);
                table.setValueAt(str2[2],j,2);
                table.setValueAt(str2[3],j,3);
                j++;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}

