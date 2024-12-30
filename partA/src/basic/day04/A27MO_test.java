package basic.day04;
// 자바의 메소드 오버로딩 (overloading)
// 다른 형식(인자의 개수와 타입)의 데이터를 인자로 받아 동일한 연산을  수행하는
// 메소드의 이름은 같아도 된다. 
public class A27MO_test {

    public static void main(String[] args) {

        print("연습입니다.");

        print();

        print(3,3);
        print(100, 100);

        print();
        print("나는 널 사랑하고 좋아한다.");

        System.out.println("div(5,3) :" + div(10,3));
        System.out.println("div(5.0,3,0) :" + div(50.0,10.0));
  

    } //main end
    public static int div(int a, int b){
        return a/b;
    }
    public static double div(double a, double b){
        return a/b; 
    }

    public static void  print(String test){
        System.out.println("문자열 :" + test);
    }

    public static void print(){
        System.out.println("인자가없는 print");
    }

    public static void print(int test, double dtest){
        System.out.println("정수 :" +test +",실수 :" +dtest);
    }

} // class end 
