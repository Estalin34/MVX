package com.springapp.app.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LibroControlador {
    @GetMapping("/libros")
    public String Libros(){
        return "libros.html";
    }
}