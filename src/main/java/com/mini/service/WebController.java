package com.mini.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.mini.domain.IncomeResponse;
import com.mini.domain.UserRequest;

@Controller
public class WebController {

	// inject via application.properties
	 @RequestMapping(value = "/login", method = RequestMethod.GET)
	 public String login(Model model, String error, String logout) {
		
		  RestTemplate restTemplate = new RestTemplate();
	        IncomeResponse quote = restTemplate.getForObject("http://localhost:8888/getIncomes?incomeCode=mini2&incomeDate=01052018", IncomeResponse.class);

	        System.out.println("quote "+quote.getLastUpdatedUser());
	 if (error != null)
	 model.addAttribute("error", "Your username and password is invalid.");

	 if (logout != null)
	 model.addAttribute("message", "You have been logged out successfully.");

	 return "login";
	 }

	 @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	 public String welcome(Model model) {
	 return "home";
	 }

}