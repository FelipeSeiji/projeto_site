package com.projeto.site_projeto.entities;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_projeto")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id_projeto")
public class Projeto implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_projeto;

    private String nome_projeto;
    private Instant dia_inicio;
    private Instant dia_termino;

    public Projeto(Long id_projeto, String nome_projeto, Instant dia_inicio, Instant dia_termino, Estudante estudante) {
        super();
        this.id_projeto = id_projeto;
        this.nome_projeto = nome_projeto;
        this.dia_inicio = dia_inicio;
        this.dia_termino = dia_termino;
        this.estudante = estudante;
    }

    // Associações

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "tb_estudante_projeto")
    private Estudante estudante;

    //@OneToOne
    //@MapsId
    //private Grupo grupo;
}
