package com.example.demo.repository;

import com.example.demo.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

    List<ClienteEntity> findDistinctByCompras_CompraProductos_Producto_IdOrderByNombreDesc(Long productoId);
}
