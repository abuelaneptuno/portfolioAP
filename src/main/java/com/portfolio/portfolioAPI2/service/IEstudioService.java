package com.portfolio.portfolioAPI2.service;

import com.portfolio.portfolioAPI2.model.Estudio;

import java.util.List;

public interface IEstudioService {
    public void crearEstudio(Estudio estudio);
    public List<Estudio> verEstudios();
    public void eliminarEstudio(Long id);
    public void modificarEstudio(Estudio estudio);
}
