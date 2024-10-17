package src.lambda;

import java.util.function.Predicate;

/**
 * Predicate<T> T 는 메소드의 인수 유형을 지정하고, 매개변수에 대한 검증을 하는 인터페이스이다.
 */
class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> startsWithP = (str) -> str.startsWith("P");

        System.out.println(startsWithP.test("usada")); // false
        System.out.println(startsWithP.test("pekora")); // true
    }
}
