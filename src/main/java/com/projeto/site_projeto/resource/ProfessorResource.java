package com.projeto.site_projeto.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.site_projeto.entities.Professor;
import com.projeto.site_projeto.service.ProfessorService;

@RestController
@RequestMapping(value = "/professor")
public class ProfessorResource {
    @Autowired
    private ProfessorService service;

    @GetMapping
    public ResponseEntity<List<Professor>> findAll(){
        List<Professor> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> findById(@PathVariable Long id){
        Professor obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
