package com.projeto.site_projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.site_projeto.entities.Grupo;
import com.projeto.site_projeto.repository.GrupoRepository;

@Service
public class GrupoService {
    @Autowired
    private GrupoRepository repository;

    public List<Grupo> findAll() {
        return repository.findAll();
    }

    public Grupo findById(Long id) {
        Optional<Grupo> obj = repository.findById(id);
        return obj.get();
    }
}
