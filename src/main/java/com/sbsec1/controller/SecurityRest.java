package com.sbsec1.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin()
@RestController
@RequestMapping("/sec")
public class SecurityRest {
	@GetMapping("/allone")
	public String getget() {
		return "hi hi hi";
	}

}
