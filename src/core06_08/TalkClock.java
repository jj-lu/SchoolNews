package core06_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Date;

public class TalkClock {

    /**
     * 匿名内部类实现
     * @param interval
     * @param beep
     */
    public void start(int interval,boolean beep){
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone, the time is :"+new Date());
                if (beep){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        };
        Timer timer = new Timer(interval,actionListener);
        timer.start();
    }

    /**
     * lambda表达式实现，更加简洁
     * @param interval
     * @param beep
     */
    public void start_lambda(int interval,boolean beep){
        Timer timer = new Timer(interval,listener->{
            System.out.println("At the tone, the time is :"+new Date());
            if (beep){
               Toolkit.getDefaultToolkit().beep();
           }
        });
        timer.start();
    }
}
