package com.kumar.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kumar.dto.User;

@RestController
public class Resources {
	
	@GetMapping("/getUsers")
	public List<User> getUsers()
	{
		return Arrays.asList(new User(1, "kumar", "99999999999"),new User(2, "ravi", "8888888888"));
	}
	
	

}
