package object.day8;

public class Parent {

    private int field1; // parent 부모 클래스만 사용.
    protected String field2; 

    // 기본 생성자 : 생성자 메소드에 인자값없음. 
    Parent()    {
        //확인을 위한 출력
        this.field1 = 123;
        this.field2 = "java 자바자바";
        System.out.println("Parent 객체 생성 : 부모 field1 = " + field1 +"field2 ="+field2);
    }

    void hello(String message){
        System.out.println(message + "field1: "+field1);
    }
}

class Child extends Parent{
    // 2단계 테스트: 자식 필드 추가 
    private double fiedl3;

    Child(){
        // super();  // 부모 생성자 호출
        System.out.println("Child 객체 생성");
    }
    // 2단계 테스트: 자식 필드 초기화 커스텀 생성자 추가 
    Child(double fiedl3){
        // 2단계 
        this.fiedl3 = fiedl3;
        System.out.println("Child 객체 생성 fiedl3 :" +this.fiedl3);

    }

    // 자식클래스의 메소드 : 부모가 물려준 field2 값을 사용합니다. 
void say(){
    System.out.println(field2);   //protected 필드 super.field2에서 super 생략
    // System.out.println(field1);   // 오류: private 필드를 자식도 사용 못함. 
}

    

}
