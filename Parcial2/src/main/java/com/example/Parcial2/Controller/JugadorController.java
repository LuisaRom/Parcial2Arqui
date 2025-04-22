package com.example.Parcial2.Controller;

import com.example.Parcial2.Model.Jugador;
import com.example.Parcial2.Repository.JugadorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jugadores")
public class JugadorController {

    private final JugadorRepository jugadorRepository;

    public JugadorController(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }

    @GetMapping
    public List<Jugador> getAllJugadores() {
        return jugadorRepository.findAll();
    }

    @GetMapping("/por-equipo/{idEquipo}")
    public List<Jugador> getJugadoresPorEquipo(@PathVariable int idEquipo) {
        return jugadorRepository.findJugadoresByEquipoId(idEquipo);
    }

    @GetMapping("/con-mas-de/{goles}")
    public List<Jugador> getJugadoresConMasDe(@PathVariable int goles) {
        return jugadorRepository.findJugadoresConMasDeXGoles(goles);
    }

    @PostMapping
    public Jugador crearJugador(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }
}