package com.treinadev.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.treinadev.api.models.SeriesModel;
import com.treinadev.api.repositorys.SeriesRepository;

import lombok.Data;

@Service
@Data
public class SeriesService {
    
    @Autowired
    private SeriesRepository repository;
    
    // Cadastrar
    public ResponseEntity<?> cadastrar(SeriesModel model){
        return new ResponseEntity<SeriesModel>(repository.save(model), HttpStatus.CREATED);
    }

    // Lista
    public Iterable<SeriesModel> listAll(){
        return repository.findAll();
    }
}