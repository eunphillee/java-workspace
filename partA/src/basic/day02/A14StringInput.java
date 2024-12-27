package basic.day02; 

import java.util.Scanner;

import basic.day03.A19MyCharMethod;

public class A14StringInput {

  public static void main(String[] args) {
    Scanner sscc = new  Scanner(System.in);
    boolean run = true;


    // 유용한 아읻 : isBlank 가 아니고 길이는 5이상. 첫글자는 영문으로 시작 해야한다. 
    //                ㄴ A19MycharMethod 클래스의 메소드를 활용.

    while(run) {
      System.out.println("사용자 아이디를 입력하세요....");
      String userid =sscc.nextLine();
      if(userid.isBlank() || userid.length()<5 ||!A19MyCharMethod.isAlphabet(userid.charAt(0)) ){
        System.out.println("유효한 아이디 입력이 아닙니다.==================");
      }
      else {
        System.out.println("입력한 아이디 확인: "+ userid);
      }

      System.out.println("계속하시겠습니까? (Y/N)");
      if(sscc.nextLine().toUpperCase().equals("N"))
      run =false;
    }
    sscc.close();

  }

  
}