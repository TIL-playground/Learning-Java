package src.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Consumer<T> 의 T 는 메소드 파라미터의 형태이다.
 * 람다식을 사용해 인스턴스화를 할 수 있고, accept를 사용해서 람다 바디를 실행할 수 있다.
 */
class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer> printInteger = (number) -> System.out.println("입력된 숫자: " + number);

        printInteger.accept(100);
    }
}

class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> printIntegerSum = (x, y) -> System.out.println(x + y);

        printIntegerSum.accept(100, 300);
    }
}
