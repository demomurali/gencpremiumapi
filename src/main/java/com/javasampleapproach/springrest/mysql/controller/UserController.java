package com.javasampleapproach.springrest.mysql.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.springrest.mysql.model.User;
import com.javasampleapproach.springrest.mysql.repo.UserRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserRepository repository;
	
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		List<User> users = new ArrayList<>();
		repository.findAll().forEach(users::add);
		
		return users;
	}
	
	@GetMapping(value = "/users/email/{email}")
	public User findByEmail(@PathVariable String email)
	{
		User users = repository.findByEmail(email);
		return users;
	}
	
	
	@PostMapping(value = "/users/create")
	public User postUser(@RequestBody User user) {
		
		/*
		 * this.username = username; this.firstName = firstName; this.lastName =
		 * lastName; this.email = email; this.password = password; this.contactNumber =
		 * contactNumber; this.regDatetime = regDatetime; this.regCode = regCode;
		 * this.address = address;
		 */
	//	Date date = new Date();
		//DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		//   System.out.println(dtf.format(now));  
		   
		String strDate = dtf.format(now);  
		double x = Math.random();
		x = x*10000;
		
		User _user = repository.save(new User(user.getFirstName(),user.getLastName(),user.getEmail(),user.getPassword(),user.getContactNumber(),strDate,x,user.getAddress()));
		//Customer _customer = repository.save(new Customer(customer.getName(), customer.getAge(),customer.getMobile()));
		return _user;
	}

	
	
}
