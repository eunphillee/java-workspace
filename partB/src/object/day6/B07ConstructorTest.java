package object.day6;

//클래스의 생성자(Construtor) 테스트 
public class  B07ConstructorTest {
 public static void main(String[] args) {
    
    System.out.println("====MyClass6로 객체 생성하기 ====");
    MyClass6 m6 = new MyClass6();
    System.out.println(m6);
    System.out.println("my 의 인스턴스 필드 값:"
                    +m6.field1 +","+m6.field2);   //null, 0 

    // 생성자에서 인스턴스 필드값을 저장한 예시 
    System.out.println("====MyClass7로 객체 생성하기 ====");
    MyClass7 m7 = new MyClass7();
    System.out.println(m7);
    System.out.println("my 의 인스턴스 필드 값:"
                    +m7.field1 +","+m7.field2);   // "hello", 999


    // 생성자에서 인스턴스 필드값을 저장한 예시 
    System.out.println("====MyClass7로 객체 생성하기 ====");
    MyClass8 m8 = new MyClass8("java", 222);
    System.out.println(m8);
    System.out.println("my 의 인스턴스 필드 값:"
                    +m8.field1 +","+m8.field2);   // "java", 999

    // 오류: The constructor MyClass8() is undefined
   // MyClass8 m88 = new MyClass8();

     // 기본생성자와 여러 유형으로 인자를 갖는 커스텀 생성자 예시
     System.out.println("====MyClass7로 객체 생성하기 ====");
     MyClass9 m9 = new MyClass9();
     System.out.println("m9 의 인스턴스 필드 값:"
                    +m9.field1 +","+m9.field2);   // 

     MyClass9 m99 = new MyClass9(100);
     System.out.println("m99 의 인스턴스 필드 값:"
                    +m99.field1 +","+m99.field2);   // 

     MyClass9 m999 = new MyClass9("100");
     System.out.println("m999 의 인스턴스 필드 값:"
                    +m999.field1 +","+m999.field2);

 
 } // main end 

   // 생성자 권한 : private, default, public, protected 모두 가능합니다. 
   //           private 생성자는 다른 클래스에서는 객체 생성 금지시키기.
   //             (싱글톤 유형에서 사용. 디자인 패턴 중 하나 입니다. )


}
