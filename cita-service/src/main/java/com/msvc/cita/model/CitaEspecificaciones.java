package com.msvc.cita.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cita_especifiaciones")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CitaEspecificaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String fechaCita;
    private String HoraCita;
    private String medicoAsignado;
    private String descripcionCita;

}
