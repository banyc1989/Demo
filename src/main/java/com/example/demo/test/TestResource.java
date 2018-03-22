package com.example.demo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {

	@RequestMapping("/test")
	public String test(@RequestParam(name="t1") String test) {
		return "ECHO " + test;
	}
	
}
