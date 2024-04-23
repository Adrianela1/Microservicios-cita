package com.msvc.disponibilidad.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DisponibilidadResponse {

    private String fechaOcupada;
    private String horaOcupada;
    private String medicoElegido;
    private boolean citaConfirmada;
}
