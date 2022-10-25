package br.com.gabrielmoraes.loja.imposto;

import java.math.BigDecimal;

import br.com.gabrielmoraes.loja.orcamento.Orcamento;
import br.com.gabrielmoraes.loja.orcamento.ItemOrcamento;

public class TestesStrategy {
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		
		System.out.println(calculadora.calcular(orcamento, new ICMS(new ISS(null))));
	}
}
