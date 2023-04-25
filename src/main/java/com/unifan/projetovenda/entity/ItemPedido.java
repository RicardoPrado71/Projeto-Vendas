package com.unifan.projetovenda.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double quantidade;
    private Double vlrUnitario;
    private Double vlrTotalitem;
    @ManyToOne
    @JoinColumn(name= "produto_id")
    Produto produto = new Produto();
}