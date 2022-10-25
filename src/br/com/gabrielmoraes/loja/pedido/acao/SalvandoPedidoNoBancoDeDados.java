package br.com.gabrielmoraes.loja.pedido.acao;

import br.com.gabrielmoraes.loja.pedido.Pedido;

public class SalvandoPedidoNoBancoDeDados implements AcaoAposGerarPedido{
	
	public void executar(Pedido pedido) {
		System.out.println("Enviando email com dados do pedido");
	}
}
