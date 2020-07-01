/**
 * 
 */
package com.project.web.domains;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  * @FileName : FileHandler.java
  * @Project : legacy
  * @Date : 2020. 7. 1. 
  * @작성자 : user
  * @변경이력 :
  * @프로그램 설명 :
  */
@Lazy
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class FileHandler {
	private int fileNumber;
	private String fileName;
}