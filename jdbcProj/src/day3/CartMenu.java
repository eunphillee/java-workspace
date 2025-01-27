package day3;

import java.util.ArrayList;
import java.util.List;

// 구매 테이블의 데이터를 조작하는 예제
// 장바구니 구현 예제
// 트랜잭션 테스트 예제
public class CartMenu {
  // 필요한 전역변수(클래스의 프로퍼티) 선언
  // 장바구니 : 구매할 상품을 저장하는 목록
  private List<BuyVo> list = new ArrayList<>();
  // Dao -> 싱글톤 패턴 수정 예정
  private TblBuyDao dao = new TblBuyDao();

  // 로그인한 사용자
  private String customerId;

  // 편의상 메인을 같은 클래스 작성하고 실행합니다.
  public static void main(String[] args) {
    CartMenu cart = new CartMenu();
    cart.start();
    // switch 완성해서 장바구니 테스트 해보세요.
  }

  public void start() {
    System.out.println("[[[[ 우리 쇼핑몰 ]]]]");
    System.out.print("사용자 아이디 입력하세요. >>> ");
    customerId = System.console().readLine();
    
    //   아이디 존재 여부 확인 필요. 아이디 존재할때만 아래 실행하기
    showMenu();
    boolean run=true;
    while(run){
      System.out.print("메뉴 선택 하세요. >>> ");
      String menu = System.console().readLine();
      switch (menu) {
        case "A","a":
          addCartItem();
          break;
        case "L","l":
          showCartList();
          break;
        case "R","r":
          removeCartItem();
          break;
        case "B","b":
          buyOneItem();
          break;
        case "Y","y":
          buyCartItems();
          break;  
        case "X","x":
          run=false;
          break;
        default:
          break;
      }
    }
  }
  
  public void showMenu(){
    System.out.println(".".repeat(70));
    System.out.println("[C] 카테고리별 상품 조회      [P] 상품명 검색     [M]나의 구매내역");
    System.out.println("[B] 바로 구매하기   [D] 구매 취소  [Q] 구매 수량 변경  [X] 구매 종료");
    System.out.println("::장바구니::[A] 담기  [L] 목록  [R] 삭제   [Y] 모두 구매 ");
    System.out.println(".".repeat(70));
  }

  // 바로 구매하기 - 1개 행 insert 
  public void buyOneItem(){
    System.out.println("----- 상품 바로 구매 -----");
    System.out.print("    구매할 상품 코드 >>> ");
    String pcode = System.console().readLine();
    
    System.out.print("    구매할 수량 >>> ");
    int quantity = Integer.parseInt(System.console().readLine());

    BuyVo vo = new BuyVo();
    vo.setCustom_id(this.customerId);
    vo.setPcode(pcode); vo.setQuantity(quantity); 

    if(dao.insertOne(vo)==1){
      System.out.println("구매 완료되었습니다.");
    }else {
      System.out.println("구매 처리 중 오류 발생!!");
    }
  }


  // 장바구니 목록으로 구매하기 - n개 행 insert (트랜잭션)
  public void buyCartItems() {
    System.out.println("----- 장바구니 구매 -----");

    // 장바구니가 비어있는지 확인
    if (list.isEmpty()) {
        System.out.println("장바구니가 비어 있습니다. 상품을 추가하세요.");
        return;
    }

    // DAO를 사용해 데이터베이스에 장바구니 항목 삽입
    try {
        // 1. 각 장바구니 항목에 고객 ID 설정 (현재 로그인한 사용자)
        for (BuyVo vo : list) {
            vo.setCustom_id(this.customerId); // 현재 로그인한 사용자 ID 설정
        }

        // 2. DAO를 통해 데이터베이스에 삽입 (트랜잭션 처리)
        int result = dao.insertMany(list);

        // 3. 삽입 성공 여부 확인
        if (result > 0) {
            System.out.println("장바구니의 모든 상품을 성공적으로 구매하였습니다.");
            list.clear(); // 장바구니 비우기
        } else {
            System.out.println("구매 처리 중 문제가 발생했습니다.");
        }
    } catch (Exception e) {
        System.out.println("구매 처리 중 오류 발생: " + e.getMessage());
    }
  
  }


  // 장바구니의 추가/삭제/목록 은 dao 상관없이 List 조작입니다.
  public void showCartList(){
    System.out.println("----- 장바구니 목록 -----");
    // 상품코드, 수량
    for(int i =0;i<list.size();i++){
      BuyVo temp = list.get(i);
      System.out.println(i + "\t" + temp.getPcode() + "\t" + temp.getQuantity());
    }
    // 장바구니 상품들 총 결제금액을 구할 예정
  }

  public void addCartItem(){     // 상품을 장바구니 추가 
    System.out.println("----- 장바구니 상품 추가 -----");
    boolean run= true;

    while(run)
    {  
      System.out.print("    구매할 상품 코드 >>> ");
      String pcode = System.console().readLine();
      
      System.out.print("    구매할 수량 >>> ");
      int quantity = Integer.parseInt(System.console().readLine());

      BuyVo vo = new BuyVo();
      vo.setPcode(pcode); vo.setQuantity(quantity); 
      list.add(vo);

      System.out.print("계속 구매하시려면 엔터를 누르세요.종료는 N 입니다. ");
      if(System.console().readLine().toUpperCase().equals("N")) 
              run=false;
    }
  }  //메소드 끝

  public void removeCartItem() {
    System.out.println("----- 장바구니 상품 삭제 -----");
    System.out.print("    삭제할 상품 번호(인덱스) >>> ");
    int index = Integer.parseInt(System.console().readLine());

    //List 저장 목록의 항목 삭제
    list.remove(index);
    
  }


}