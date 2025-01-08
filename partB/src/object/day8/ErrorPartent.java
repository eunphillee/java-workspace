package object.day8;


public class ErrorPartent {
    
    private int field1;
    private String field2;


    // 커스텀 생성자를 만들면 기본 생성자 존재는 사라집니다. (생략못함.)
    ErrorPartent(int field1, String field2){
        this.field1 = field1;
        this.field2 = field2;
      
    }
}
// 오류 :  super constructor ErrorPartent() is undefined for default constructor.
class ErrorChild extends ErrorPartent{
    // 해결 방법1 - 부모의 기본 생성자 호출 대신 커스텀 생성자를 명시적 호출
    // 오류 확인 후 2단계 코드 추가 
     ErrorChild(){
        super(123,"초기값");
     }
}