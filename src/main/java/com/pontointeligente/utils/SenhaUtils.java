package com.pontointeligente.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

	private static final Logger log = LoggerFactory.getLogger(SenhaUtils.class);

	public static String gerarBcrypt(String senha) {
		if (StringUtils.isEmpty(senha)) {
			return senha;
		}
		log.info("Gerando hash com BCrypt para senha: " + senha);
		return new BCryptPasswordEncoder().encode(senha);
	}

	public static boolean isSenhaValida(String senha, String senhaEncoded) {
		log.info("Validando senha:" + senha + " | " + senhaEncoded);
		return new BCryptPasswordEncoder().matches(senha, senhaEncoded);
	}
}
