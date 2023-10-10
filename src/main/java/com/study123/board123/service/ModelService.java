package com.study123.board123.service;

import com.study123.board123.entity.ModelEntity;
import com.study123.board123.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelService {

    @Autowired
    private ModelRepository modelRepository;

    public void createTable(ModelEntity modelEntity) {
        modelRepository.save(modelEntity);
    }
}
