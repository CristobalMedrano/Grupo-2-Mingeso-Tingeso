package com.grupo2.back.service;

import com.grupo2.back.model.Suma;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin("*")
public class SumaService {

    @RequestMapping("/suma/{primero}/{segundo}")
    public @ResponseBody int sumarNumeros(@PathVariable int primero, @PathVariable int segundo){
        Suma nuevaSuma = new Suma(primero, segundo);
        int resultado = nuevaSuma.sumar();
        return resultado;
    }
}
