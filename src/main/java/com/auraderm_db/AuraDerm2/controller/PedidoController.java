package com.auraderm_db.AuraDerm2.controller;

import com.auraderm_db.AuraDerm2.model.PedidoModel;
import com.auraderm_db.AuraDerm2.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<PedidoModel> obtenerTodosPedidos() {
        return pedidoService.obtenerTodosPedidos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PedidoModel> obtenerPedidoPorId(@PathVariable Long id) {
        PedidoModel pedidoModel = pedidoService.obtenerPedidoPorId(id);
        if (pedidoModel != null) {
            return ResponseEntity.ok(pedidoModel);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<PedidoModel> crearPedido(@RequestBody PedidoModel pedidoModel) {
        PedidoModel nuevoPedido = pedidoService.guardarPedido(pedidoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoPedido);
    }
    /*
    @PutMapping("/{id}")
    public ResponseEntity<PedidoModel> actualizarPedido(@PathVariable Long id, @RequestBody PedidoModel pedidoModel) {
        PedidoModel pedidoExistente = pedidoService.obtenerPedidoPorId(id);
        if (pedidoExistente != null) {
            pedidoModel.setIdPedido(id);
            pedidoService.guardarPedido(pedidoModel);
            return ResponseEntity.ok(pedidoModel);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    */

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPedido(@PathVariable Long id) {
        PedidoModel pedidoModel = pedidoService.obtenerPedidoPorId(id);
        if (pedidoModel != null) {
            pedidoService.eliminarPedido(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
