package core06_07;

import javax.swing.*;

public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock talkingClock = new TalkingClock(1000,true);
        talkingClock.start();

        JOptionPane.showMessageDialog(null,"Quit program");
        System.exit(0);
    }
}
