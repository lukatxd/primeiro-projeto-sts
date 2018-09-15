package com.pontointeligente.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.pontointeligente.entity.Lancamento;
import com.pontointeligente.repository.LancamentoRepository;
import com.pontointeligente.service.LancamentoService;

public class LancamentoServiceImpl implements LancamentoService {

	private static final Logger log = LoggerFactory.getLogger(LancamentoServiceImpl.class);

	@Autowired
	private LancamentoRepository lancamentoRepository;

	@Override
	public Optional<Lancamento> findByFuncionarioId(Long funcionarioId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Lancamento> findByFuncionarioId(Long funcionarioId, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
