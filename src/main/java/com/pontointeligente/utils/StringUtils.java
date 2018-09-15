package com.pontointeligente.utils;

public class StringUtils {

	public static boolean isEmpty(String stringText) {
		if (stringText == null || stringText.trim().isEmpty() || stringText.trim().length() == 0)
			return true;
		else
			return false;
	}

}
