package test;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Entity.User;
import action.UserAction;
import service.UserService;


public class test2 {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService)context.getBean("userService");
		User user=new User();
		user.setUserName("zhangshan");
	    userService.addUser(user);
	    
	    
//		UserAction action=(UserAction) context.getBean("userAction");
//		System.out.println(action);
	    
	   
	}
}
