package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloResource {

	@RequestMapping(value="/getmsg",method=RequestMethod.GET)
	public String getMessage(){
		return "Hi Anil! Gandi de";
	}
}
