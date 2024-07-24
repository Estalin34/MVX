package com.springapp.app.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class LibroControlador {

    @Controller
    public class libroControlador{

@GetMapping("/libros")
public String libros() {
    return "libros";
}

    }
}
