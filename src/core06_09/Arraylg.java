package core06_09;

public class Arraylg {

    /**
     * 静态内部类
     */
    static class Pair{
        private double first;
        private double second;

        /**
         * 构造方法
         * @param first
         * @param second
         */
        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }

    }

    public static Pair minmax(double[] values){
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for (double v : values){
            if (v>max){
                max = v;
            }
            if (v<min){
                min = v;
            }
        }

        //调用静态内部类的构造方法，并返回静态内部类
        return new Pair(min,max);
    }
}
