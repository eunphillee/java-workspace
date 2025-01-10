package collection.day11;

public class CarMain {
    
    public static void main(String[] args) {
        
        Car sonata = new Car();
        Car k5 = new Car();

        sonata.color = "화이트";
        sonata.company = "현대 ";

        k5.color = "블랙";
        k5.company = "기아";

        sonata.go();
        k5.back();

        System.out.println(sonata.color);
        System.out.println(sonata.company);

        System.out.println(k5.color);
        System.out.println(k5.company);

    }

}
