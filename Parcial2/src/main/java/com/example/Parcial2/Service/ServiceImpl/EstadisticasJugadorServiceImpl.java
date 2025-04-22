package com.example.Parcial2.Service.ServiceImpl;

import com.example.Parcial2.Model.EstadisticasJugador;
import com.example.Parcial2.Repository.EstadisticasJugadorRepository;
import com.example.Parcial2.Service.EstadisticasJugadorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadisticasJugadorServiceImpl implements EstadisticasJugadorService {

    private final EstadisticasJugadorRepository estadisticasRepository;

    public EstadisticasJugadorServiceImpl(EstadisticasJugadorRepository estadisticasRepository) {
        this.estadisticasRepository = estadisticasRepository;
    }

    @Override
    public List<EstadisticasJugador> getAll() {
        return estadisticasRepository.findAll();
    }

    @Override
    public EstadisticasJugador crear(EstadisticasJugador estadisticas) {
        return estadisticasRepository.save(estadisticas);
    }
}










