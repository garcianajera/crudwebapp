package net.app.controller;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@RunWith(SpringRunner.class)
@SpringBootTest 
@AutoConfigureMockMvc
public class UserControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testGetUser() throws Exception{

		mockMvc.perform(MockMvcRequestBuilders.get("/getUser/1").accept(MediaType.APPLICATION_JSON)).
		andExpect(MockMvcResultMatchers.status().isOk()).
		andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("")));
	}

}
