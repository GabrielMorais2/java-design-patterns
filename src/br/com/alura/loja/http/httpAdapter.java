package br.com.alura.loja.http;

import java.util.Map;

public interface httpAdapter {

	void post(String url, Map<String, Object> dados);
}
