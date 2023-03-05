package com.ggyu.clientapp;

import com.ggyu.clientapp.global.config.AppConfig;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest(classes = {AppConfig.class})
@Slf4j
class GgyuClientApplicationTests {

	@Test
	void contextLoads() {
	}

}
