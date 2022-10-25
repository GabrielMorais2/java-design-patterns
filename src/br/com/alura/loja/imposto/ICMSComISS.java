package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class ICMSComISS extends Imposto{

	public ICMSComISS(Imposto outro) {
		super(outro);
	}

	@Override
	public BigDecimal realizarCalculo(Orcamento orcamento) {
		
		BigDecimal icms = new ICMS(outro).realizarCalculo(orcamento);
		BigDecimal iss = new ISS(outro).realizarCalculo(orcamento);
		return icms.add(iss);
	}

}
