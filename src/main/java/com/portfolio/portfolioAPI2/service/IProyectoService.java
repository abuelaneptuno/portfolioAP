package com.portfolio.portfolioAPI2.service;

import com.portfolio.portfolioAPI2.model.Proyecto;

import java.util.List;
import java.util.Optional;

public interface IProyectoService {
    public void crearProyecto(Proyecto proyecto);
    public List<Proyecto> verProyectos();
    public Optional<Proyecto> verProyecto(Long id);
    public void editarProyecto(Proyecto proyecto);
    public void eliminarProyecto(Long id);
}
