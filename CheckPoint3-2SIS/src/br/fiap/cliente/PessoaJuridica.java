package br.fiap.cliente;

public class PessoaJuridica extends Cliente {
	private String cnpj;
	
	public PessoaJuridica(String nome, String cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}
	
	public String toString() {
		String aux = super.toString();
		aux += "Tipo --> Pessoa Juridica\n";
		aux += "Cnpj --> "+cnpj+"\n";
		return aux;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
