package com.ricemarch.self.test;

import com.ricemarch.self.spring.applicationContext.AnnotationConfigApplicationContext;
import com.ricemarch.self.test.config.AppConfig;

public class SpringTest {
    public static void main(String[] args) {
        // 创建 applicationContext（注解形式）
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        // 调用 getBean
//        applicationContext.getBean("");
    }
}
