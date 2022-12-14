package br.com.gabrielmoraes.loja.orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituaçaoOrcamento{
	@Override
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.02"));
	}
	
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
