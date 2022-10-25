package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoValorAcimaDeQuinhentos extends Desconto {

	public DescontoValorAcimaDeQuinhentos(Desconto proximo) {
		super(proximo);
	}

	
	protected boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor() == new BigDecimal("500");
	}
	
	public BigDecimal efetuarCalculo(Orcamento orcamento) {

		return orcamento.getValor().multiply(new BigDecimal("0.05"));

	}

}
