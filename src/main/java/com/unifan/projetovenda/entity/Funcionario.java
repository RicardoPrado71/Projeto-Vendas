package com.unifan.projetovenda.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Funcionario extends Pessoas {

    private String ctps;
    private Date dataContratacao;

}
