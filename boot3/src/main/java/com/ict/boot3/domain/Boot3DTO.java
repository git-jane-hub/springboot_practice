package com.ict.boot3.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
// @Data 어노테이션만 사용하면 파라미터에 값이 들어올 때 검증을 하지 않고 입력하기 때문에 자료형이 같을 경우, 잘못 작성될 수 있음
/* 파라미터 오용 방지를 위해 사용되는 Builder 패턴(생성자 지정시 필수 파라미터를 지정하고 검증)
 * builder method 1
 *      public DTO builder(int no){
 *          if(no == null){
 *              System.out.println("필수 파라미터 없음");
 *          }
 *          return builder().no(no);
 *      }
 * builder method 2
 *      public static void main(String[] args){
 *          DTO dto = DTO.builder(1).money(10000).build();  // setter로 명확하게 입력
 *      }
 */
@Builder(toBuilder = true)  // 같은 자료형이 두개이상 있을 때 builder pattern 사용
public class Boot3DTO {
    private Long sno;
    private String first;
    private String last;
    private LocalDateTime regTime;
}
