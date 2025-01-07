package object.day8;


public class ShapeTest {

     public static void main(String[] args) {
        Shape triangle = new Triangle(10, 20);
        Shape rectangle = new Rectangle(10, 20);
        Shape circle = new Circle(10);

        // 객체 정보와 메서드 출력
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.area());
        System.out.println("Length: " + triangle.length());
        System.out.println();

        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.area());
        System.out.println("Length: " + rectangle.length());
        System.out.println();

        System.out.println(circle.toString());
        System.out.println("Area: " + circle.area());
        System.out.println("Length: " + circle.length());
    }

}
