package com.example.demo;

import com.example.demo.Entities.Offre;
import com.example.demo.Repository.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp2SoapApplication implements CommandLineRunner {

	@Autowired
	OffreRepository offreRepository;

	public static void main(String[] args) {
		SpringApplication.run(Tp2SoapApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Save offre entries in the database
		offreRepository.save(new Offre("Web Design", "informatique", "AXA", 2, "France"));
		offreRepository.save(new Offre("Developpeur", "informatique", "Talys", 3, "Tunisie"));
		offreRepository.save(new Offre("Architecte", "informatique", "SIS", 2, "Allemagne"));
	}
}
