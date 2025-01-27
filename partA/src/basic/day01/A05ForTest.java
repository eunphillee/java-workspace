package basic.day01;

public class A05ForTest {
    // javascript for 문을 그대로 적용
    //   ㄴ for(i=0;i<100;i++){    }

    public static void main(String[] args) {
        // 1부터 100까지 더하는 for문을 찾아서 변형하시면 됩니다. 
        long result = sumNtoM(4,10);
        System.out.println("sumNtoM(4,10) =" + result);
    }
// 메소드 정의 sumNtoM(4,10) => 4부터 10까지 더하기 
     public static long sumNtoM(int n, int m) {
         long sum = 0; // 합을 저장할 변수
         for (int i = n; i <= m; i++) { // n부터 m까지 반복
             sum += i; // 현재 숫자를 합에 더하기
         }
         return sum; // 최종 합 반환
       }       
}
