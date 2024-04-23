package com.msvc.disponibilidad.repository;

import com.msvc.disponibilidad.model.Disponibilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.Optional;


public interface DisponibilidadRepository extends JpaRepository<Disponibilidad, Long> {

    @Query("SELECT d FROM Disponibilidad d WHERE d.fechaOcupada = :fecha AND d.horaOcupada = :hora AND d.medico = :medico")
    Optional<Disponibilidad> findByFechaHora(@Param("fecha") String fechaOcupada, @Param("hora") String horaOcupada, @Param("medico") String medico);

}
