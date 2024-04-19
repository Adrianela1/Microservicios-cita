package com.msvc.medico.controller;

import com.msvc.medico.dto.MedicoRequest;
import com.msvc.medico.dto.MedicoResponse;
import com.msvc.medico.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medico")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void guardarMedico(@RequestBody MedicoRequest medicoRequest){
        medicoService.createMedico(medicoRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MedicoResponse> listarMedicos(){
        return medicoService.getAllMedicos();
    }

}
