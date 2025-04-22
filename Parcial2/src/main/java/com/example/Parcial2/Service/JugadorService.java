package com.example.Parcial2.Service;

import com.example.Parcial2.Model.Jugador;

import java.util.List;

public interface JugadorService {

    List<Jugador> getAll();
    Jugador crear(Jugador jugador);
    List<Jugador> getPorEquipo(int idEquipo);
    List<Jugador> getConMasDe(int goles);
}
