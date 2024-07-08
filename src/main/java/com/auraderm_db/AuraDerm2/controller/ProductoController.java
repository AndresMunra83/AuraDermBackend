package com.auraderm_db.AuraDerm2.controller;
import com.auraderm_db.AuraDerm2.model.ProductoModel;
import com.auraderm_db.AuraDerm2.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/todos")
    public List<ProductoModel> getAllProductos(){
        return productoService.getAllProductos();
    }

    @PostMapping("/add")
    public ProductoModel saveProducto(@RequestBody ProductoModel producto){
        return productoService.saveProducto(producto);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable Long id){
        productoService.deleteProducto(id);
    }
}
