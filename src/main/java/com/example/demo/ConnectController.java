package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConnectController {
	
	@RequestMapping(path = "/connect")
	public ResponseEntity<String> getResponse(@RequestBody String body) {
		System.out.println(body);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
