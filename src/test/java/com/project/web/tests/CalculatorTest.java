/**
 * 
 */
package com.project.web.tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.stereotype.Component;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.instanceOf;

/**
  * @FileName : CalculatorTest.java
  * @Project : legacy
  * @Date : 2020. 7. 3. 
  * @작성자 : user
  * @변경이력 :
  * @프로그램 설명 :
  */

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:META-INF/servlet-context.xml","classpath*:META-INF/root-context.xml"})
public class CalculatorTest {
	@Autowired Calculator mock;

	@Test
	public void testSum() {
		assertThat(mock.sum(1, 1), equalTo(2));
	}

	@Test
	public void testSubstract() {
		assertThat(mock.substract(1, 1), equalTo(0));
	}

	@Test
	public void testAbsoluteVal() {
		assertThat(mock.absoluteVal(-1), equalTo(1));
	}

}
