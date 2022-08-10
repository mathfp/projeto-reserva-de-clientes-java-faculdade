package br.fiap.reserva;

import br.fiap.cliente.Cliente;



public class Reserva {
	private Cliente cliente;
	private boolean pagamentoAVista;
	
	public Reserva(Cliente cliente, boolean pagamentoAVista ) {
		this.cliente = cliente;
		this.pagamentoAVista = pagamentoAVista;
	}
	
	public double calcularPagamento() {
		double pagamento = 3200;
		if(pagamentoAVista) {
			pagamento = pagamento - (pagamento * 0.10); 
		}
		return pagamento;
	}
		
	public String toString() {
				
		String aux = "";
		aux += getCliente();
		if(pagamentoAVista)
		aux += "Forma de pagamento --> A vista"+"\n";
		else
			aux += "Forma de pagamento --> Parcelado"+"\n";	
		
		return aux;		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean isPagamentoAVista() {
		return pagamentoAVista;
	}

	public void setPagamentoAVista(boolean pagamentoAVista) {
		this.pagamentoAVista = pagamentoAVista;
	}	
}
