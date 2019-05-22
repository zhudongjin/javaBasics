package com.javaBaics.javaBaics;

import com.javaBaics.javaBaics.lambdas.lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest
public class JavaBaicsApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public  void testLambad(){
		lists.listX();
	}

	@Test
	public void lambdaThread(){
		lists.testThread();
	}

	@Test
	public void testList(){
		lists.testList();
	}
}
