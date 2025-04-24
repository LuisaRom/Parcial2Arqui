package com.example.Parcial2.Repository;

import com.example.Parcial2.Model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Integer> {


    @Query(value = "SELECT * FROM jugador WHERE id_equipo = ?1", nativeQuery = true)
    List<Jugador> findJugadoresByEquipoId(int idEquipo);


    @Query(value = """
        SELECT j.* FROM jugador j 
        JOIN estadistica_jugador ej ON j.id_jugador = ej.id_jugador 
        GROUP BY j.id_jugador 
        HAVING SUM(ej.goles) > ?1
    """, nativeQuery = true)
    List<Jugador> findJugadoresConMasDeXGoles(int goles);
}

