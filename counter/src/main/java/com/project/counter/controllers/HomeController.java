package com.project.counter.controllers;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/")

public class HomeController{

	@RequestMapping("")

	public String index(HttpSession session){

		if(session.getAttribute("count") == null){

			session.setAttribute("count",0);

		}else{

			session.setAttribute("count",(Integer) session.getAttribute("count")+1);

		}

		return "home";

	}

	@RequestMapping("/counter")

	public String counter(){

		return "counter";

    }
    @RequestMapping("/countertwo")

	public String counterTwo(HttpSession session){

		if(session.getAttribute("count") == null){

			session.setAttribute("count",0);

		}else{

			session.setAttribute("count",(Integer) session.getAttribute("count")+2);

		}

		return "counter2";

	}

	

	@RequestMapping("/reset")

	public String reset(HttpSession session){

		session.setAttribute("count",0);

		return "redirect:/counter";

	}
    
}

