package com.portfolio.portfolioAPI2.controller;

import com.portfolio.portfolioAPI2.model.Usuario;
import com.portfolio.portfolioAPI2.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    public UsuarioService usuarioService;

    @GetMapping("/hola")
    @ResponseBody
    public String saludo(){
        System.out.println("hola");
        return "hola puta";
    }

    @PostMapping("/nuevo")
    public void crearUsuario(@RequestBody Usuario usuario){
        usuarioService.crearUsuario(usuario);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Usuario> verUsuarios(){
        return usuarioService.verUsuarios();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Usuario> verUsuario(@PathVariable Long id) {
        return usuarioService.verUsuario(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        usuarioService.eliminarUsuario(id);
    }

    @PutMapping("/modificar")
    public void modificarUsuario(@RequestBody Usuario usuario) {
        usuarioService.modificarUsuario(usuario);
    }
}
