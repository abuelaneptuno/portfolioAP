package com.portfolio.portfolioAPI2.controller;

import com.portfolio.portfolioAPI2.model.Proyecto;
import com.portfolio.portfolioAPI2.service.ProyectoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/proyectos")
public class ProyectoController {
    @Autowired
    public ProyectoService proyectoService;

    @GetMapping("/chau")
    @ResponseBody
    public String saludo(){
        System.out.println("chau");
        return "chau puta";
    }

    @PostMapping("/nuevo")
    public void crearProyecto(@RequestBody Proyecto proyecto){
        proyectoService.crearProyecto(proyecto);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyectoService.verProyectos();
    }

    @PutMapping("/editar")
    public void editarProyecto(@RequestBody Proyecto proyecto){
        proyectoService.editarProyecto(proyecto);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarProyecto(@PathVariable Long id){
        proyectoService.eliminarProyecto(id);
    }
}
