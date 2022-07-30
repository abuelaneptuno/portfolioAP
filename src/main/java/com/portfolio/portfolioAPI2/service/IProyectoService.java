package com.portfolio.portfolioAPI2.service;

import com.portfolio.portfolioAPI2.model.Proyecto;

import java.util.List;

public interface IProyectoService {
    public void crearProyecto(Proyecto proyecto);
    public List<Proyecto> verProyectos();
    public void editarProyecto(Proyecto proyecto);
    public void eliminarProyecto(Long id);
}
