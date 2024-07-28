package com.treinadev.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.treinadev.api.models.SeriesModel;
import com.treinadev.api.repositorys.SeriesRepository;
import com.treinadev.api.services.SeriesService;

@RestController
public class SeriesController {

    @Autowired
    private SeriesRepository repository;

    @Autowired
    private SeriesService service;

    // Cadastrar Serie
    @PostMapping("/api/serie/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody SeriesModel model){
        return service.cadastrar(model);
    }

    // Lista
    @GetMapping("/api/serie/listar")
    public Iterable<SeriesModel> listar(){
        return service.listAll();
    }
}