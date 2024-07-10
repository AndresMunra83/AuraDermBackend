package com.auraderm_db.AuraDerm2.service;

import com.auraderm_db.AuraDerm2.model.CategoriaModel;
import com.auraderm_db.AuraDerm2.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    //traer todas las categorías
    public List<CategoriaModel> getAllCategorias(){
        return categoriaRepository.findAll();
    }

    //guardar categoría
    public CategoriaModel saveCategoria(CategoriaModel categoria){
        return categoriaRepository.save(categoria);
    }

    //eliminar categoría
    public void deleteCategoria(Long id){
        categoriaRepository.deleteById(id);
    }

    //editar categoría
    public CategoriaModel editarCategoria(CategoriaModel categoria) {
        return categoriaRepository.save(categoria);
    }

    //buscar categoría por id
    public CategoriaModel findCategoria(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }
}