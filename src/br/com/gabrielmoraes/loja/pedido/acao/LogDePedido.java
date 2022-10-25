package br.com.gabrielmoraes.loja.pedido.acao;

import br.com.gabrielmoraes.loja.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido {

	@Override
	public void executar(Pedido pedido) {
		System.out.println("Pedido foi gerado: " + pedido);
	}

}
