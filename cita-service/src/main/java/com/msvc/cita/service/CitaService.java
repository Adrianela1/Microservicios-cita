package com.msvc.cita.service;

import com.msvc.cita.dto.CitaEspecificacionesDto;
import com.msvc.cita.dto.CitaRequest;
import com.msvc.cita.model.Cita;
import com.msvc.cita.model.CitaEspecificaciones;
import com.msvc.cita.repository.CitaRepsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Transactional
public class CitaService {

    @Autowired
    private CitaRepsitory citaRepsitory;

    public void agendarCita(CitaRequest citaRequest){
        Cita cita = new Cita();
        cita.setNumeroDeCita(UUID.randomUUID().toString());

        List<CitaEspecificaciones> citaEspecificaciones = citaRequest.getCitaEspecificacionesDto()
                .stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
        cita.setCitaEspecificaciones(citaEspecificaciones);
        citaRepsitory.save(cita);
    }

    private CitaEspecificaciones mapToDto(CitaEspecificacionesDto citaEspecificacionesDto) {
        CitaEspecificaciones citaEspecificaciones = new CitaEspecificaciones();
        citaEspecificaciones.setHoraCita(citaEspecificacionesDto.getHoraCita());
        citaEspecificaciones.setFechaCita(citaEspecificacionesDto.getFechaCita());
        citaEspecificaciones.setMedicoAsignado(citaEspecificacionesDto.getMedicoAsignado());
        citaEspecificaciones.setDescripcionCita(citaEspecificacionesDto.getDescripcionCita());
        return citaEspecificaciones;
    }

}
