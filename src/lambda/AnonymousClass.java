package src.lambda;

/**
 * 익명 클래스는, 인터페이스를 구현한 로컬 클래스의 선언을 생략하는 메커니즘이다.
 */
class AnonymousClass {
    public static void main(String[] args) {

//      Runnable 인터페이스를 인스턴스화하는 것 처럼 보이지만,
//      실제로는 Runnable 인터페이스를 구현한 익명 클래스의 인스턴스를 생성한다.
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, Anonymous!");
            }
        };

        runner.run();
    }
}
