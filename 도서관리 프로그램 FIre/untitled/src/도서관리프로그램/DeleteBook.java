package 도서관리프로그램;

/**
 * Created by dl579 on 2017-05-26.
 */import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

    class returnBook extends JPanel {
        /**
         * Create the panel.
         */
        public returnBook() {
            setBackground(Color.BLACK);
            setLayout(null);

            JLabel lblNewLabel = new JLabel("\uCC45 \uBC18\uB0A9");
            lblNewLabel.setBackground(Color.BLACK);
            lblNewLabel.setForeground(Color.WHITE);
            lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 30));
            lblNewLabel.setBounds(179, 32, 105, 36);
            add(lblNewLabel);

            JLabel lblNewLabel_1 = new JLabel("\uCC45 \uC81C\uBAA9");
            lblNewLabel_1.setBackground(Color.BLACK);
            lblNewLabel_1.setForeground(Color.WHITE);
            lblNewLabel_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
            lblNewLabel_1.setBounds(179, 108, 92, 43);
            add(lblNewLabel_1);

            JTextArea textArea = new JTextArea();
            textArea.setBounds(131, 163, 181, 24);
            add(textArea);

            JLabel label = new JLabel("\uBE4C\uB9B0 \uC0AC\uB78C");
            label.setForeground(Color.WHITE);
            label.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
            label.setBackground(Color.BLACK);
            label.setBounds(166, 241, 105, 43);
            add(label);

            JTextArea textArea_1 = new JTextArea();
            textArea_1.setBounds(131, 296, 181, 24);
            add(textArea_1);

            JLabel label_1 = new JLabel("\uD68C\uC6D0 \uBC88\uD638");
            label_1.setForeground(Color.WHITE);
            label_1.setFont(new Font("a옛날사진관3", Font.PLAIN, 25));
            label_1.setBackground(Color.BLACK);
            label_1.setBounds(166, 367, 105, 43);
            add(label_1);

            JTextArea textArea_2 = new JTextArea();
            textArea_2.setBounds(131, 422, 181, 24);
            add(textArea_2);

        }

    }
