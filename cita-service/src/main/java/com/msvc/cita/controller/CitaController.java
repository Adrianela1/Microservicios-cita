package com.msvc.cita.controller;

import com.msvc.cita.dto.CitaRequest;
import com.msvc.cita.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cita")
public class CitaController {

    @Autowired
    private CitaService citaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String realizarPedido(@RequestBody CitaRequest citaRequest){
        citaService.agendarCita(citaRequest);
        return "Cita realizada con exito";
    }

}
