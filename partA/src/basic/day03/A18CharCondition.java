package basic.day03;

public class A18CharCondition {
    public static void main(String[] args) {
        
        char test = 'c';
        boolean result; 

        // test 에 저장된 문자가 대문자? 
        result = (test >='A' && test <='Z');
        // 코드값 >= 65 && 코드값 <= 90
        System.out.println("test 에 저장된 문자 대문자 검사 "+result); //false

        //test 에 저장된 문자가 소문자 ? 
        result = (test >='a' && test <='z');
        // 코드값 >= 97 && 코드값 <= 122
        System.out.println("test 에 저장된 문자 소문자 검사 "+result); //ture


        //test에 저장된 문자가 영문자 ? 
        result = (test >='A' && test <='Z' ||(test >='a' && test <='z')); //true
        System.out.println("test 에 저장된 문자 영문자 검사 "+result);

        test = '4'; 
        // test 에 저장된 문자가 숫자인가? 
        result = (test >='0' && test <='9');
        System.out.println("test 에 저장된 문자 숫자 검사 "+result);



    }

}
