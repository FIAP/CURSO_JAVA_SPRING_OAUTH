package com.springsecutiry.fiap.modules.ativos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsecutiry.fiap.modules.ativos.entity.Ativo;
import com.springsecutiry.fiap.modules.ativos.repository.AtivoRepository;

@Service
public class AtivosService {

    @Autowired
    AtivoRepository _ativoRepository;

    public List<Ativo> listAll() {
        return _ativoRepository.findAll();
    }

    public List<Ativo> getAtivosOrderedByPlDesc() {
        return _ativoRepository.findAllByOrderByPlDesc();
    }
}
