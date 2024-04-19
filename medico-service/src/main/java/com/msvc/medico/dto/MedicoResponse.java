package com.msvc.medico.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MedicoResponse {

    private String id;
    private String nombre;
    private String especialidad;


}
