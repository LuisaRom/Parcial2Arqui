package com.example.Parcial2.Repository;

import com.example.Parcial2.Model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PartidoRepository extends JpaRepository<Partido, Integer> {


    @Query(value = """
                SELECT p.id_partido, el.nombre AS equipo_local, ev.nombre AS equipo_visita, 
                       p.goles_local, p.goles_visita, p.fecha 
                FROM partido p
                JOIN equipo el ON p.equipo_local = el.id_equipo
                JOIN equipo ev ON p.equipo_visita = ev.id_equipo
            """, nativeQuery = true)
    List<Object[]> findResultadosPartidosConNombres();


    @Query(value = """
                SELECT e.nombre, 
                       SUM(CASE WHEN p.equipo_local = e.id_equipo THEN p.goles_local ELSE 0 END +
                           CASE WHEN p.equipo_visita = e.id_equipo THEN p.goles_visita ELSE 0 END) AS total_goles
                FROM equipo e
                LEFT JOIN partido p ON e.id_equipo = p.equipo_local OR e.id_equipo = p.equipo_visita
                GROUP BY e.nombre
            """, nativeQuery = true)
    List<Object[]> findTotalGolesPorEquipo();
}