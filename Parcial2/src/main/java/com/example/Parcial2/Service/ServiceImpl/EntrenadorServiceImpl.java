package com.example.Parcial2.Service.ServiceImpl;

import com.example.Parcial2.Model.Entrenador;
import com.example.Parcial2.Repository.EntrenadorRepository;
import com.example.Parcial2.Service.EntrenadorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorServiceImpl implements EntrenadorService {

    private final EntrenadorRepository entrenadorRepository;

    public EntrenadorServiceImpl(EntrenadorRepository entrenadorRepository) {
        this.entrenadorRepository = entrenadorRepository;
    }

    @Override
    public List<Entrenador> getAll() {
        return entrenadorRepository.findAll();
    }

    @Override
    public Entrenador crear(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }
}