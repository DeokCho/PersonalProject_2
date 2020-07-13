/**
 * 
 */
package com.project.web.tests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.web.proxies.Box;

/**
  * @FileName : Calculator.java
  * @Project : legacy
  * @Date : 2020. 7. 3. 
  * @작성자 : user
  * @변경이력 :
  * @프로그램 설명 :
  */

@Component
public class Calculator {
	@Autowired Box<Integer> box;
	
	public int sum(int a, int b) {
		box.put("res", a+b);
		return box.get("res");
	}
	
	public int substract(int a, int b) {
		return a-b;
	}
	
	public int absoluteVal(int a) {
		return Math.abs(a);
	}
	
	
}
