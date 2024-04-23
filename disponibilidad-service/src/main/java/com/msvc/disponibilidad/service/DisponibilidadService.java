package com.msvc.disponibilidad.service;

import com.msvc.disponibilidad.dto.DisponibilidadResponse;
import com.msvc.disponibilidad.model.Disponibilidad;
import com.msvc.disponibilidad.repository.DisponibilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DisponibilidadService {

    @Autowired
    private DisponibilidadRepository disponibilidadRepository;

    @Transactional(readOnly = true)
    public List<DisponibilidadResponse> appointmentNotAvailable(List<String> fecha, List<String>  hora, List<String>  medico) {
        return disponibilidadRepository.findByFechaHora(fecha, hora, medico).stream()
                .map(disponibilidad ->
                        DisponibilidadResponse.builder()
                                .fechaOcupada(disponibilidad.getFechaOcupada())
                                .horaOcupada(disponibilidad.getHoraOcupada())
                                .medicoElegido(disponibilidad.getMedico())
                                .citaConfirmada(disponibilidad.citaConfirmada)
                                .build()
                ).collect(Collectors.toList());
    }


}
