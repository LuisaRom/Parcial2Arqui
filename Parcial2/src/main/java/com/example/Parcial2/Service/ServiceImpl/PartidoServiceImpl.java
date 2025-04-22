package com.example.Parcial2.Service.ServiceImpl;

import com.example.Parcial2.Model.Partido;
import com.example.Parcial2.Repository.PartidoRepository;
import com.example.Parcial2.Service.PartidoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidoServiceImpl implements PartidoService {

    private final PartidoRepository partidoRepository;

    public PartidoServiceImpl(PartidoRepository partidoRepository) {
        this.partidoRepository = partidoRepository;
    }

    @Override
    public List<Partido> getAll() {
        return partidoRepository.findAll();
    }

    @Override
    public Partido crear(Partido partido) {
        return partidoRepository.save(partido);
    }

    @Override
    public List<Object[]> getResultados() {
        return partidoRepository.findResultadosPartidosConNombres();
    }

    @Override
    public List<Object[]> getGolesPorEquipo() {
        return partidoRepository.findTotalGolesPorEquipo();
    }
}