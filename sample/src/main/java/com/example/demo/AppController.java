package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@GetMapping("/index")
	public String index(Model model) {
		LocalDateTime now = LocalDateTime.now();
		model.addAttribute("message", "Hello World");
		model.addAttribute("now", now.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 E曜日 HH時mm分ss秒")));
		return "index";
	}

}
