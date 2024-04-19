package com.msvc.cita.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CitaEspecificacionesDto {

    private Long id;
    private String fechaCita;
    private String HoraCita;
    private String medicoAsignado;
    private String descripcionCita;
}
