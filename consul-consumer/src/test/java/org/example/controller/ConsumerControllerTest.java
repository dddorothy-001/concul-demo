package org.example.controller;

import org.example.api.ProviderClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ConsumerController.class)
public class ConsumerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // 模拟 Feign Client
    @MockBean
    private ProviderClient providerClient;

    @Test
    void testCall() throws Exception {
        when(providerClient.sayHello()).thenReturn("Hello from provider");

        mockMvc.perform(get("/call"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello from provider"));
    }
}
