package com.auraderm_db.AuraDerm2.controller;

import com.auraderm_db.AuraDerm2.model.CategoriaModel;
import com.auraderm_db.AuraDerm2.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/todos")
    public List<CategoriaModel> getAllCategorias(){
        return categoriaService.getAllCategorias();
    }

    @PostMapping("/add")
    public CategoriaModel saveCategoria(@RequestBody CategoriaModel categoria){
        return categoriaService.saveCategoria(categoria);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable Long id){
        categoriaService.deleteCategoria(id);
    }

    @PutMapping("/actualizar")
    public CategoriaModel updateCategoria(@RequestBody CategoriaModel categoria){
        return categoriaService.editarCategoria(categoria);
    }

    @GetMapping("/buscar-categoria-id/{id}")
    public CategoriaModel findCategoria(@PathVariable Long id) {
        return categoriaService.findCategoria(id);
    }
}
