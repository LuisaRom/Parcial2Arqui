package com.example.Parcial2.Service;

import com.example.Parcial2.Model.Partido;

import java.util.List;

public interface PartidoService {

    List<Partido> getAll();
    Partido crear(Partido partido);
    List<Object[]> getResultados();
    List<Object[]> getGolesPorEquipo();
}
