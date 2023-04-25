package com.unifan.projetovenda.entity;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Data
public class Pedido {
    private LocalDate dataPedido;
    private Double vlrTotal;

    Pessoas pessoa = new Pessoas();
    List <ItemPedido> itens = new ArrayList<>();

}
