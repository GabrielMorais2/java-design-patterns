package br.com.gabrielmoraes.loja.desconto;

import java.math.BigDecimal;

import br.com.gabrielmoraes.loja.orcamento.Orcamento;
import br.com.gabrielmoraes.loja.orcamento.ItemOrcamento;

public class TestesChainResponsibility {
	public static void main(String[] args) {

		Orcamento primeiro = new Orcamento();
		primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		Orcamento segundo = new Orcamento();
		segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));

	}
}
