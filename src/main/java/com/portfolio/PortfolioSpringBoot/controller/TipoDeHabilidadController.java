package com.portfolio.PortfolioSpringBoot.controller;

import com.portfolio.PortfolioSpringBoot.model.TipoDeHabilidad;
import com.portfolio.PortfolioSpringBoot.service.TipoDeHabilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/tipohabilidad")
public class TipoDeHabilidadController {

    @Autowired
    TipoDeHabilidadService tipoHabilidadSer;

    @GetMapping("/list")
    public List<TipoDeHabilidad>  listaDeTipoDeHabilidad() {
        return tipoHabilidadSer.verTipoDeHabilidades();
    }

}
