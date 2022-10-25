package br.com.gabrielmoraes.loja.pedido;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.gabrielmoraes.loja.pedido.acao.EnviarEmailPedido;
import br.com.gabrielmoraes.loja.pedido.acao.LogDePedido;
import br.com.gabrielmoraes.loja.pedido.acao.SalvandoPedidoNoBancoDeDados;

public class TestaPedidos {

	public static void main(String[] args) {

		String cliente = "Rodrigo";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");

		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
				new SalvandoPedidoNoBancoDeDados(),
				new EnviarEmailPedido(),
				new LogDePedido()));
		
		
		handler.execute(gerador);
	}

}
