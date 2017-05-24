package 도서관리프로그램;

        import javax.swing.*;
        import java.awt.Color;
        import java.awt.Font;
        import java.io.BufferedReader;
        import java.io.*;

public class SeeBook extends JPanel {

    /**
     * Create the panel.
     */
    public SeeBook()  {
        FileReader fileReader =null;
        setBackground(Color.BLACK);
        setLayout(null);

        JScrollBar scrollBar = new JScrollBar();

        scrollBar.setForeground(Color.BLACK);
        scrollBar.setBackground(Color.WHITE);
        scrollBar.setBounds(472, 63, 21, 478);

        JLabel lblNewLabel = new JLabel("\uCC45 \uBAA9\uB85D");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel.setBounds(202, 12, 106, 51);
        lblNewLabel.setForeground(Color.WHITE);
        add(lblNewLabel);
        JSlider slider = new JSlider();
        slider.setBounds(14, 515, 457, 26);
        JTextArea textArea = new JTextArea();
        textArea.setBounds(14, 63, 500, 600);
        textArea.add(slider);
        add(textArea);
        textArea.add(scrollBar);
        try
        {
            fileReader = new FileReader("책목록");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine())!=null) {
                textArea.append(str+"\n");
                System.out.println(str);
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}