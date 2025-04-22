package com.example.Parcial2.Controller;

import com.example.Parcial2.Model.Entrenador;
import com.example.Parcial2.Repository.EntrenadorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrenadores")
public class EntrenadorController {

    private final EntrenadorRepository entrenadorRepository;

    public EntrenadorController(EntrenadorRepository entrenadorRepository) {
        this.entrenadorRepository = entrenadorRepository;
    }

    @GetMapping
    public List<Entrenador> getAllEntrenadores() {
        return entrenadorRepository.findAll();
    }

    @PostMapping
    public Entrenador crearEntrenador(@RequestBody Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }
}
