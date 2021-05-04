package com.grupo2.back.service;

import com.grupo2.back.model.Suma;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
public class SumaService {

    @GetMapping(value = "/suma/{primero}/{segundo}")
    public @ResponseBody int sumarNumeros(@PathVariable int primero, @PathVariable int segundo){
        Suma nuevaSuma = new Suma(primero, segundo);
        int resultado = nuevaSuma.sumar();
        return resultado;
    }
}
