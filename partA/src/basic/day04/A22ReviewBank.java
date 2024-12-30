package basic.day04;

import java.util.Scanner;

public class A22ReviewBank {

    public static void main(String[] args) {
      
        int menu;
        int money;  // 입금액 또는 출금액 키보드 입력값
        int balance =0; 
        boolean run = true  ;
        String messageFmt;

        while(run){
        Scanner sc = new Scanner(System.in );
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1:예금 | 2:출금 | 3:잔액 | 4:종료");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("메뉴 선택 >>>");
        menu = sc.nextInt(); 

        switch (menu){
            case  1: // 
                System.out.print("예금액>");
                money = sc.nextInt(); 
                balance = money+balance;
                // System.out.println("😀고객님 잔액은"+balance +" 원 입니다. ");
                System.out.println(String.format("😀고객님 잔액은 %,d 원 입니다.", balance));
                break;
            
            case 2: 
                System.out.print("출금액");
                money = sc.nextInt(); 

                if(money <= balance)
                    balance = balance-money;
                else
                    System.out.println("고객님의 잔액이 출금액보다 부족합니다.");
                System.out.println((String.format("😀고객님 잔액은 %,d 원 입니다. ", balance)));
                break;
            
            case 3: 
            // System.out.print("현재 잔고");
            // money = sc.nextInt(); 
            // balance = money+balance;
            // System.out.println("현재잔고:"+balance +" 원 입니다. ");
            System.out.println((String.format("현재잔고 : %,d 원", balance)));
            break;

            case 4: 
            System.out.println("프로그램을 종료합니다. 😍😍 ");
            // 조건식을 참고하여 종료 조건 설정을 합니다. 
            run=false;
            break;
     
            default:
            System.out.println("메뉴 선택 다시 하세요");
            break;
           }// switch end

        
        }//while end 


    } // main end 

} // class end 
