package com.projeto.site_projeto.entities;

import java.io.Serializable;
import java.time.Instant;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@EqualsAndHashCode(of = "id")
public class Projeto implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Instant dia_inicio;
    private Instant dia_termino;

    //Associações



    public Projeto(Long id, String nome, Instant dia_inicio, Instant dia_termino) {
        super();
        this.id = id;
        this.nome = nome;
        this.dia_inicio = dia_inicio;
        this.dia_termino = dia_termino;
    }
}
