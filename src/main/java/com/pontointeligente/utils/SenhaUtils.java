package com.pontointeligente.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

	public static String gerarBcrypt(String senha) {
		if (StringUtils.isEmpty(senha)) {
			return senha;
		}
		return new BCryptPasswordEncoder().encode(senha);
	}

	public static boolean isSenhaValida(String senha, String senhaEncoded) {
		return new BCryptPasswordEncoder().matches(senha, senhaEncoded);
	}
}