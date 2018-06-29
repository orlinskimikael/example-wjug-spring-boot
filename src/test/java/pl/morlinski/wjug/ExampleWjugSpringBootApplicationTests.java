package pl.morlinski.wjug;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest(TalkController.class)
public class ExampleWjugSpringBootApplicationTests {

    @Autowired
    private MockMvc mockMvc;
    
    @MockBean
    private TalkRepository talkRepository;
    
    @Test
    public void contextLoads() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/talks")).andExpect(MockMvcResultMatchers.status().isOk());
    }
    
    @Test
    public void contextLoadsFailed() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/talks")).andExpect(MockMvcResultMatchers.status().is(201));
    }

}
