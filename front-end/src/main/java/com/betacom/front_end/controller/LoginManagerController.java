package com.betacom.front_end.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginManagerController {
    @GetMapping("/login")
	public ModelAndView  login() {
		ModelAndView mav =  new ModelAndView("login");
		return mav;
	}
    
    @GetMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:/jpa";
    }
}
