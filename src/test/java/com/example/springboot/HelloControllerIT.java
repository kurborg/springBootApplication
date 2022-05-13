package com.example.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerIT {
    
    @Autowired
    private TestRestTemplate template;

    @Test
    public void getHello() throws Exception
    {
        ResponseEntity<String> response = template.getForEntity("/", String.class);
        assertEquals(response.getBody(), "Greetings this is my first spring boot application");
    }
}
