package com.fiap.ec.backend_consultas.controller;

import com.fiap.ec.backend_consultas.model.Especialidade;
import com.fiap.ec.backend_consultas.service.EspecialidadeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class EspecialidadeController {
    private final EspecialidadeService service;
    public EspecialidadeController(EspecialidadeService service){
        this.service = service;
    }

    @PostMapping
    public Especialidade criar (@RequestBody Especialidade especialidade){
        return service.salvar(especialidade);
    }

    @GetMapping
    public List<Especialidade> listar(){
        return service.listar();
    }
}
