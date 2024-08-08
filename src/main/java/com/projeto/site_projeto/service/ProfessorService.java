package com.projeto.site_projeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.site_projeto.entities.Professor;
import com.projeto.site_projeto.repository.ProfessorRepository;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorRepository repository;

    public List<Professor> findAll(){
        return repository.findAll();
    }

    public Professor findById(Long id){
        Optional<Professor> obj = repository.findById(id);
        return obj.get();
    }
}
