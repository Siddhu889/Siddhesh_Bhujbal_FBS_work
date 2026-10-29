package com.phoenix.My_2026_08_01SpringBootHelloWorld;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//controller class

@RestController
public class HelloController {

	@Autowired
	UserRepository repo;
	@GetMapping("/hello")
	public User showGreeting()
	{
		return new User("X","Y");
	}
	
	@GetMapping("/user")
	public String storeRecord(
	        @org.springframework.web.bind.annotation.RequestParam String userid,
	        @org.springframework.web.bind.annotation.RequestParam String password)
	{
	    User user = new User(userid, password);
	    repo.save(user);
	    System.out.println("Data received " + user.getUserid());
	    return "Record added";
	}
	
	@GetMapping("/user/{userid}")
	public User getSpecificRecord(@PathVariable String userid)
	{
		return repo.findById(userid).get();
	}
	
	@GetMapping("/user/{password}/password")
	public List<User> getUserOnPassword(@PathVariable String password)
	{
		// /user/root/password
		// /user/1234/role
		return repo.findByPassword(password);
	}
}
