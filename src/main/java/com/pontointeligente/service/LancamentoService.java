package com.pontointeligente.service;

import java.util.Optional;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

import com.pontointeligente.entity.Lancamento;

public interface LancamentoService  {

	Optional<Lancamento> findByFuncionarioId(Long funcionarioId);

	Optional<Lancamento> findByFuncionarioId(Long funcionarioId, Pageable pageable);
}
