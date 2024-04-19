package com.msvc.medico.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(value = "medico")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Medico {

    @Id
    private String id;
    private String nombre;
    private String especialidad;

}
