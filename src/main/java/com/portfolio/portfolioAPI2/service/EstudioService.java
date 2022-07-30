package com.portfolio.portfolioAPI2.service;

import com.portfolio.portfolioAPI2.model.Estudio;
import com.portfolio.portfolioAPI2.repository.EstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudioService implements IEstudioService{

    @Autowired
    public EstudioRepository estudioRepository;

    @Override
    public void crearEstudio(Estudio estudio) {
        estudioRepository.save(estudio);
    }

    @Override
    public List<Estudio> verEstudios() {
        return estudioRepository.findAll();
    }

    @Override
    public void eliminarEstudio(Long id) {
        estudioRepository.deleteById(id);
    }

    @Override
    public void modificarEstudio(Estudio estudio) {
        estudioRepository.save(estudio);
    }
}
