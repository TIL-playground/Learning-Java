package src.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Function<T, R> 의 T 는 메소드 파라미터의 형태, R 은 반환값의 형태이다.
 * 람다식을 사용해 인스턴스화를 할 수 있고, apply를 사용해서 람다 바디를 실행할 수 있다.
 */
class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> stringAdder = (number) -> "data: " + number;

        String result = stringAdder.apply(512);

        System.out.println(result); // data: 512
    }
}

/**
 * BiFunction<T, U, R> 의 T, U 는 메소드 파라미터의 형태, R 은 반환값의 형태이다.
 */
class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sum = (x, y) -> (x + y);

        Integer result = sum.apply(10, 20);

        System.out.println(result); // 30
    }
}