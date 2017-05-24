package 도서관리프로그램;

        import javax.swing.JPanel;
        import java.awt.Color;
        import javax.swing.JLabel;
        import java.awt.Font;
        import java.io.BufferedReader;
        import java.io.FileNotFoundException;
        import java.io.FileReader;
        import javax.swing.JTextArea;
        import javax.swing.JScrollBar;

public class SeeBook extends JPanel {

    /**
     * Create the panel.
     */
    public SeeBook()  {

        setBackground(Color.BLACK);
        setLayout(null);

        JScrollBar scrollBar = new JScrollBar();
        add(scrollBar);
        scrollBar.setForeground(Color.BLACK);
        scrollBar.setBackground(Color.WHITE);
        scrollBar.setBounds(472, 63, 21, 478);

        JLabel lblNewLabel = new JLabel("\uCC45 \uBAA9\uB85D");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel.setBounds(202, 12, 106, 51);
        lblNewLabel.setForeground(Color.WHITE);
        add(lblNewLabel);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(14, 63, 479, 478);
        add(textArea);

    }
}