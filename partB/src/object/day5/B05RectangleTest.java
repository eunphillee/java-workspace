package object.day5;

public class B05RectangleTest {

    public static void main(String[] args) {
        System.out.println("==== rectangle TEST ===== ");
        Rectangle rectangle = new Rectangle();
        rectangle.shapeName = "사각형";
        rectangle.width = 220;
        rectangle.height = 300;

        System.out.println(String.format("넓이 %d * %d = %d", rectangle.width,rectangle.height,rectangle.getArea()));
        System.out.println(String.format("둘레 2*(%d * %d) = %d", rectangle.width,rectangle.height,rectangle.getLength()));
        System.out.println(rectangle.draw());
   

        System.out.println("==== rectangle2 TEST ===== ");
        Rectangle rectangle2 = new Rectangle();
        rectangle2.shapeName ="사격형2";
        rectangle2.width = 500;
        rectangle2.height = 600;

        System.out.println(String.format("넓이 %d * %d = %d", rectangle2.width,rectangle2.height,rectangle2.getArea()));
        System.out.println(String.format("둘레 2*(%d * %d) = %d", rectangle2.width,rectangle2.height,rectangle2.getLength()));
        System.out.println(rectangle2.draw());
   

        System.out.println("==== rectangle3 TEST ===== ");
        Rectangle rectangle3 = new Rectangle();
        rectangle3.shapeName ="사격형3";
        rectangle3.width = 600;
        rectangle3.height = 700;

        System.out.println(String.format("넓이 %d * %d = %d", rectangle3.width,rectangle3.height,rectangle3.getArea()));
        System.out.println(String.format("둘레 2*(%d * %d) = %d", rectangle3.width,rectangle3.height,rectangle3.getLength()));
        System.out.println(rectangle3.draw());
   

       
    }

}
