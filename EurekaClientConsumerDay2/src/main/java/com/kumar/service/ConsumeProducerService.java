package com.kumar.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kumar.config.ConsumeProdcerConfig;
import com.kumar.dto.User;

@Service
public class ConsumeProducerService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ConsumeProdcerConfig config;

	public List<User> getUserList() {
		ResponseEntity<Object[]> responseEntity = restTemplate
				.getForEntity("http://" + config.getProducerService() + "/getUsers", Object[].class);
		Object[] objects = responseEntity.getBody();
		ObjectMapper mapper = new ObjectMapper();
		return Arrays.stream(objects)
				  .map(object -> mapper.convertValue(object, User.class))
				  .collect(Collectors.toList());
	}
}
