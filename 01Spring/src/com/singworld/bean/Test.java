package com.singworld.bean;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User) ctx.getBean("user");
		user.setName("uu");
		user.setAge(18);
		System.out.println(user.getName());
		System.out.println(ToStringBuilder.reflectionToString(user));;

	}
}
