package com.example.demo.web;

import com.example.demo.Entities.Offre;
import com.example.demo.Repository.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Offres")
public class RestOffres {
    @Autowired
    OffreRepository offreRepository;
    @GetMapping
    public List<Offre> getAll() {
        return offreRepository.findAll();
    }

    @GetMapping("/{uid}")
    public Offre getbyid(@PathVariable Long uid ) {

        return (Offre) offreRepository.findById(uid).get();
    }
    @PostMapping
    public Offre saveoffre(@RequestBody Offre newoffre) {
        return (Offre) offreRepository.save(newoffre);
    }
    @DeleteMapping("/{id}")
    public void deleteoffre(@PathVariable Long id) {
        offreRepository.deleteById(id);
    }

}