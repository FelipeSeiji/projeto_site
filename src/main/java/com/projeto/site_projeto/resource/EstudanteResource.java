package com.projeto.site_projeto.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.site_projeto.entities.Estudante;
import com.projeto.site_projeto.service.EstudanteService;

@RestController
@RequestMapping(value = "/estudante")
public class EstudanteResource {

    @Autowired
    private EstudanteService service;

    @GetMapping
    public ResponseEntity<List<Estudante>> findAll(){
        List<Estudante> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudante> findById(@PathVariable Long id){
        Estudante obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
