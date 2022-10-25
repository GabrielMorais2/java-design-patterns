package br.com.gabrielmoraes.loja.imposto;

import java.math.BigDecimal;

import br.com.gabrielmoraes.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {
	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
		
	}
}
