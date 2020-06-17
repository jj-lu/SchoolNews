package core07_01;

import java.util.Scanner;

/**
 * 分析堆栈轨迹元素
 */
public class StackTrace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        factorial(i);
    }

    public static int factorial(int n){
        System.out.println("factorial(" + n + "):");
        Throwable throwable = new Throwable();
        //获得构造这个对象时调用堆栈的跟踪
        StackTraceElement[] stackTraces = throwable.getStackTrace();
        for(StackTraceElement stackTrace : stackTraces){
            System.out.println(stackTrace);
        }
        int r;
        if (n <= 1){
            r = 1;
        }else {
            r = n * factorial(n-1);
            System.out.println("return"+r);
        }
        return r;
    }
}
