package com.fujie.study;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChatApplet  extends Applet implements MouseListener,Runnable{

    private int x,y;

    @Override
    public void init() {
        x=0;
        y=0;
        setBackground(Color.black);
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        Thread one = new Thread(this);
        one.start();
        one = null;

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void run() {
        //变量初始化
        Graphics gl=getGraphics();
        int yMove,yClick,xClick;
        int v;
        xClick =x;
        yClick =y;
        yMove =400;
        v =3;
         int r, g, b;
         while (yMove>yClick){
             gl.setColor(Color.black);
             gl.fillOval(xClick,yMove,5,5);
             yMove -=5;
             r=(int) (((Math.round(Math.random()*4321))%200)+55);
             g=(int)(((Math.round(Math.random()*4321))%200)+55);
             b=(int) (((Math.round(Math.random()*4321))%200)+55);
             for(int j=0;j<=10; j++) {
                 if (r > 55) {
                     r -= 20;
                 }
                 if (g > 55) {
                     g -= 20;
                 }
                 if (b > 55) {
                     b -= 20;
                 }
                 gl.setColor(new Color(r, g, b));
                 gl.fillOval(xClick, yMove+j * 5, 5, 5);
             }
             gl.setColor(Color.black);
             gl.fillOval(xClick,yMove+5*10,5,5);
                 try{
                     Thread.sleep(v++);
                 }catch (InterruptedException e){
                     e.printStackTrace();
                 }
             }
             for(int j=12; j >=0;j--){
                 gl.setColor(Color.black);
                 gl.fillOval(xClick,yMove+(j*5),5,5);
                 try{
                     Thread.sleep((v++)/3);
             }catch (InterruptedException e){
                     e.printStackTrace();
                 }
         }
         yMove=400;
             gl.setColor(Color.black);
             while(yMove>yClick){
                 gl.fillOval(xClick-2,yMove,9,5);
                 yMove -=5;
             }
             v=15;
             for(int i=0;i <=25;i++){
                 r=(int)(((Math.round(Math.random()* 4321)) % 200)+55);
                 g=(int)(((Math.round(Math.random()* 4321)) % 200)+55);
                 b=(int)(((Math.round(Math.random()* 4321)) % 200)+55);
                 gl.setColor(new Color(r,g,b));
                 gl.drawOval(xClick - 3*i,yClick - 3*i,6 * i,6*i);
                 if(i<23){
                     gl.drawOval(xClick - 3 * (i+1),yClick - 3*(i+1),6*(i+1),6*(i+1));
                     gl.drawOval(xClick - 3 * (i+2),yClick - 3*(i+2),6*(i+2),6*(i+2));
                 }
                 try{
                     Thread.sleep(v++);
                 }catch(InterruptedException e){
                     e.printStackTrace();
                 }
                 gl.setColor(Color.black);
                 gl.drawOval(xClick - 3*i,yClick - 3*i,6*i,6*i);
             }
    }

    public static void main(String[] args) {
        ChatApplet applet = new ChatApplet();
        JFrame frame = new JFrame("TextAreaNew");
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        frame.getContentPane().add(applet,BorderLayout.CENTER);
        frame.setSize(800,400);
        applet.init();
        applet.start();
        frame.setVisible(true);
    }
}
