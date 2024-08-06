package com.example.jenkins.mypack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkisDemoFirstApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(JenkisDemoFirstApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("<========Started to execute contextLoads() method========>");
		assertEquals(true, true);
		logger.info("<========contextLoads() method executed successfully========>");
	}

}
