package cybersoft.javabackend.java16giravanthai.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public Object welcome() {
		return new ResponseEntity<>("Welcome to my gira", HttpStatus.OK);
	}
}
