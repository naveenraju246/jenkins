package com.example.web.conroller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.web.model.User;

@Controller
@RequestMapping("/login")
public class LoginUserController {
	@RequestMapping(method = RequestMethod.GET)
	public String showLoginForm(Model model) {
		User user = new User();
		model.addAttribute("user",user);
		return "login";
	}
	
	@RequestMapping(method =RequestMethod.POST)
	public String submitLoginForm(@Valid User user, BindingResult result) {
		if(result.hasErrors()) {
			return "login";
		}
		
		return "home";
	}
	
	@ModelAttribute("countryList")
	public List<String> getCountries(){
		List<String> countryList = new ArrayList<String>();
		countryList.add("India");
		countryList.add("Australia");
		countryList.add("UK");
		countryList.add("US");
		return countryList;
		
	}
}
