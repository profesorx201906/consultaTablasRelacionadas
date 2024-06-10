package com.example.demo.service;

import com.example.demo.entity.ClienteEntity;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteEntity> findClientesByProducto(Long productoId) {
        return clienteRepository.findDistinctByCompras_CompraProductos_Producto_IdOrderByNombreDesc(productoId);
    }
}
