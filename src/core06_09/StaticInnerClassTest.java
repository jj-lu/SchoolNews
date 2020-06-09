package core06_09;

public class StaticInnerClassTest {
    public static void main(String[] args) {
        double[] d = new double[20];
        for (int i = 0;i<d.length;i++){
            d[i] = Math.random() * 100;
        }
        //调用静态方法生成静态内部类
        Arraylg.Pair pair = Arraylg.minmax(d);
        System.out.println("min:"+pair.getFirst());
        System.out.println("max:"+pair.getSecond());
    }
}
