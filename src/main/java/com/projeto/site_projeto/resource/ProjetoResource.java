package com.projeto.site_projeto.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.site_projeto.entities.Projeto;
import com.projeto.site_projeto.service.ProjetoService;

@RestController
@RequestMapping(value = "/projeto")
public class ProjetoResource {
    @Autowired
    private ProjetoService service;

    @GetMapping
    public ResponseEntity<List<Projeto>> findAll(){
        List<Projeto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Projeto> findById(@PathVariable Long id){
        Projeto obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
