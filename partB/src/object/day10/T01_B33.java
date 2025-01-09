package object.day10;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class T01_B33 {

    public static void main(String[] args) {
        
        Runnable runnable = () -> System.out.println("현재 시간 :" +new Date()); 

        runnable.run();


        Consumer<String> consumer = (message) -> System.out.println("메세지=" + message);
        consumer.accept("꿋바이~~");

        Supplier<Long> supplier = () -> System.currentTimeMillis();

        System.out.println(supplier.get()); 

   
        

        
    }

}
