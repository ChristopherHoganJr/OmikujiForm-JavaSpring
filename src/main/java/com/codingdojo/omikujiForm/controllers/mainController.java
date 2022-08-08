package com.codingdojo.omikujiForm.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {
	@RequestMapping("/omikuji")
	public String index() {
		
		
		return "form.jsp";
	}
	
	@RequestMapping(value="/formProcess", method=RequestMethod.POST)
	public String formProcess(@RequestParam(value="pickNum") Integer pickNum,
							  @RequestParam(value="pickCity") String pickCity,
							  @RequestParam(value="pickPerson") String pickPerson,
							  @RequestParam(value="pickHobby") String pickHobby,
							  @RequestParam(value="pickThing") String pickThing,
							  @RequestParam(value="pickWords") String pickWords,
							  HttpSession session) {
							  
		session.setAttribute("pickNum", pickNum);
		session.setAttribute("pickCity", pickCity);
		session.setAttribute("pickPerson", pickPerson);
		session.setAttribute("pickHobby", pickHobby);
		session.setAttribute("pickThing", pickThing);
		session.setAttribute("pickWords", pickWords);
							  	  
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping("/omikuji/show")
	public String showOmikuji() {
		
//		model.addAttribute("pickNum", pickNum);
//		model.addAttribute("pickCity", pickCity);
//		model.addAttribute("pickPerson", pickPerson);
//		model.addAttribute("pickHobby", pickHobby);
//		model.addAttribute("pickThing", pickThing);
//		model.addAttribute("pickWords", pickWords);
		
		return "show.jsp";
	}
}
