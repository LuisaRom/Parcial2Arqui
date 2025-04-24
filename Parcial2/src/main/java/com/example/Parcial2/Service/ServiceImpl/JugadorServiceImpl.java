package com.example.Parcial2.Service.ServiceImpl;
import com.example.Parcial2.Model.Jugador;
import com.example.Parcial2.Repository.JugadorRepository;
import com.example.Parcial2.Service.JugadorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorServiceImpl implements JugadorService {

    private final JugadorRepository jugadorRepository;

    public JugadorServiceImpl(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }

    @Override
    public List<Jugador> getAll() {
        return jugadorRepository.findAll();
    }

    @Override
    public Jugador crear(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    @Override
    public List<Jugador> getPorEquipo(int idEquipo) {
        return jugadorRepository.findJugadoresByEquipoId(idEquipo);
    }

    @Override
    public List<Jugador> getConMasDe(int goles) {
        return jugadorRepository.findJugadoresConMasDeXGoles(goles);
    }
}