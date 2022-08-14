package com.portfolio.portfolioAPI2.service;

import com.portfolio.portfolioAPI2.model.Estudio;

import java.util.List;
import java.util.Optional;

public interface IEstudioService {
    public void crearEstudio(Estudio estudio);
    public List<Estudio> verEstudios();
    public Optional<Estudio> verEstudio(Long id);
    public void eliminarEstudio(Long id);
    public void modificarEstudio(Estudio estudio);
}
