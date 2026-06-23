package com.ci_cd.demo.CI_CD.Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void userEndpointShouldReturnMessage() throws Exception {
        mockMvc.perform(get("/user"))
                .andExpect(status().isOk())
                .andExpect(content().string("User endpoint is working!"));
    }

    @Test
    public void getUserByIdShouldReturnUserId() throws Exception {
        mockMvc.perform(get("/user/123"))
                .andExpect(status().isOk())
                .andExpect(content().string("User with ID: 123"));
    }

    @Test
    public void userProfileEndpointShouldReturnMessage() throws Exception {
        mockMvc.perform(get("/user/profile"))
                .andExpect(status().isOk())
                .andExpect(content().string("User profile endpoint is working!"));
    }
}
