package core06_10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TraceHandler implements InvocationHandler {

    private Object target;

    public TraceHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //代理执行的动作
        System.out.print("target:"+target);
        System.out.print("."+method.getName()+"(");
        if (args != null){
                for (int i = 0 ; i < args.length ; i++){
                    System.out.print(args[i]);
                    if (i < args.length-1){
                        System.out.print(",");
                    }
                }
        }
        System.out.println(")");
        //返回定义类代理对象调用方法希望执行的动作
        return method.invoke(target,args);
    }
}
