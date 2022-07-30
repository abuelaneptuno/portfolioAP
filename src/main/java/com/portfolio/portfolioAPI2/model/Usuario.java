package com.portfolio.portfolioAPI2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    private Long idusuario;
    private String nombre;
    private String sobre_mi;
    private String linkedin;
    private String github;
    private String foto_perfil;
    private String imagen_banner;
    private String email;
}
