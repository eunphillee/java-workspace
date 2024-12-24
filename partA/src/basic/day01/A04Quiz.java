package basic.day01;

public class A04Quiz {
    public static void main(String[] args) {
        // 환율: 1달러 1450원 

        // 여행을 값니다. 여행 경비 500,000을 한전하려고 합니다.
        // 환전 금액은 얼마인가 

        int money = 500000;
        int rateWon = 1450;
        double result = wonToDollar(money,rateWon);
        System.out.println("환전값="+result+"$");

        // 환전금액 구하는 메소드 wonToDollar(meney,rateWon)
        // == 린턴 값(int) 으로 환전금액 출력하기 

        // 여행을 다녀와서 귀국했습니다. 경비가 12달러 남았습니다. 
        // 원화로 환전합니다. 
         int exchange  = 12 ;
         double reault1 = doolarToWon(exchange,rateWon);
         System.out.println("원화환전="+reault1+"W");

        // 환전 금액 구하는 메소드 doolarToWon(meoney,rateWon)
    } // main end 
  
      // wonToDollar 메소드 정의
      // money , rateWon 은 wonToDollar 메소드{} 스콥에서만 사용하는 지역 변수 
        public static double wonToDollar(int money, int rateWon){
        return money/rateWon;     
    } // dollarToWon 메소드 정의 
      // money , rateWon 은 doolarToWon 메소드{} 스콥에서만 사용하는 지역 변수 
        public static double doolarToWon(int exchagne, int rateWon){
        return exchagne * rateWon;
    } 

    /* 
      // wonToDollar 메소드 정의
        public static int wonToDollar(int money, int rateWon){
        return money/rateWon;     
    } // dollarToWon 메소드 정의 
        public static int doolarToWon(int exchagne, int rateWon){
        return exchagne * rateWon;
    } 
    */
}  // class end 

