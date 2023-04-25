package com.unifan.projetovenda.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

public class Pessoas {
    import lombok.Data;
    import javax.persistence.*;
    import java.util.Date;

    @Entity
    @Data

    public class Pessoas {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nome;
        private String endereco;
        private String cidade;
        private String estado;
        private String cep;
        @Column(name = "rg_ie")
        private String rg_ie;
        @Column(name = "cpf_cnpj")
        private String cpf_cnpf;
        private String telefone;
        private String celular;
        private String email;
        @Column(name = "data_Nascimento")
        private Date dataNascimento;

    }

}
