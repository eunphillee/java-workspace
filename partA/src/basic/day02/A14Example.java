package basic.day02;

import java.util.Scanner;

public class A14Example {

    //A12번 while 문으로 유효한 아이디 입력할 때 까지 반복시키기 
    public static void main(String[] args) {

      
         Scanner sc = new Scanner(System.in);
         boolean run = true;
    
         while (run) {
          

            System.out.println("사용자 아이디를 입력하세요. ↓ ↓ ↓ ↓ ↓ ");
            String userid = sc.nextLine();
     
            if(userid.isBlank() ||(userid.length() <5 )){
                System.out.println("유용한 아이디 입력이 아닙니다.");
            }
    
    
            else {
                System.out.println("입력한 아이디 확인" + userid);
                // run = false;
            }

                System.out.println("계속 하시겠습니까? ");
               String answer = sc.nextLine().toLowerCase(); // 대소문자 구분 없이 처리
    
                if (answer.equals("no")){
                    run =false; //프로그램 종료 
                    System.out.println("프로그램을 종료합니다.");
                }else if (!answer.equals("yes")){
                    System.out.println("잘못된 입력입니다. 기본적으로 계속 진행합니다. ");
                }
        
                
            }
          
            sc.close();
       }
    }
       
   

