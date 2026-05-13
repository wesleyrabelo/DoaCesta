package com.DoaCesta.DoaCesta;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class DoaCestaApplicationTests {

	@Test
	void contextLoads() {
	}

}
