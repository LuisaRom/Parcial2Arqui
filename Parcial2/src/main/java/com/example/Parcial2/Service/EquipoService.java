package com.example.Parcial2.Service;

import com.example.Parcial2.Model.Equipo;

import java.util.List;

public interface EquipoService {

    List<Equipo> getAllEquipos();
    Equipo crearEquipo(Equipo equipo);
}
