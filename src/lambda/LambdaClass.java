package src.lambda;

/**
 * 익명 클래스에서 new, 구현 메서드 프로토타입을 생략한 것이 람다식이다. 람다식을 사용하기 위해선 추상 메서드가 오직 한 개여야한다.
 */
class LambdaClass {
    public static void main(String[] args) {
//      자동으로 형식 추론이 이루어져 람다식으로 인스턴스를 생성할 수 있다.
        Runnable runner = () -> System.out.println("Hello, Lambda!");

        runner.run();
    }
}

class LambdaExample {
    public static void main(String[] args) {
        method(() -> System.out.println("Hello, Lambda!"));
    }

    public static void method(Runnable r) {
        r.run();
    }
}