package com.example.pomadoroTogether.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void helloWorldFileTest() {
		DemoApplication controller = new DemoApplication();
		String text = controller.helloWorldFile("test");
		Assertions.assertEquals("Hello, World!", text);
	}

}
