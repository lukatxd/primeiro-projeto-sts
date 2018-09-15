package com.pontointeligente.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.pontointeligente.entity.Funcionario;
import com.pontointeligente.repository.FuncionarioRepository;
import com.pontointeligente.service.FuncionarioService;

public class FuncionarioServiceImpl implements FuncionarioService {

	private static final Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public Funcionario persistir(Funcionario funcionario) {
		log.info("Gravando um funcionario na base de dados: " + funcionario.toString());
		return this.funcionarioRepository.save(funcionario);
	}

	@Override
	public void remover(Funcionario funcionario) {
		log.info("Removendo um funcionario da base de dados: " + funcionario.toString());
		this.funcionarioRepository.delete(funcionario);
	}

	@Override
	public Optional<Funcionario> buscarPorCpf(String cpf) {
		log.info("Procurando um funcionario pro CPF: " + cpf);
		return Optional.ofNullable(funcionarioRepository.findByCpf(cpf));
	}

	@Override
	public Optional<Funcionario> findByEmail(String email) {
		log.info("Procurando um funcionario pelo email: " + email);
		return Optional.ofNullable(funcionarioRepository.findByEmail(email));
	}

	@Override
	public Optional<Funcionario> findByCpfOrEmail(String cpf, String email) {
		log.info("Procurando um funcionario pelo cpf e/ou email: " + cpf + " | " + email);
		return Optional.ofNullable(funcionarioRepository.findByCpfOrEmail(cpf, email));
	}
}
