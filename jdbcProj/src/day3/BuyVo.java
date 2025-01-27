package day3;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 구매테이블과 매핑할 VO 클래스
@Getter
@Setter
@ToString
@AllArgsConstructor   // 모든 필드를 포함한 생성자 자동 생성 
@NoArgsConstructor    // 기본 생성자 자동 생성 
public class BuyVo {
  private int buy_seq;           //구매 고유 번호 
  private String custom_id;         // 고객 ID
  private String pcode;             // 상품코드 
  private int quantity;             // 구매 수량
  private Date buy_date;            // 구매 날짜 
}