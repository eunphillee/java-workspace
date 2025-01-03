package object.day6;

import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.Spring;

public class B11RedPenApp02{

  public static void main(String[] args) {
    // 문제는 5개를 배열에 저장하고 
    // 사용자에게 답 입력 -> answer 필드에 저장 
    MyMathV3[] probs = new MyMathV3[5] ;

    System.out.println("배열선언" + Arrays.toString(probs));

    probs[0] = new MyMathV3(444, 223, OperationType.ADD);
    probs[1] = new MyMathV3(234, 456, OperationType.ADD);
    probs[2] = new MyMathV3(444, 223, OperationType.SUB);
    probs[3] = new MyMathV3(456, 124, OperationType.SUB); 
    probs[4] = new MyMathV3(345, 343, OperationType.ADD);

    System.out.println("배열 참조선택" + Arrays.toString(probs));


  }
  

}