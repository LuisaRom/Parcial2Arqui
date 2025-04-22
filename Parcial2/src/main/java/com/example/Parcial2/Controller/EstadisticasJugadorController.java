package com.example.Parcial2.Controller;

import com.example.Parcial2.Model.EstadisticasJugador;
import com.example.Parcial2.Repository.EstadisticasJugadorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estadisticas")
public class EstadisticasJugadorController {

    private final EstadisticasJugadorRepository estadisticasRepository;

    public EstadisticasJugadorController(EstadisticasJugadorRepository estadisticasRepository) {
        this.estadisticasRepository = estadisticasRepository;
    }

    @GetMapping
    public List<EstadisticasJugador> getAllEstadisticas() {
        return estadisticasRepository.findAll();
    }

    @PostMapping
    public EstadisticasJugador crearEstadistica(@RequestBody EstadisticasJugador estadisticas) {
        return estadisticasRepository.save(estadisticas);
    }
}