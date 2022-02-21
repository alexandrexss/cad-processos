package com.cadprocessapi.model;


import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name ="tb_processos")

public class Processos {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    @Length(max = 10)
    private String nome;
    @NotNull
    private Integer codigoSf;
    private String default1 = "IDEN01";


    public Long getId() {
        return id;
    }

    public String getDefault1() {
        return default1;
    }

    public void setDefault1(String default1) {
        this.default1 = default1;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoSf() {
        return codigoSf;
    }

    public void setCodigoSf(Integer codigoSf) {
        this.codigoSf = codigoSf;
    }


}
