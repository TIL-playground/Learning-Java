package src.lambda;

/**
 * 로컬 클래스, 메서드 처리 중에 클래스를 선언하여 사용할 수 있는 구조이다.
 */
class LocalClass {
    public static void main(String[] args) {

        class Local { // method inner class
            public void printHello() {
                System.out.println("Hello!");
            }
        }

        Local local = new Local();
        local.printHello();
    }
}

/**
 * 인터페이스를 구현한 로컬 클래스도 정의할 수 있다.
 */
class LocalClassImplementsInterface {
    public static void main(String[] args) {

        class Local implements Runnable { // method inner class, implements Runnable
            @Override
            public void run() {
                System.out.println("Run, Hello!");
            }
        }

        Runnable runner = new Local();
        runner.run();
    }
}