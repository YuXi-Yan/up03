package com.example.up03;

import com.example.up03.configbean.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class Up03ApplicationTests {
    @Autowired
    com.example.up03.controller.up01Controller up01Controller;
    @Autowired
    Student student;


    @Test
    void contextLoads() {
        String result = up01Controller.sayHello();
        System.out.println("单元测试返回===" + result);
        System.out.println("单元测试返回===" + student);
    }

}
