package com.betacom.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/test")
//url che per ora è localhost, request mapping
public class HelloController {

		@RequestMapping("/hello")
		@ResponseBody
		public String hello() {
			return "hello";
		}
		
		@RequestMapping("/hello1")
		public String hello(HttpSession sessio) {
			return "hello";
		}
}
