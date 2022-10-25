package br.com.gabrielmoraes.loja.orcamento;

public class Reprovado extends SituaçaoOrcamento{
	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());;
	}
}
