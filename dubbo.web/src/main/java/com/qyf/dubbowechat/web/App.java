package com.qyf.dubbowechat.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * dubbo服务调用者启动类
 * @author qyf
 *  2018-05-07
 */
//@EnableSwagger2
@SpringBootApplication
@EnableDubboConfiguration
@ServletComponentScan
public class App implements CommandLineRunner {
    public static void main( String[] args ) {
    	System.out.println( "Hello World!" );
    	SpringApplication.run(App.class, args);;
    }

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	}
}