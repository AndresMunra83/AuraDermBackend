package com.auraderm_db.AuraDerm2.service;

import com.auraderm_db.AuraDerm2.model.PedidoModel;
import com.auraderm_db.AuraDerm2.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<PedidoModel> obtenerTodosPedidos() {
        return pedidoRepository.findAll();
    }

    public PedidoModel obtenerPedidoPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public PedidoModel guardarPedido(PedidoModel pedidoModel) {
        return pedidoRepository.save(pedidoModel);
    }

    public void eliminarPedido(Long id) {
        pedidoRepository.deleteById(id);
}

}
