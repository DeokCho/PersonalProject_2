/**
 * 
 */
package com.project.web.controllers;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.project.web.services.MemberService;

/**
  * @FileName : MemberControllerTest.java
  * @Project : legacy
  * @Date : 2020. 7. 3. 
  * @작성자 : user
  * @변경이력 :
  * @프로그램 설명 :
  */
@Transactional
// @WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:META-INF/servlet-context.xml","classpath*:META-INF/root-context.xml"})

public class MemberControllerTest {
	  private MemberService service;
	
	
	@Test
	public void testJoin() {
		fail("Not yet implemented");
	}

	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

}
