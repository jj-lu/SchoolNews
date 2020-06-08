package core06_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
public class TalkingClock {

    //时间间隔
    private int interval;
    //是否发出声音
    private boolean beep;


    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start(){
        ActionListener actionListener = new TimerPrinter();
        Timer timer = new Timer(interval,actionListener);
        timer.start();
    }

    /**
     * 内部类实现监听接口
     */
    public class TimerPrinter implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone, the time is :"+new Date());
            if (beep){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
