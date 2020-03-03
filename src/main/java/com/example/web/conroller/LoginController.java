package com.example.web.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login1")
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String validateUser(Model model) {
		
		//call business logic
		model.addAttribute("msg", "Welcome to Sonata");
		return "home";
	}
	
	@RequestMapping(value = "/verify", method = RequestMethod.GET)
	public String validateUser1(Model model) {
		
		//call business logic
		model.addAttribute("msg", "Welcome User");
		return "user";
	}
	
	@RequestMapping(value = "/mav", method = RequestMethod.GET)
	public ModelAndView validateUser2() {
		
		//call business logic
		ModelAndView mav = new ModelAndView("mav");
		mav.addObject("msg", "Welcome MAV");
		return mav;
	}
	
	@RequestMapping(value = "/user/{userid}/{id}", method = RequestMethod.GET)
	public String validateUser3(Model model, @PathVariable Integer userid, @PathVariable String id) {
		
		//call business logic
		model.addAttribute("msg", userid);
		model.addAttribute("id", id);
		return "userid";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String validateUser4(Model model, @RequestParam("name") String name) {
		
		//call business logic
		model.addAttribute("msg", name);
		return "name";
	}
	
	

}
