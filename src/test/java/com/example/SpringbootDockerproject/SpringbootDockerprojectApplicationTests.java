package com.example.SpringbootDockerproject;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDockerprojectApplicationTests {
	
	public static Logger logger= LoggerFactory.getLogger(SpringbootDockerprojectApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test case Executin 1");
		logger.info("Test case Executin 2");
		logger.info("Test case Executin 2");

	}

}
