package com.ci_cd.demo.CI_CD.Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void productEndpointShouldReturnMessage() throws Exception {
        mockMvc.perform(get("/product"))
                .andExpect(status().isOk())
                .andExpect(content().string("Product endpoint is working!"));
    }

    @Test
    public void getProductByIdShouldReturnProductId() throws Exception {
        mockMvc.perform(get("/product/456"))
                .andExpect(status().isOk())
                .andExpect(content().string("Product with ID: 456"));
    }

    @Test
    public void productListEndpointShouldReturnMessage() throws Exception {
        mockMvc.perform(get("/product/list"))
                .andExpect(status().isOk())
                .andExpect(content().string("Product list endpoint is working!"));
    }
}
