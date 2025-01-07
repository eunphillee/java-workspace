package object.day7;

import java.awt.List;
import java.util.ArrayList;

// 배열처럼 여러개의 데이터를 저장하는 자료구조.
// 좋은 점: 1) 크기가 고정되어 있지 않다. (크기가 동적)  
//          2) 추가와 삭제 메소드가 있다.  
// 문법적 특징 : Generic type 기호 <> 에 저장할 데이터의 타입을 지정합니다. 

public class B14ArrayListV1{
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        System.out.println("현재 리스트의 크기 :" + list.size());
        
       

    }

}
