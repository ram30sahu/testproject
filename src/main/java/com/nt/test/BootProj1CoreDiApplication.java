package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nt.service.WishMsgGenerator;
@SpringBootApplication
@ComponentScan(basePackages="com.nt.service")
public class BootProj1CoreDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMsgGenerator generator=null;
		//create IOC container
		ctx=SpringApplication.run(BootProj1CoreDiApplication.class, args);
      //get bean class
	  System.out.println("hi how r y");
       generator=ctx.getBean("wish",WishMsgGenerator.class);
       System.out.println(generator.generateWishMsg("raja"));
	
	}

}
