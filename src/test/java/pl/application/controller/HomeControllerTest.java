package pl.application.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import pl.application.config.WebConfig;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for Home Controller
 * Created by Aleksander on 2017-07-10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebConfig.class})
@WebAppConfiguration
public class HomeControllerTest {

    @Autowired
    HomeController homeController;
    MockMvc mockMvc;

    @Before
    public  void setup(){
        mockMvc = standaloneSetup(homeController).build();
    }

    @Test
    public void testHomePage() throws Exception {
        mockMvc.perform(get("/home")).andExpect(view().name("index"));
    }

}
