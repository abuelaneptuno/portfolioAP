package com.portfolio.portfolioAPI2.service;

import com.portfolio.portfolioAPI2.model.Proyecto;
import com.portfolio.portfolioAPI2.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    public ProyectoRepository proyectoRepository;

    @Override
    public void crearProyecto(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }

    @Override
    public List<Proyecto> verProyectos() {
        return proyectoRepository.findAll();
    }

    @Override
    public void editarProyecto(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }

    @Override
    public void eliminarProyecto(Long id) {
        proyectoRepository.deleteById(id);
    }
}
