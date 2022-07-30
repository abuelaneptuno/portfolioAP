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
@Table(name="educacion")
public class Estudio {
    @Id
    public Long idestudio;

    public String titulo;
    public String institucion;
    public String estado;
}
