package com.exercice.evenement.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.exercice.evenement.service.EvenementService;


public class EvenementControllerTest {
	
	@InjectMocks
	private EvenementController ev;
	
	@Mock
	private EvenementService evService;
	
	@BeforeEach
	void setup() {
		MockitoAnnotations.openMocks(this);
	}
	
	
	/*@Test
	@DisplayName("Test get event with id = 1")
	void getEventTest()  {
		Mockito.when(evService.getEvent(1L)).thenReturn(null)
		assertEquals("{\\\"id\\\":1,\\\"nom\\\":null,\\\"description\\\":null,\\\"debut\\\":null,\\\"fin\\\":null}", 
				result.getResponse().getContentAsString());
	}
*/
}
