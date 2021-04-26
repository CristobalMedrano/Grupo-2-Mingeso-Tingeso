package com.grupo2.back.service;

import com.grupo2.back.model.Resta;
import com.grupo2.back.model.Suma;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin("*")
public class RestaService {

    @RequestMapping("/resta/{primero}/{segundo}")
    public @ResponseBody
    int restarNumeros(@PathVariable int primero, @PathVariable int segundo){
        Resta nuevaResta = new Resta(primero, segundo);
        int resultado = nuevaResta.restar();
        return resultado;
    }
}
