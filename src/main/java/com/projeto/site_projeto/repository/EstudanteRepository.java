package com.projeto.site_projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.site_projeto.entities.Estudante;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante,Long>{
}
