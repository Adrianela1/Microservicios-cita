package com.msvc.disponibilidad.repository;

import com.msvc.disponibilidad.model.Disponibilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;
import java.util.Optional;


public interface DisponibilidadRepository extends JpaRepository<Disponibilidad, Long> {

    @Query("SELECT d FROM Disponibilidad d WHERE d.fechaOcupada IN :fechas AND d.horaOcupada IN :horas AND d.medico IN :medico")
    List<Disponibilidad> findByFechaHora(@Param("fecha") List<String> fechaOcupada, @Param("hora") List<String> horaOcupada, @Param("medico") List<String> medico);

}
