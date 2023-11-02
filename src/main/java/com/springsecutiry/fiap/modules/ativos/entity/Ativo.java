package com.springsecutiry.fiap.modules.ativos.entity;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ativo")
@Data
public class Ativo {
    
    @Id
    @GeneratedValue
    private UUID id;
    private String papel;
    private BigDecimal cotacao;
    private BigDecimal pl;
    private BigDecimal pvp;
    private BigDecimal psr;
    private String divYield;
    private BigDecimal pAtivo;
    private BigDecimal pCapGiro;
    private BigDecimal pEbit;
    private BigDecimal pAtivCircLiq;
    private BigDecimal evEbit;
    private BigDecimal evEbitda;
    private String mrgEbit;
    private String mrgLiq;
    private BigDecimal liqCorr;
    private String roic;
    private String roe;
}
