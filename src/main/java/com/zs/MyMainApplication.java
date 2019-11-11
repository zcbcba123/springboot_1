package com.zs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 标注主程序
 */
@SpringBootApplication
public class MyMainApplication {

    public static void main(String[] args) {
        //spring应用启动起来
        SpringApplication.run(MyMainApplication.class,args);
    }
}
