package cn.hsq;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestGame extends JFrame {


//    @Override
    public void paint(Graphics g) {
        //paint(g)函数会重绘图像，
        // 要加上super.paint(g)，
        // 表示在原来图像的基础上，再画图。
        // 如果不加super.paint(g)，
        // 重绘时，会将原有的绘制清空，
        // 再根据paint(g)函数绘制。
        super.paint(g);
        //自动被调用，g相当于一支画笔
        g.drawLine(100,100,300,300);
        g.drawRect(100,100,300,300);
        g.drawOval(100,100,300,300);
    }

    public void launchFrame(){
        this.setTitle("标题");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocation(10,10);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        TestGame tg = new TestGame();
        tg.launchFrame();
    }
}
