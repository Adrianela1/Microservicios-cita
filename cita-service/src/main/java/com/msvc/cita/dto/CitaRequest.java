package com.msvc.cita.dto;

import com.msvc.cita.model.CitaEspecificaciones;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CitaRequest {

    private List<CitaEspecificacionesDto> citaEspecificacionesDto;

}
