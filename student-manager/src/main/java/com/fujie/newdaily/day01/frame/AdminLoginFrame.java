package com.fujie.newdaily.day01.frame;

import com.fujie.newdaily.day01.factory.ServiceFactory;
import com.fujie.newdaily.day01.utils.ResultEntity;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * @ClassName AdminLoginFrame
 * @Description TODO
 * @Author Finger
 * @Date 11/15/2020
 **/
public class AdminLoginFrame extends JFrame {
    private JPanel mainFrame;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JButton loginBtn;
    private JButton resetBtn;

    public AdminLoginFrame(){
        this.setTitle("AdminLoginFrame");
        this.setContentPane(mainFrame);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        loginBtn.addActionListener(e ->{
            String account = accountField.getText().trim();
            String password = new String(passwordField.getPassword()).trim();
            ResultEntity resultEntity = ServiceFactory.getAdminServiceInstance().adminLogin(account,password);
            JOptionPane.showMessageDialog(mainFrame,resultEntity.getMessage());
            if (resultEntity.getCode() == 0){
                this.dispose();
                new MainFrame();
            }else{
                accountField.setText("");
                passwordField.setText("");
            }
        });

        resetBtn.addActionListener(e->{
            accountField.setText("");
            passwordField.setText("");
        });
    }

    public static void main(String[] args) {
        new AdminLoginFrame();
    }
}
