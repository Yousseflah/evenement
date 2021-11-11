package com.exercice.evenement;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.exercice.evenement.controller.EvenementController;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class EvenementApplicationTests {

	@Autowired
	private EvenementController evcontroller;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@LocalServerPort
	private int port;
	
	@Test
	void contextLoads() throws Exception {
		assertThat(evcontroller).isNotNull();
	}
	
	/*@Test
	void greetingShouldReturnDefaultMessage() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/evenements/1",
				String.class)).contains("{\"id\":1,\"nom\":null,\"description\":null,\"debut\":null,\"fin\":null}");
	}*/
	

}
