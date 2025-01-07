package object.day9;

// abstract 부모 클래스 
public abstract class AbstractShape {
    // 필드, 생성자, 인스턴스 메소드 동이랗게 정의 가능합니다. 
    protected int width;
    protected int height;

    AbstractShape(int width, int height){
        this.width=width;
        this.height=height;
    }

    

    // 형식만 추상 메소드가 있는 클래스가 추상클래스 
    public abstract long area();
    public abstract long length(); 

    // 인스턴스 메소드 getter
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}

// 추상 클래스 상속할 때 반드시 모두  추상메소드 재정의 해아함. 
class ACircle extends AbstractShape {

    ACircle(int width, int height){
        super(width, height); // 부모의 기본 생성자 없으므로 커스텀 생성자 호출하기/ 
    }

    @Override
    public long area() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public long length() {
        // TODO Auto-generated method stub
        return 0;
    }
    

}
