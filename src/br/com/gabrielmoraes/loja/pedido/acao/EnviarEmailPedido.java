package br.com.gabrielmoraes.loja.pedido.acao;

import br.com.gabrielmoraes.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {
	
	public void executar(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados.");
	}
}
