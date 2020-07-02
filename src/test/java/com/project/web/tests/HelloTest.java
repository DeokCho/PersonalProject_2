/**
 * 
 */
package com.project.web.tests;

import static org.junit.Assert.*;

import org.junit.Test;

/**
  * @FileName : HelloTest.java
  * @Project : legacy
  * @Date : 2020. 7. 2. 
  * @작성자 : user
  * @변경이력 :
  * @프로그램 설명 :
  */
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/*-context.xml")
public class HelloTest {

	/**
	 * Test method for {@link com.project.web.tests.Hello#sayHello()}.
	 */
	@Test
	public void testSayHello() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.project.web.tests.Hello#print()}.
	 */
	@Test
	public void testPrint() {
		fail("Not yet implemented");
	}

}
