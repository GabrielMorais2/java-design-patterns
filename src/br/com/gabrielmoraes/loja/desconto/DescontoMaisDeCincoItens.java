package br.com.gabrielmoraes.loja.desconto;

import java.math.BigDecimal;

import br.com.gabrielmoraes.loja.orcamento.Orcamento;

public class DescontoMaisDeCincoItens extends Desconto {

	public DescontoMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	protected boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}
	
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
