package com.example.Parcial2.Service;

import com.example.Parcial2.Model.Entrenador;

import java.util.List;

public interface EntrenadorService {

    List<Entrenador> getAll();
    Entrenador crear(Entrenador entrenador);
}
