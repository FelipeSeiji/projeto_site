package com.projeto.site_projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.site_projeto.entities.Estudante;
import com.projeto.site_projeto.repository.EstudanteRepository;

@Service
public class EstudanteService {
    @Autowired
    private EstudanteRepository repository;

    public List<Estudante> findAll(){
        return repository.findAll();
    }

    public Estudante findById(Long id){
        Optional<Estudante> obj = repository.findById(id);
        return obj.get();
    }
}
