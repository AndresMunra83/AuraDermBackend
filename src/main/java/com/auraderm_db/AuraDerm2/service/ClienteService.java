package com.auraderm_db.AuraDerm2.service;

import com.auraderm_db.AuraDerm2.model.ClienteModel;
import com.auraderm_db.AuraDerm2.model.ProductoModel;
import com.auraderm_db.AuraDerm2.repository.ClienteRepository;
import com.auraderm_db.AuraDerm2.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    //traer todos los clientes
    public List<ClienteModel> getAllClientes(){
        return clienteRepository.findAll();
    }

    //guardar clientes
    public ClienteModel saveCliente(ClienteModel cliente){
        return clienteRepository.save(cliente);
    }

    //eliminar cliente

    public void deleteCliente(Long id){
        clienteRepository.deleteById(id);
    }

    public ClienteModel editarCliente(ClienteModel cliente) {
        return clienteRepository.save(cliente);
    }

    public ClienteModel findCliente(Long id) {
        ClienteModel cliente = clienteRepository.findById(id).orElse(null);
        return cliente;
    }
}
