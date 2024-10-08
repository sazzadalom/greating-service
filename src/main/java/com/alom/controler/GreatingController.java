package com.alom.controler;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreatingController {

	@GetMapping("/get-greating")
	public String getGreatingMsg() {
		String greatingMsg = "";
		int hour = LocalDateTime.now().getHour();
		if(hour>12 && hour<20)
			greatingMsg = "Good Evening Guys!";
		else if(hour>=20 && hour<6)
			greatingMsg = "Good Night Guys!";
		else
			greatingMsg = "Good Morning Guys!";
		return greatingMsg;
	}
}
