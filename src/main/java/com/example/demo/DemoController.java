package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import java.awt.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping
	public String get() {
		return "Hello";
	}

}
