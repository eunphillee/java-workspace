package object.day10;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class B34ReviewTest {

    public static void main(String[] args) {
        // B33 의 4가지 Runnable, Consumer, Supplier, function를 람다식 말고 new 연산으로 생성해보세요 

        Runnable runnable = new Runnable() {
            
            @Override
            public void run() {
                System.out.println("현재시간 :" + new Date());
            }
        };

        runnable.run();

        Consumer<String> consumer = new Consumer<String>() {
              @Override
              public void accept(String message) {
                    System.out.println("메세지= "+message);                  
              }
        };
        consumer.accept("*************");

        Supplier<Long> supplier = new Supplier<Long>() {
            
            @Override
            public Long get() {
                return System.currentTimeMillis();  
            }
        };
        System.out.println(supplier.get());


        Function<Double, Double> function = new Function<Double,Double>() {
            @Override
            public Double apply(Double d) {
                // TODO Auto-generated method stub
                return Math.pow(2, d);

            }
        };
        System.out.println(function.apply(10.0));



    }

}
