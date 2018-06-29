package pl.morlinski.wjug;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ExampleWjugSpringBootApplicationIntegrationTests {

    @Test
    public void contextLoads() throws Exception {
        HttpStatus statusCode = new RestTemplate().getForEntity("http://localhost:8081/talks", Object.class).getStatusCode();
        assertTrue(statusCode.is2xxSuccessful());
    }

}
