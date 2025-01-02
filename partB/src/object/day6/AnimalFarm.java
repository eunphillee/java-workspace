package object.day6;


public class AnimalFarm {


    Animal maru = new Animal("DOG",  "마루", 12, "브라운");
    Animal pepper = new Animal( "CAT",  "후추", 4, "블랙");
    Animal donald = new Animal( "DUCK",  "도날드", 4,  "블랙");

    System.out.println(maru);
    System.out.println(pepper);
    System.out.println(donald);

    // 인스턴스 메소드 toString() 정의하여 문자열 리턴값 출력
    // type, name, age, color는 클래스의 속성(필드)
    // 인스턴스 메소드 sound() 정의하여 동물 소리 출력



}
