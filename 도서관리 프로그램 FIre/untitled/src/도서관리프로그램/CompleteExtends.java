package 도서관리프로그램;

        import javax.swing.*;
        import java.awt.Color;
        import java.awt.Font;
        import java.awt.event.KeyAdapter;
        import java.awt.event.KeyEvent;

public class CompleteExtends extends JPanel {

    /**
     * Create the panel.
     */
    public CompleteExtends(JFrame jFrame) {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("\uC5F0\uC7A5 \uC644\uB8CC");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBackground(Color.BLACK);
        lblNewLabel.setBounds(160, 205, 133, 46);
        add(lblNewLabel);
        jFrame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    jFrame.setBounds(100,100,530,600);
                    jFrame.setContentPane(new SeeBook(jFrame,2));
                }
            }
        });
    }

}
