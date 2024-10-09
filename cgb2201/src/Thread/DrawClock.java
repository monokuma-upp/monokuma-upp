package Thread;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.lang.InterruptedException;
import javax.swing.JFrame;

public class DrawClock extends JFrame implements Runnable {
    Thread clock; //定义一个时钟的线程
    public DrawClock(){//调用JFrame父类函数的构造
        super("数字时钟");
        setFont(new Font("Times",Font.BOLD,60));//显示闹钟的字体
        start();
        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void start(){
        if(clock == null){
            clock = new Thread(this);
            clock.start();
        }
    }

    public void run(){
        while(clock != null){
            repaint();
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g){ // // 重写JFrame组件的paint方法
        Graphics2D g2 = (Graphics2D)g;
        Calendar now = new GregorianCalendar(); // 提供日历的系统
        String timeInfo = "";

        int hour = now.get(Calendar.HOUR_OF_DAY); //得到小时
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        if(hour<=9){
            timeInfo+="0"+hour+":";
        }else{
            timeInfo+=hour+":";
        }

        if(minute<=9){
            timeInfo+="0"+minute+":";
        }else{
            timeInfo+=minute+":";
        }

        if(second<=9){
            timeInfo+="0"+second;
        }else{
            timeInfo+=second;
        }
        g.setColor(Color.white); // 设置颜色 白色
        Dimension dim = getSize(); // 得到窗口大小
        g.fillRect(0, 0, dim.width, dim.height);
        g.setColor(Color.orange); // 橙色
        g.drawString(timeInfo, 20, 80);

    }

    public static void main(String[] args) {
        new DrawClock();
    }
}
