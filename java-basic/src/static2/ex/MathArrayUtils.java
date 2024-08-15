package static2.ex;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class MathArrayUtils {

    private MathArrayUtils() {
        //인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        return Arrays.stream(values).sum();
    }

    public static OptionalDouble average(int[] values) {
        return Arrays.stream(values).average();
    }

    public static OptionalInt min(int[] values) {
        return Arrays.stream(values).min();
    }

    public static OptionalInt max(int[] values) {
        return Arrays.stream(values).max();
    }
}
