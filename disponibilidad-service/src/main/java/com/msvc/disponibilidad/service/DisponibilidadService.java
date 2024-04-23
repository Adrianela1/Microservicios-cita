package com.msvc.disponibilidad.service;

import com.msvc.disponibilidad.repository.DisponibilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DisponibilidadService {

    @Autowired
    private DisponibilidadRepository disponibilidadRepository;

    @Transactional(readOnly = true)
    public boolean appointmentNotAvailable(String fecha, String hora, String medico) {
        return disponibilidadRepository.findByFechaHora(fecha, hora, medico).isPresent();
    }


}
