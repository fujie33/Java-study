package com.fujie.newdaily.day01.frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * @ClassName MainFrame
 * @Description TODO
 * @Author Finger
 * @Date 11/15/2020
 **/
public class MainFrame extends JFrame {
    private JPanel mainPanel;

    public MainFrame(){
        this.setTitle("MainFrame");
        this.setContentPane(mainPanel);
        this.setSize(500,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
