package com.edu.umanizales.first_api.controller;

import com.edu.umanizales.first_api.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tree")
public class TreeController {

    @Autowired
    private TreeService treeService;

    // Método para agregar un nodo
    @PostMapping("/add")
    public String addNode(@RequestParam int value) {
        treeService.add(value);  // Usa la instancia de TreeService
        return "Node " + value + " added to the tree.";
    }

    // Método para obtener el recorrido en preorden
    @GetMapping("/preorder")
    public List<Integer> getPreorder() {
        return treeService.preorder();  // Usa la instancia de TreeService
    }
}