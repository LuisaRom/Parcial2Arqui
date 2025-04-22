package com.example.Parcial2.Service;

import com.example.Parcial2.Model.EstadisticasJugador;

import java.util.List;

public interface EstadisticasJugadorService {

    List<EstadisticasJugador> getAll();
    EstadisticasJugador crear(EstadisticasJugador estadisticas);

}
