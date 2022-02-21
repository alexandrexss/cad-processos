package com.cadprocessapi.controller;

import com.cadprocessapi.model.Processos;
import com.cadprocessapi.repository.ProcessoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/processos")
public class ProcessoController {

    private final ProcessoRepository repository;

    public ProcessoController(ProcessoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Processos save(@RequestBody @Valid Processos processos) {
        return repository.save(processos);
    }

}
