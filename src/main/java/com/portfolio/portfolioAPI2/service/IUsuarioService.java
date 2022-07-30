package com.portfolio.portfolioAPI2.service;

import com.portfolio.portfolioAPI2.model.Usuario;
import com.portfolio.portfolioAPI2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUsuarioService {

    public List<Usuario> verUsuarios();
    public void crearUsuario(Usuario usuario);
    public void eliminarUsuario(Long id);
    public void modificarUsuario(Usuario usuario);
}
