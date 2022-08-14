package com.portfolio.portfolioAPI2.service;

import com.portfolio.portfolioAPI2.model.Proyecto;
import com.portfolio.portfolioAPI2.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Proyecto> verProyecto(Long id) {
        return proyectoRepository.findById(id);
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
