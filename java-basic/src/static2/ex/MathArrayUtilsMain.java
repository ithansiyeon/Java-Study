package static2.ex;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + MathArrayUtils.sum(values));
        System.out.println("average=" + MathArrayUtils.average(values).orElse(0));
        System.out.println("min=" + MathArrayUtils.min(values).orElse(0));
        System.out.println("max=" + MathArrayUtils.max(values).orElse(0));
    }
}
