package com.auraderm_db.AuraDerm2.service;
import com.auraderm_db.AuraDerm2.repository.ProductoRepository;
import com.auraderm_db.AuraDerm2.model.ProductoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    //traer todos los productos
    public List<ProductoModel> getAllProductos(){
        return productoRepository.findAll();
    }
    //guardar producto
    public ProductoModel saveProducto(ProductoModel producto){
        return productoRepository.save(producto);
    }

    //eliminar producto

    public void deleteProducto(Long id){
        productoRepository.deleteById(id);
    }

}
