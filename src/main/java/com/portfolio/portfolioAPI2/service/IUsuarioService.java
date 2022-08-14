package com.portfolio.portfolioAPI2.service;

import com.portfolio.portfolioAPI2.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IUsuarioService {

    public List<Usuario> verUsuarios();
    public Optional<Usuario> verUsuario(Long id);
    public void crearUsuario(Usuario usuario);
    public void eliminarUsuario(Long id);
    public void modificarUsuario(Usuario usuario);
}
