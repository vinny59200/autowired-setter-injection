package com.vv.autowired_setter_injection.service;

import com.vv.autowired_setter_injection.repository.MyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MyServiceTest {

    @Autowired
    private MyService myService;

    @MockBean
    private MyRepository myRepository;

    @Test
    public void testMyRepositoryAutowired() {
        // Verify that myRepository is injected into myService
        assertThat(myService).isNotNull();
        assertThat(myService.getMyRepository()).isNotNull();
        assertThat(myService.getMyRepository()).isEqualTo(myRepository);
    }
}
