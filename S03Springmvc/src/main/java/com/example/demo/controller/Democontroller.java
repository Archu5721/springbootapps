package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Democontroller {

		@RequestMapping("/hello")
		@ResponseBody
		public String hello() {
			return "Hello Archu!!";
		}
		
		@RequestMapping("/greet")
		@ResponseBody
		public String helloName(@RequestParam String name) {
			return "Hello" + name;
		}
}
