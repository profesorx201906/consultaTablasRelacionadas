package com.example.demo.controller;

import com.example.demo.entity.ClienteEntity;
import com.example.demo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/producto/{productID}")
    public List<ClienteEntity> getClientesByProductoId(@PathVariable("productID") Long productID) {
        return clienteService.findClientesByProducto(productID);
    }
}
