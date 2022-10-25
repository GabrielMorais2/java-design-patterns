package br.com.gabrielmoraes.loja.orcamento;

import java.util.Map;

import br.com.gabrielmoraes.loja.DomainException;
import br.com.gabrielmoraes.loja.http.httpAdapter;

public class RegistroDeOrcamento {

	private httpAdapter http;

	public RegistroDeOrcamento(httpAdapter http) {
		this.http = http;
	}

	public void registra(Orcamento orcamento) {
		if (!orcamento.isFinalizado()) {
			throw new DomainException("Orcamento não finalizado");
		}
		String url = "http://api.externa/orcamento";
		Map<String, Object> dados = Map.of("valor", orcamento.getValor(), "quantidadeItens",
				orcamento.getQuantidadeItens());

		http.post(url, dados);
	}

}
