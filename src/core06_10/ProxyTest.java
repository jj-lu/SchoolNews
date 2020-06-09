package core06_10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * 代理类实现：跟踪方法的使用
 */
public class ProxyTest {
    public static void main(String[] args) {
        Object[] elemnts = new Object[1000];
        for (int i = 0;i<elemnts.length;i++){
            Integer value = i+1;
            //生成调用处理器，让Integer实现Comparable接口
            InvocationHandler handler = new TraceHandler(value);
            //创建代理对象
            Object object = Proxy.newProxyInstance(null,new Class[]{Comparable.class},handler);
            elemnts[i] = object;
        }
        //生成随机数
        Integer key = new Random().nextInt(elemnts.length)+1;
        //二分查找，调用Integer的CompareTo方法
        int result = Arrays.binarySearch(elemnts,key);
        //输出结果
        if (result > 0){
            System.out.println(elemnts[result]);
        }
    }
}
