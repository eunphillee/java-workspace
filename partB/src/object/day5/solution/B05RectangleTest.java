package object.day5.solution;

public class B05RectangleTest {

  public static void main(String[] args) {
    Rectangle red = new Rectangle();
    red.width = 220;
    red.height = 300;
    red.shapeName = "Red 사각형";
    System.out.println("red 참조 사격형의 넓이 : " + red.getArea());
    System.out.println("red 참조 사각형의 둘레 길이" + red.getLength());

    System.out.println(red.draw("🟥"));

    Rectangle blue = new Rectangle();
    blue.width = 450;
    blue.height = 234;
    blue.shapeName = "Blue 사각형";
    System.out.println(blue.draw("🟦"));

    System.out.println(red);   //object.day5.solution.Rectangle@16b98e56 는 패키지이름. 클래스이름
    System.out.println(blue);  //object.day5.solution.Rectangle@7ef20235

    System.out.println("red.hashCode():" + red.hashCode()); //red.hashCode():381259350
    System.out.println("blue.hashCode():" + blue.hashCode()); // blue.hashCode():2129789493
    
    System.out.println("==== 객체 hashcode 값을 16진수로 출력합ㄴ디ㅏ. ===");
    // int 데이터형을 클래스로 Warp 한 클래스 Integer
    System.out.println(Integer.toHexString((red.hashCode()))); //16b98e56
    System.out.println(Integer.toHexString((blue.hashCode()))); //7ef20235

    // Interger, Long, Double, Flaot 등의 클래스는 기본뎅터타입에 대한 Wrapper 클래스라고합니다. 

  }

}