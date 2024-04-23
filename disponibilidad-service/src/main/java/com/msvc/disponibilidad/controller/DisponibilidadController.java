package com.msvc.disponibilidad.controller;

import com.msvc.disponibilidad.service.DisponibilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/disponibilidad")
public class DisponibilidadController {

    @Autowired
    private DisponibilidadService disponibilidadService;

    @GetMapping("/{fecha}/{hora}/{medico}")
    public boolean appointmentNotAvailable(@PathVariable("fecha") String fecha, @PathVariable("hora") String hora,
                                           @PathVariable("medico") String medico){
        return disponibilidadService.appointmentNotAvailable(fecha, hora, medico);
    }

}
