package core04_01;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        //当前的月和日
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        //这个月的第一天
        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        //输出头部和月初缩进
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1;i < value;i++){
            System.out.print("    ");
        }

        //进入循环
        while (date.getMonthValue() == month){
            System.out.printf("%3d",date.getDayOfMonth());

            //判断是否是今天
            if(date.getDayOfMonth() == today){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }

            //日期加一
            date = date.plusDays(1);

            //判断是否为周一
            if(date.getDayOfWeek().getValue() == 1){
                System.out.println();
            }
        }

        if(date.getDayOfWeek().getValue() != 1){
            System.out.println();
        }

    }
}
