package br.com.gabrielmoraes.loja.http;

import java.math.BigDecimal;

import br.com.gabrielmoraes.loja.orcamento.Orcamento;
import br.com.gabrielmoraes.loja.orcamento.ItemOrcamento;
import br.com.gabrielmoraes.loja.orcamento.RegistroDeOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("10")));
		orcamento.aprovar();
		orcamento.finalizar();
	
		RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
		
		registro.registra(orcamento);
		
	}
	
}
