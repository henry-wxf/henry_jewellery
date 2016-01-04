package com.henry.jewellery;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HenryJewelleryApplication.class)
@WebIntegrationTest(randomPort = true)
public class HenryJewelleryApplicationTests {
    @Value("${local.server.port}")
    private int port;

    private RestTemplate template = new TestRestTemplate();

    @Test
    public void contextLoads() {
    }

    @Test
    public void homePageLoads() {
        ResponseEntity<String> response = template.getForEntity("http://localhost:" + port + "/", String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    public void loginEndpointProtected() {
        ResponseEntity<String> response = template.getForEntity("http://localhost:" + port + "/accounts/me", String.class);
        assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());
    }

    @Test
    public void loginSucceeds() {
        RestTemplate template = new TestRestTemplate("user", "p");
        ResponseEntity<String> response = template.getForEntity("http://localhost:" + port + "/accounts/me", String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
