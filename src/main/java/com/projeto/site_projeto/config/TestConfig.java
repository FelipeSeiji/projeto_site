package com.projeto.site_projeto.config;

import java.time.Instant;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projeto.site_projeto.entities.Estudante;
import com.projeto.site_projeto.entities.Grupo;
import com.projeto.site_projeto.entities.Professor;
import com.projeto.site_projeto.entities.Projeto;
import com.projeto.site_projeto.repository.EstudanteRepository;
import com.projeto.site_projeto.repository.GrupoRepository;
import com.projeto.site_projeto.repository.ProfessorRepository;
import com.projeto.site_projeto.repository.ProjetoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private EstudanteRepository estudanteRepository;

    @Autowired
    private GrupoRepository grupoRepository;

    @Autowired
    private ProfessorRepository professorRepository;

    @Autowired
    private ProjetoRepository projetoRepository;

    @Override
    public void run(String... args) throws Exception {
        Estudante estudante1 = new Estudante(null, "a", "b", "c");
        Estudante estudante2 = new Estudante(null, "a", "b", "c");
        estudanteRepository.saveAll(Arrays.asList(estudante1, estudante2));
        System.out.println("Estudantes salvos com sucesso!");

        Grupo grupo1 = new Grupo(null);
        grupoRepository.saveAll(Arrays.asList(grupo1));
        System.out.println("Grupos salvos com sucesso!");

        Professor professor1 = new Professor(null, "d", "e", "f");
        professorRepository.save(professor1);
        System.out.println("Professor salvo com sucesso!");

    
        Projeto projeto1 = new Projeto(null, "g", Instant.parse("2019-06-20T19:53:07Z"), Instant.parse("2019-06-20T19:53:07Z"));
        projetoRepository.save(projeto1);
        System.out.println("Projeto salvo com sucesso!");
    }
}
