package com.grupo2.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody String greeting() {
		return "Backend - Grupo 2";
	}

}