package com.msvc.disponibilidad.controller;

import com.msvc.disponibilidad.dto.DisponibilidadResponse;
import com.msvc.disponibilidad.service.DisponibilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/disponibilidad")
public class DisponibilidadController {

    @Autowired
    private DisponibilidadService disponibilidadService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DisponibilidadResponse> appointmentNotAvailable(@RequestParam List<String> fecha, @RequestParam List<String> hora,
                                                                @RequestParam List<String> medico){
        return disponibilidadService.appointmentNotAvailable(fecha, hora, medico);
    }

}
