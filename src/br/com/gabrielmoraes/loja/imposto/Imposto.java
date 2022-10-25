package br.com.gabrielmoraes.loja.imposto;

import java.math.BigDecimal;

import br.com.gabrielmoraes.loja.orcamento.Orcamento;

public abstract class Imposto {
	
	protected Imposto outro;
	
	public Imposto(Imposto outro) {
		this.outro = outro;
	}

	public abstract BigDecimal realizarCalculo(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) {
		
		BigDecimal valorImposto = realizarCalculo(orcamento);
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
		if(outro != null) {
			valorDoOutroImposto = outro.realizarCalculo(orcamento);
		}
		
		return valorImposto.add(valorDoOutroImposto);
	}
	
}