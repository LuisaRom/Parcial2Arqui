package com.example.Parcial2.Controller;

import com.example.Parcial2.Model.Partido;
import com.example.Parcial2.Repository.PartidoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidos")
public class PartidoController {

    private final PartidoRepository partidoRepository;

    public PartidoController(PartidoRepository partidoRepository) {
        this.partidoRepository = partidoRepository;
    }

    @GetMapping
    public List<Partido> getAllPartidos() {
        return partidoRepository.findAll();
    }

    @PostMapping
    public Partido crearPartido(@RequestBody Partido partido) {
        return partidoRepository.save(partido);
    }

    @GetMapping("/resultados")
    public List<Object[]> getResultadosConNombresEquipos() {
        return partidoRepository.findResultadosPartidosConNombres();
    }

    @GetMapping("/goles-por-equipo")
    public List<Object[]> getTotalGolesPorEquipo() {
        return partidoRepository.findTotalGolesPorEquipo();
    }
}