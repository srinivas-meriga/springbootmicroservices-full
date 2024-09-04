package com.stanley.techie.productservice;

import com.stanley.techie.productservice.dto.ProductRequest;
import com.stanley.techie.productservice.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@SpringBootTest
//@Testcontainers
//@SpringBootConfiguration
//@ContextConfiguration
class ProductServiceApplicationTests {
//    @Container
//    static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.4.2");

//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @Autowired
//    private ProductRepository productRepository;

//    @DynamicPropertySource
//    static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
//        dynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
//    }

    @Test
    void createProduct() throws Exception {
//		ProductRequest productRequest = getProductRequestObject();
//		String productRequestString = objectMapper.writeValueAsString(productRequest);
//		mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(productRequestString)
//		).andExpect(status().isCreated());
//        Assertions.assertEquals(1, productRepository.findAll().size()==1);
    }

    private ProductRequest getProductRequestObject() {
        return ProductRequest.builder()
                .name("iPhone 15 Pro Silver")
                .description("iPhone Pro Silver metalic")
                .price(BigDecimal.valueOf(13000))
                .build();
    }



}
