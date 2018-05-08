package com.qyf.dubbowechat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

/**
 * dubbo服务提供者启动类
 * @author qyf
 *  2018-05-07
 */
@SpringBootApplication
@EnableDubboConfiguration
@MapperScan("com.qyf.dubbowechat.mapper")
public class App implements CommandLineRunner
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	SpringApplication.run(App.class, args);;
    }
    @Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
