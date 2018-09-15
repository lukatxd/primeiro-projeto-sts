package com.pontointeligente.service;

import java.util.Optional;

import com.pontointeligente.entity.Funcionario;

public interface FuncionarioService {

	/**
	 * Retorna um funcionario dado um CPF
	 * 
	 * @param cnpj
	 * @return
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);

	/**
	 * Retorna um funcionario dado um email
	 * 
	 * @param email
	 * @return
	 */
	Optional<Funcionario> findByEmail(String email);
	
	/**
	 * Retorna um funcionario dado um cpf e/ou email
	 * 
	 * @param cpf
	 * @param email
	 * @return
	 */
	Optional<Funcionario> findByCpfOrEmail(String cpf, String email);
	
	/**
	 * Cadastra um novo Funcionario na base de dados.
	 * 
	 * @param funcionario
	 * @return funcionario
	 */
	Funcionario persistir(Funcionario funcionario);
	
	/**
	 * Remove o funcionario e seus lançamentos da base de dados.
	 * 
	 * @param funcionario
	 * @return
	 */
	void remover(Funcionario funcionario);
}
