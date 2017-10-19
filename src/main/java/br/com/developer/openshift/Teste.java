package br.com.developer.openshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teste {

	@GetMapping("ping")
	public String ping(){
		return "pong";
	}
}
