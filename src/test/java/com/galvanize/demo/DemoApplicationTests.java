package com.galvanize.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class DemoApplicationTests {

	@Test
	void returnNumberShouldReturnOne() {
		DemoApplication da = new DemoApplication();
		int result = da.returnNumber();
		assertEquals(1, result);
	}

}
