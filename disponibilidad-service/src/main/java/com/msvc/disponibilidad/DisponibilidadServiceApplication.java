package com.msvc.disponibilidad;

import com.msvc.disponibilidad.model.Disponibilidad;
import com.msvc.disponibilidad.repository.DisponibilidadRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DisponibilidadServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisponibilidadServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(DisponibilidadRepository disponibilidadRepository){
		return args -> {
			Disponibilidad disponibilidad = new Disponibilidad();
			disponibilidad.setFechaOcupada("25-02-2024");
			disponibilidad.setHoraOcupada("8:00am");
			disponibilidad.setMedico("Jorge");

			disponibilidadRepository.save(disponibilidad);
		};
	}

}
