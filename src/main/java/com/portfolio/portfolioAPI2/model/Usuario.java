package com.portfolio.portfolioAPI2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idusuario;

    private String nombre;
    private String sobre_mi;
    private String linkedin;
    private String github;
    private String foto_perfil;
    private String imagen_banner;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "usuario")
    @JsonIgnore
    private List<Estudio> estudios;

    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "usuario")
    @JsonIgnore
    private List<Proyecto> proyectos;
}
