package com.itau.icarros.services;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class Formula1Service {
	
	public Object buscarTodos() throws IOException{
		String uri = "https://ergast.com/api/f1/2017/last/results.json";
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper objMapper = new ObjectMapper();
		
		String result = restTemplate.getForObject(uri, String.class);
		return objMapper.readValue(result, Object.class);
	}
}
