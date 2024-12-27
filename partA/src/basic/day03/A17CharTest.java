package basic.day03;
// 문자열은 "" 기호안에 작성. 문자열은 개수(length)에 제한이 없다. 
// 문자(character)는 ' ' 기호 안에 작성. 꼭 1개의 문자를 표기  
// char 키워드로 타입 지정. 
public class A17CharTest {
    public static void main(String[] args) {
        
        char test_ch = 'a';

        System.out.println(
            String.format("테스트 문자 : %c, %s", test_ch,test_ch));
            // 서식 문자 %d %s 둘다 가능하다 .
        System.out.println("===char 타입 변수 증감 연산자 테스트 ");
        System.out.println(test_ch++);  // a 출력하고. test_ch 'b'
        System.out.println(test_ch++);  // b 출력하고. test_ch 'c'
        System.out.println(test_ch++);  // c 출력하고. test_ch 'd'

        System.out.println(--test_ch);  // test_ch 는 'c' c출력 

        // char 타입으로 실행할 수 있는 산술연산은 ++ 또는 -- 

        // + 와 - 은 정수와 실수로만 할 수 있습니다. 
        int code = (int)test_ch;
        System.out.println(code);

        
    }

}
