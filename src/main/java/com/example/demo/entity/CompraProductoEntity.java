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

    @EmbeddedId
    private CompraProductoPk id;

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    @JsonBackReference
    private CompraEntity compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    @JsonBackReference
    private ProductoEntity producto;


}
