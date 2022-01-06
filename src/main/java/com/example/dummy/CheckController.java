package com.example.dummy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckController {

	@GetMapping("/check")
	public String checking() {
		return "Checking Dummy Project";
	}
}
