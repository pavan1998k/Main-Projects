package com.ty.shopping.controller;

import java.util.List;

import com.ty.shopping.dao.UserDao;
import com.ty.shopping.dto.User;
import com.ty.shopping.service.UserServices;

public class SaveUserController {
	public static void main(String[] args) {
		
			//Save user------------->
//		User user=new User();
//		user.setId(4);
//		user.setName("Tejas");
//		user.setEmail("ts@gmail.com");
//		user.setPassword("1234tejas");
//		user.setPhone(9986875119l);
		UserServices userServices=new UserServices();
//		userServices.saveUser(user);
		
			//Get user by id---------------->
//		User user=userServices.getUserById(6);
//		if(user != null) {
//			System.out.println("Name: "+user.getName());
//			System.out.println("Email: "+user.getEmail());
//			System.out.println("Phone: "+user.getPhone());
//		}
//		else {
//			System.out.println("Sorry..........Cannot find user details");
//		}

			//List all user------------------->
//		List<User> list= userServices.getAllUser();
//		for(User user:list)
//		{
//			System.out.println("Name: "+user.getName());
//			System.out.println("Email: "+user.getEmail());
//			System.out.println("Phone:"+user.getPhone());
//			System.out.println("------------------------------");
//		}
//		userServices.validateUser(email, password)
		
			//validate user------------------>
//		User user=userServices.validateUser("pk@gmail.com", "1234pavan");
//		if(user != null) {
//			System.out.println("Name: "+user.getName());
//			System.out.println("Email: "+user.getEmail());
//			System.out.println("Phone:"+user.getPhone());
//		}
//		else {
//			System.out.println("Email id and password not matching please check.....");
//		}
		
			//Delete User------------------->
		Boolean user=userServices.deleteUserById(5);
		if(user != false) {
			System.out.println("Deleted Successfully");
		}
		else {
			System.out.println("Please enter valid id");
		}
	}
}
