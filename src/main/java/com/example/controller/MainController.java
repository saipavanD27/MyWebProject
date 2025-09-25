package com.example.controller;



import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Book;

@Controller
public class MainController {
	@RequestMapping("/home")
	public String home() {
		return "index.html";
		
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about.html";
		
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact.html";
		
	}
	
	@RequestMapping("/show")
	public ModelAndView show() {
		//ModelAndView mv = new ModelAndView("show.html");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("show.html");
		String name="Saipavan";
		Date dt = new Date();
		Book bb = new Book(101, "Kalki");
		mv.addObject("mydate",dt);
		mv.addObject("myname", name);
		mv.addObject("mybook", bb);
		return mv;
//		return "show.html";
		
	}
	
}
