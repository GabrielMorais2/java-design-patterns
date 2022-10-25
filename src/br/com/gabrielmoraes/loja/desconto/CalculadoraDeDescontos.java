package br.com.gabrielmoraes.loja.desconto;

import java.math.BigDecimal;

import br.com.gabrielmoraes.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoMaisDeCincoItens(
				new DescontoValorAcimaDeQuinhentos(
						new SemDesconto()));

		return desconto.efetuarCalculo(orcamento);
	}
}
