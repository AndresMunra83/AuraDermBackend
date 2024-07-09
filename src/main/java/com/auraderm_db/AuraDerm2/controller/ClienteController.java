package com.auraderm_db.AuraDerm2.controller;

import com.auraderm_db.AuraDerm2.model.ClienteModel;
import com.auraderm_db.AuraDerm2.model.ProductoModel;
import com.auraderm_db.AuraDerm2.service.ClienteService;
import com.auraderm_db.AuraDerm2.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/todos")
    public List<ClienteModel> getAllClientes(){
        return clienteService.getAllClientes();
    }

    @PostMapping("/add")
    public ClienteModel saveCliente(@RequestBody ClienteModel cliente){
        return clienteService.saveCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id){
        clienteService.deleteCliente(id);
    }

    @PutMapping("/actualizar")
    public ClienteModel updateCliente(@RequestBody ClienteModel cliente){
        return clienteService.editarCliente(cliente);
    }
    @GetMapping("/buscar-cliente-id/{id}")
    public ClienteModel findCliente(@PathVariable Long id) {
        return clienteService.findCliente(id);
    }
}
