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
@Table(name="proyectos")
public class Proyecto {
    @Id
    private Long idproyecto;

    private String nombre;
    private String descripcion;
    private String link;
}
