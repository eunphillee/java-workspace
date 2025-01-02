package object.day6;

// 앞으로 사용하게 될 클래스 유영 중 하나 입니다. 
public class MyClass {

    private String field1;
    private int field2;

    // 2. 커스텀 생성자로 초기화 하기 
    public MyClass(String field1, int field2){
        this.field1 = field1;   //this 생략 불가능 
        this.field2 = field2;
    }
    // 필요에 따라 기본생성자 정의 
    MyClass() {  }

    //3. private 필드값 가져오는(get) 메소드 정의 => getter
    //                  리턴 반드시 필요. 인스턴스 변수의 타입에 따름.
    public String getField1(){
        return this.field1;    //this 생략 가능 (강조의 의미로 사용합니다.)
    }
    public int getField2(){
        return this.field2;    //this 생략 가능 (강조의 의미로 사용합니다.)
    }

    //4. private 필드값  저장하는(set) 메소드 정의 => setter
    public void setField1(String field1){
        this.field1 = field1;

    }

    public void setField2(int field2){
        this.field2 = field2;
    }

}
// 웹 애플리케이션 개발 프레임웍에서 사용하는 형식
//     -> 인스턴스 필드를 외부 클래스에 직접 노출시키지 않음. 