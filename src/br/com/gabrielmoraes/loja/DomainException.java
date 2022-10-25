package br.com.gabrielmoraes.loja;

public class DomainException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public DomainException(String string) {
		super(string);
	}
}
