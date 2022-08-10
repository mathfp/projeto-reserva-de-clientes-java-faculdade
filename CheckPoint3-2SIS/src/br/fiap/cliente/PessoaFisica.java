package br.fiap.cliente;

public class PessoaFisica extends Cliente {
	
	private String cpf;
	
	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
	}
	
	public String toString() {
		String aux = super.toString();
		aux += "Tipo --> Pessoa Fisica\n";
		aux += "Cpf --> "+cpf+"\n";		
		return aux;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}		
}
