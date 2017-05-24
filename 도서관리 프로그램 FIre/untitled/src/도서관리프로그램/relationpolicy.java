package 도서관리프로그램; /**
 * Created by dl579 on 2017-05-24.
 */

import javax.swing.*;
import java.awt.*;

public class relationpolicy extends JPanel {

    /**
     * Create the panel.
     */
    public relationpolicy() {
        setBackground(Color.BLACK);
        setLayout(null);

        JLabel lblNewLabel = new JLabel("Policy");
        lblNewLabel.setFont(new Font("a옛날사진관3", Font.PLAIN, 35));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setBounds(183, 12, 126, 41);
        add(lblNewLabel);

        JTextPane textPane = new JTextPane();
        textPane.setFont(new Font("a옛날사진관3", Font.PLAIN, 20));
        textPane.setText("1. \uB300\uCD9C 7\uC77C \uAC00\uB2A5\uD569\uB2C8\uB2E4.\r\n\r\n2. \uC5F0\uC7A5\uD560 \uACBD\uC6B0 10\uC77C \uAC00\uB2A5\uD569\uB2C8\uB2E4.\r\n\r\n3. \uD559\uAD50 \uC9C1\uC6D0\uC77C \uACBD\uC6B0 14\uC77C \uAC00\uB2A5\uD569\uB2C8\uB2E4.\r\n\r\n4. \uC678\uBD80\uC778\uC77C \uACBD\uC6B0 5\uC77C \uAC00\uB2A5\uD569\uB2C8\uB2E4.\r\n\r\n5. \uC5F0\uCCB4\uB420 \uACBD\uC6B0 \uC5F0\uCCB4\uB41C \uC77C x 2\uB3D9\uC548 \uCC45\uC744 \uBE4C\uB9B4 \uC218 \uC5C6\uC2B5\uB2C8\uB2E4.\r\n\r\n6. \uC783\uC5B4 \uBC84\uB838\uC744 \uACBD\uC6B0 \uCC45 \uAC00\uACA9 \uB9CC\uD07C \uC9C0\uBD88 + 2\uC8FC\uC77C\uB3D9\uC548 \uB300\uCD9C\uBD88\uAC00\uB2A5\uD569\uB2C8\uB2E4. ");
        textPane.setBounds(14, 85, 455, 367);
        add(textPane);
        this.setFocusable(true);
    }
}

