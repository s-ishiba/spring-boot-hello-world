package com.sios.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContorller {
	@RequestMapping("/hello")
	public String hello() {
		return "<h1>Hello World !!hogehog5</h1>";
	}
}
