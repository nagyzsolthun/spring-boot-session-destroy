package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sessionlisteners.SessionScopeBean;

@RestController
public class SessionEventsController {
	
	@Autowired
	private SessionScopeBean sessionScopeBean;
	
	@RequestMapping("/hello")
	public String hello() {
		sessionScopeBean.interaction();	// to make sure the bean is created
		return "Hello World";
	}

}
