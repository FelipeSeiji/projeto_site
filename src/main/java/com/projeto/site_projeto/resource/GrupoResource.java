package com.projeto.site_projeto.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.site_projeto.entities.Grupo;
import com.projeto.site_projeto.service.GrupoService;

@RestController
@RequestMapping(value = "/grupo")
public class GrupoResource {

    @Autowired
    private GrupoService service;

    @GetMapping
    public ResponseEntity<List<Grupo>> findAll() {
        List<Grupo> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grupo> findById(@PathVariable Long id){
        Grupo obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}