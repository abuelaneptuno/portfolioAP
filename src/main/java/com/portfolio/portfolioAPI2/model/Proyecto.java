package com.portfolio.portfolioAPI2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="proyectos")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idproyecto;

    private String nombre;
    private String descripcion;
    private String link;

    @JoinColumn(name = "usuario_id")
    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    private Usuario usuario;
}
