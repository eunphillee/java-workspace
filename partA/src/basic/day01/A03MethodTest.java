package basic.day01;

// 메소드는 함수와 같은 리턴값, 인자 등을 갖고 있습니다.
//          함수와 다른 점은 객체 또는 클래스의 구성요서라는 것입니다. 

public class A03MethodTest {
    public static void main(String[] args) {
        System.out.println("hello 메소드 실행 중입니다.");
        // 다른 메소드 실행 (호출)
        hello();
        say("하이하이");
        System.out.println("main 메소드 종료!1");
    }
    

    // 리턴값이 없는 메소드 void
    public static void hello() {

        System.out.println("hello 메소드 실행 중입니다.");
        System.out.println("hello~~~");
        System.out.println("hello 메소드 종료. ");
    }
    // 인자를 갖는 메소드 
    public static void say(String message) {
        System.out.println("hello 메소드 실행 중입니다.");
        System.out.println("hello~~~" +message);
        System.out.println("hello 메소드 종료. ");
    }
}

