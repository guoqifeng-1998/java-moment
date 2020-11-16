package main.java.com.soft2036.study.frame;

import javax.swing.*;
import java.awt.*;

/**
 * @ClassName LoginFrame
 * @Description TODO
 * @Author qfguo
 * @Date 2020/11/9
 **/
public class LoginFrame {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel leftpanel;
    private JPanel rightPanel;
    private JPanel bottomPanel;
    private JPanel topPanel;
    private JTextField nameField;
    private JTextField passwordField;
    private JButton 登录;

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginFrame");
        frame.setContentPane(new LoginFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.pack();
        frame.setVisible(true);
    }
}
