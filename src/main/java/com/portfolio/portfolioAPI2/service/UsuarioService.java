package com.portfolio.portfolioAPI2.service;

import com.portfolio.portfolioAPI2.model.Usuario;
import com.portfolio.portfolioAPI2.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    public UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> verUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public void crearUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
