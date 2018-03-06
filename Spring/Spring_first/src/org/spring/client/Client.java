package org.spring.client;

import org.spring.dao.UserDao4mysql;
import org.spring.manager.UserManager;
import org.spring.manager.UserManagerImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {
		
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	     UserManager userManager = (UserManager)factory.getBean("userManager");
		
		//UserManager userManager = new UserManagerImpl(new UserDao4mysql());	
		userManager.adduser("ÕÅÈý", "123");
		System.out.println(userManager);
}
}
