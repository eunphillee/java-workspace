package vo.day1;

// 오라클 tbl_product 테이블 컬럼구서 (이름과 형식)에
// 따라 클래스의 변수를 정의 .
// vo(value object) 값 저장을 위한 객체를 위해 클래스를 정의 

public class Product {
    private String pcode;
    private String category;
    private String pnanme;
    private int price;


    public Product(String pcode, String category, String pnanme, int price) {
        this.pcode = pcode;
        this.category = category;
        this.pnanme = pnanme;
        this.price = price;
    }

 // setter : 초기값이 변경되지 않도록 하고 싶다면 정의하지 않습니다. 
 // getter : 필요한 변수 (프로퍼티) 만 정의하는 것이 바람직합니다.  예상이 안된다면 전체 정의 
 
    public String getPcode() {
        return this.pcode;  // 자신 객체의 pcode 프로퍼티값을 리턴 
    }


    public String getCategory() {
        return this.category;
    }


    public String getPnanme() {
        return this.pnanme;
    }


    public int getPrice() {
        return this.price;
    }

    // 객체의 변수(프로퍼터) 모든 값을 문자열로 리턴 
    @Override
    public String toString() {
        return "Product [pcode=" + pcode + ", category=" + category + ", pnanme=" + pnanme + ", price=" + price + "]";
    }

    // toString()은 object 클래스 메소드 


    

}
