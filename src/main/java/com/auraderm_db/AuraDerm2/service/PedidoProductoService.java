package com.auraderm_db.AuraDerm2.service;


import com.auraderm_db.AuraDerm2.model.PedidoProductoModel;
import com.auraderm_db.AuraDerm2.repository.PedidoProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoProductoService {
    @Autowired
    private PedidoProductoRepository pedidoProductoRepositoy;

//    Traer todo

    public List<PedidoProductoModel> getAllPedidoProducto(){
        return pedidoProductoRepositoy.findAll();
}

}