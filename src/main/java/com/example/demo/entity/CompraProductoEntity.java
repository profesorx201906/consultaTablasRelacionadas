package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "compras_productos")
@Setter
@Getter
public class CompraProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_compra")
    @JsonBackReference
    private CompraEntity compra;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    @JsonBackReference
    private ProductoEntity producto;


}
