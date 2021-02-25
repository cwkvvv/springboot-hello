package com.kang.hello;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

    @Test
    void contextLoads() {
//        Integer a=100;
//        Integer b=100;
//        Integer c=200;
//        Integer d=200;
//        System.out.println(a==b);
//        System.out.println(a==c);
//        System.out.println(b==c);
//        System.out.println(c==d);
        String a = "计算机";
        String abc = new String("计算机");
        String abc2 = new String("计算机");
        System.out.println(abc2.intern()==abc.intern());//指向常量池中同一个对象a

    }

}
