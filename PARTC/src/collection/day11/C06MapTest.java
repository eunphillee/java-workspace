package collection.day11;
/*  Map은 List<E> 또는 Set<E> 과 성격이 다릅니다. 
* Map<K,V>   : key 값으로 value 를  가져오기. key와 value 는 모든 타입 Object 입니다.
*              `key` 는 중복된 값을 가질 수 없습니다. key와 value 모두 순서가  없습니다.
  Map 에는 내부 클래스 Entry가 있고, Key, value 한쌍을 저장하는 단위 입니다. 
*              맵에 입력한 순서대로 접근해야 한다면 LinkedHashMap 
*              또는 정렬(Key 기준)된 방식으로 접근해야한다면 TreeMap
* Map 의 구성요소 : Key, Value 중에서 Key 는 Set 특성을 갖고 있습니다.
*/

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class C06MapTest {

    public static void main(String[] args) {
        // 중복되지 않는 Key 값으로 검색 가능 
        // put : 데이터 저장 메소드 
        Map<String,String> map = new HashMap<>();
        // 중복되지 않는 Key 값으로 검색 가능 
        map.put("t1", "사나");
        map.put("t2", "모모");
        map.put("t3", "나연");
        map.put("t4", "다현");
        System.out.println(map);
        System.out.println(map.keySet());  //key 값으로 set 을 만들어 린턴 

        System.out.println("map 에 저장된 데이터 하나씩 가져오기 ");
        for(String t : map.keySet()) {
            // String t는 key 접합에서 하나씩 가져옵니다. 

            // 데이터 value는 오직.key를 이용해서 가져올수 있습니다. : get(키)
            System.out.println("key = "+ t + ",value=" +map.get(t));    
        }

        System.out.println("map에서 value 만 거여오기 :"+ map.values());

        // 클래스를 정의해서 데이터를 저장하하는 방법 대신에 map 사용하면 편리 
        // Person 클래스  : name, age, joindate 를 저장하는 것 대신에 Map

        Map<String,Object> person = new HashMap<>();
        // value는 Object 타입 : String, int, double 등 value 타입이 다양할 때 
        person.put("name", "홍길동");
        person.put("age", 23); 
        person.put("joindate", new Date());
        System.out.println(person);

        person.put("age", 27);
        System.out.println(person);

    }

}
