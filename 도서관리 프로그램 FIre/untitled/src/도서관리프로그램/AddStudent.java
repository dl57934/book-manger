package 도서관리프로그램;

/**
 * Created by dl579 on 2017-05-25.
 */
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class AddStudent extends JPanel {
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    String name;
    String number;
    String major;
    String fusion;
    FileWriter fileWriter;
    /**
     * Create the panel.
     */
    public AddStudent(JFrame jFrame) {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("\uD559\uC0DD\uC815\uBCF4 \uCD94\uAC00 ");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(117, 12, 186, 42);
        add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(91, 134, 219, 24);
        add(textField);
        textField.setColumns(10);
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {//이름
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                   name = textField.getText();
                   System.out.println(name);
                }
            }
        });
        textField_1 = new JTextField(); //학번
        textField_1.setColumns(10);
        textField_1.setBounds(91, 247, 219, 24);
        add(textField_1);
        textField_1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {//과
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    number = textField_1.getText();
                    System.out.println(number);
                    if(number.length() >=8 ) {
                        jFrame.setBounds(100, 100, 480, 600);
                        jFrame.setContentPane(new OverNumber());
                    }
                }
            }
        });

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(91, 349, 219, 24);
        add(textField_2);
        textField_2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                major = textField_2.getText();
                fusion = "\n"+name+"/"+number + "/"+major;
                System.out.println(fusion);
                try
                {
                    fileWriter = new FileWriter("학생목록",true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(fusion);
                    bufferedWriter.close();
                    jFrame.setBounds(100,100,480,600);
                    jFrame.setContentPane(new CompleteAddBook());
                }
                catch (Exception g)
                {
                    g.printStackTrace();
                }
            }
        });
        JLabel label = new JLabel("\uC774\uB984");
        label.setFont(new Font("a옛날사진관3", Font.PLAIN, 20));
        label.setForeground(Color.WHITE);
        label.setBounds(167, 88, 52, 24);
        add(label);

        JLabel label_1 = new JLabel("\uD559\uBC88(7\uC790\uB9AC)");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 20));
        label_1.setBounds(167, 197, 150, 24);
        add(label_1);

        JLabel label_2 = new JLabel("\uACFC");
        label_2.setForeground(Color.WHITE);
        label_2.setFont(new Font("a옛날사진관3", Font.PLAIN, 20));
        label_2.setBounds(187, 301, 32, 24);
        add(label_2);

    }
}

