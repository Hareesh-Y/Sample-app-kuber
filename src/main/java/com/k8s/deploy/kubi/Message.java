package com.k8s.deploy.kubi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {
	
	@GetMapping("/get")
	public String message() {
		return "kubernetese nerchukoni baagupadu";
	}

}
