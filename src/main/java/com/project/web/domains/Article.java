/**
 * 
 */
package com.project.web.domains;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
  * @FileName : Article.java
  * @Project : 회원전용 게시판
  * @Date : 2020. 7. 1. 
  * @작성자 : leaf
  * @변경이력 :
  * @프로그램 설명 :MemberDTO
  * articleNumber : 
  * fileNumber:
  * comment:
  * message:
  * rating:
  * boardtype:
  * title:
  * content:
  */
@Lazy
@Data
@Component
public class Article {
	private int articleNumber, fileNumber;
	private String userid, comment, message, rating, boardtype, title, content; 
}