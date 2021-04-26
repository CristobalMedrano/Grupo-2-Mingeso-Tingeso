package com.grupo2.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@CrossOrigin("*")
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Backend - Grupo 2";
	}

}