package br.com.gabrielmoraes.loja.imposto;

import br.com.gabrielmoraes.loja.orcamento.Orcamento;

import java.math.BigDecimal;

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
