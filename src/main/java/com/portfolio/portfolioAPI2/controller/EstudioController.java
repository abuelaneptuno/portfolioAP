package com.portfolio.portfolioAPI2.controller;

import com.portfolio.portfolioAPI2.model.Estudio;
import com.portfolio.portfolioAPI2.service.EstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/estudios")
public class EstudioController {
    @Autowired
    public EstudioService estudioService;

    @PostMapping("/nuevo")
    public void crearEstudio(@RequestBody Estudio estudio){
        estudioService.crearEstudio(estudio);
    }

    @GetMapping("/ver")
    @ResponseBody
    public List<Estudio> verEstudios(){
        return estudioService.verEstudios();
    }

    @PutMapping("/editar")
    public void editarEstudio(@RequestBody Estudio estudio){
        estudioService.modificarEstudio(estudio);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarEstudio(@PathVariable Long id){
        estudioService.eliminarEstudio(id);
    }
}
