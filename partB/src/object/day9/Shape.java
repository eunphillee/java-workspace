package object.day9;


// day8 Shape 과 동일한 소스파일
public class Shape {
    protected String shName;
    protected int width;
    protected int height;

    // 생성자
    public Shape(String shName, int width, int height) {
        this.shName = shName;
        this.width = width;
        this.height = height;
    }

    // 면적 계산 메서드 (기본값 0)
    public long area() {
        return 0;
    }

    // 둘레 계산 메서드 (기본값 0)
    public long length() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape [shName=" + shName + ", width=" + width + ", height=" + height + "]";
    }
}

// 자식 클래스: Triangle
class Triangle extends Shape {
    public Triangle(int width, int height) {
        super("Triangle", width, height);
    }

    @Override
    public long area() {
        // 삼각형의 면적 = (밑변 * 높이) / 2
        return (width * height) / 2;
    }

    @Override
    public long length() {
        // 삼각형 둘레 계산은 별도의 정보를 필요로 하므로 임의로 0 반환
        return 0;
    }
}

// 자식 클래스: Rectangle
class Rectangle extends Shape {
    public Rectangle(int width, int height) {
        super("Rectangle", width, height);
    }

    @Override
    public long area() {
        // 사각형의 면적 = 가로 * 세로
        return width * height;
    }

    @Override
    public long length() {
        // 사각형 둘레 = 2 * (가로 + 세로)
        return 2 * (width + height);
    }
}

// 자식 클래스: Circle
class Circle extends Shape {
    private long radius;

    public Circle(int radius) {
        super("Circle", radius, 0);
        this.radius = radius;
    }

    @Override
    public long area() {
        // 원의 면적 = π * 반지름^2 (여기서 파이를 3.14으로 간단히 계산)
        return (long) (3.14 * radius * radius);
    }

    // @Override
    // public long length() {
    //     // 원의 둘레 = 2 * π * 반지름 (여기서 파이를 3.14으로 간단히 계산)
    //     return (long) (2 * 3.14 * radius);
    // }

    @Override
    public String toString() {
        return "Circle [shName=" + shName + ", radius=" + radius + "]";
    }

    @Override
    public long length() {
        // TODO Auto-generated method stub
        return super.length();
    }


}