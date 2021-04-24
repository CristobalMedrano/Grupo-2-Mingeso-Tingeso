package com.grupo2.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}

    @RequestMapping("/suma/{primero}/{segundo}")
    public @ResponseBody int suma(@PathVariable int primero, @PathVariable int segundo){
        int result;
        result = primero + segundo;
        return result;



    }
    
    @RequestMapping("/resta/{primero}/{segundo}")
    public @ResponseBody int resta(@PathVariable int primero, @PathVariable int segundo){
        int result;
        result = primero - segundo;
        return result;



    }

}