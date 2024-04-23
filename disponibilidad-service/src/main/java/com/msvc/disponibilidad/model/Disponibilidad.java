package com.msvc.disponibilidad.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "citas_agendadas")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Disponibilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String medico;
    private String fechaOcupada;
    private String horaOcupada;


}
