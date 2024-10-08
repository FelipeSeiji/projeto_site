package com.projeto.site_projeto.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_grupo")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Grupo implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Grupo(Long id) {
        super();
        this.id = id;
    }
    //Associações

    @JsonIgnore
    @ManyToMany(mappedBy = "grupos")
    private Set<Estudante> estudantes = new HashSet<>();

    public Set<Estudante> getEstudantes() {
        return estudantes;
    }

    //@OneToOne(mappedBy = "grupo", cascade = CascadeType.ALL)
    //private Projeto projeto;
}
