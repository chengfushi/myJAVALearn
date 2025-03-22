package com.draw;

import com.exercise.Tools;

import javax.swing.*;
import java.awt.*;

/*测试Java绘图*/

public class DrawCircle extends JFrame{
    
    private MyPanel myPanel = null;
    public static void main(String[] args) {
        new DrawCircle();
    }
    
    public DrawCircle() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(400,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
}

//先定义一个Panel
class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.blue);
        
        g.drawOval(10,10,100,100);
        
        //画直线
        g.drawLine(10,10,100,100);
        
        //画矩形
        g.drawRect(10,10,100,100);
        Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/img.png"));
        g.drawImage(image,10,10,100,100,this);
        
        g.setFont(new Font("隶书", Font.BOLD, 20));
        g.drawString("你好", 10, 200);
        
    }
}
