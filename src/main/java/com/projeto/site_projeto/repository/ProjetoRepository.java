package com.projeto.site_projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.site_projeto.entities.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long>{
}
