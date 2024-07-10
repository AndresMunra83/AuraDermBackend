package com.auraderm_db.AuraDerm2.controller;


import com.auraderm_db.AuraDerm2.model.PedidoProductoModel;
import com.auraderm_db.AuraDerm2.service.PedidoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedidoProducto")
public class PedidoProductoController {

    @Autowired
    private PedidoProductoService pedidoProductoService;

    @GetMapping("/todo")
    public List<PedidoProductoModel>getAllPedidoProducto(){
        return pedidoProductoService.getAllPedidoProducto();
    }
}