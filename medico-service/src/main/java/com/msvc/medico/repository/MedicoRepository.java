package com.msvc.medico.repository;

import com.msvc.medico.model.Medico;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicoRepository extends MongoRepository<Medico, String> {

}
