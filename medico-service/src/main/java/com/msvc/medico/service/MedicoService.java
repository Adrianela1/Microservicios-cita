package com.msvc.medico.service;

import com.msvc.medico.dto.MedicoRequest;
import com.msvc.medico.dto.MedicoResponse;
import com.msvc.medico.model.Medico;
import com.msvc.medico.repository.MedicoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;


    public void createMedico(MedicoRequest medicoRequest){
        Medico medico = Medico.builder()
                .nombre(medicoRequest.getNombre())
                .especialidad(medicoRequest.getEspecialidad())
                .build();
        medicoRepository.save(medico);
        log.info("Medico{} ha sido guardado con exito", medico.getId());
    }

    public List<MedicoResponse> getAllMedicos(){
        List<Medico> medicos = medicoRepository.findAll();
        return medicos.stream().map(this::mapToMedicoResponse).collect(Collectors.toList());
    }

    private MedicoResponse mapToMedicoResponse(Medico medico) {
        return MedicoResponse.builder()
                .id(medico.getId())
                .nombre(medico.getNombre())
                .especialidad(medico.getEspecialidad())
                .build();
    }

}
