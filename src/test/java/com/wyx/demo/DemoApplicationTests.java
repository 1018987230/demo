package com.wyx.demo;

import com.wyx.demo.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private TestService testService;

    @Test
    void contextLoads() {

        Integer result = testService.add(1, 1);
        System.out.println(result);
    }

}
