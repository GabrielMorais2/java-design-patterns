package br.com.gabrielmoraes.loja.desconto;

import java.math.BigDecimal;

import br.com.gabrielmoraes.loja.orcamento.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		if(deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	}

	public abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	protected abstract boolean deveAplicar(Orcamento orcamento);
	
}
