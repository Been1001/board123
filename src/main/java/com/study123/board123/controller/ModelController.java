package com.study123.board123.controller;

import com.study123.board123.entity.ModelEntity;
import com.study123.board123.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ModelController {
    @Autowired
    private ModelService modelService;

    @GetMapping("/")
    public String modelWrite(Model model) {
        return "modelwrite";
    }

    @PostMapping("/create-table")
    public String createTable(ModelEntity modelEntity) {
        modelService.createTable(modelEntity);
        return "redirect:/";
    }
}

