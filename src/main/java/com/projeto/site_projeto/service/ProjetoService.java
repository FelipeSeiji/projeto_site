package com.projeto.site_projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.site_projeto.entities.Projeto;
import com.projeto.site_projeto.repository.ProjetoRepository;

@Service
public class ProjetoService{
    @Autowired
    private ProjetoRepository repository;

    public List<Projeto> findAll(){
        return repository.findAll();
    }

    public Projeto findById(Long id){
        Optional<Projeto> obj = repository.findById(id);
        return obj.get();
    }
}
