package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class textController {
	@RequestMapping("/texts")
	public String  texts() {
		System.out.println("this is my new sprinBoot application");
		return "texts.jsp";
	}
}
