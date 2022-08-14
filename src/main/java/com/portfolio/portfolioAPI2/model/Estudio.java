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
@Table(name="educacion")
public class Estudio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long idestudio;

    public String titulo;
    public String institucion;
    public String estado;

    @JoinColumn(name = "usuario_id")
    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    private Usuario usuario;
}
