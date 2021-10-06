package com.kumar.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kumar.dto.User;
import com.kumar.service.ConsumeProducerService;

@RestController
public class ConsumerResource {

	private ConsumeProducerService service;

	@Autowired
	public ConsumerResource(ConsumeProducerService service) {
		this.service = service;
	}

	@GetMapping("/getUserList")
	public List<User> getUserList()
	{
		return service.getUserList();
	}

}
