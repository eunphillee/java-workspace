package basic.day02; 

import java.util.Scanner;

public class A14StringInput {

  public static void main(String[] args) {
    Scanner sscc = new  Scanner(System.in);
    boolean run = true;

    while(run) {
      System.out.println("사용자 아이디를 입력하세요....");
      String userid =sscc.nextLine();
      if(userid.isBlank() || userid.length()<5){
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