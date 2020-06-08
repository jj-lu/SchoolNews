package core06_08;

import javax.swing.*;

public class AnonymousinnerClassTest {
    public static void main(String[] args) {
        TalkClock talkClock = new TalkClock();
        //内部类
        talkClock.start(1000,true);

        //lambda表达式
        talkClock.start_lambda(1000,true);
        JOptionPane.showMessageDialog(null,"eixt");
        System.exit(0);
    }
}
