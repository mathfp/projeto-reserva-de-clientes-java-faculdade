package br.fiap.util;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;


import br.fiap.cliente.PessoaFisica;
import br.fiap.cliente.PessoaJuridica;
import br.fiap.reserva.Reserva;

public class Util {

	Scanner teclado = new Scanner(System.in);
	ArrayList<Reserva> listaReserva = new ArrayList<Reserva>();
	ArrayList<Reserva> listaEspera = new ArrayList<Reserva>();
	

	public String gerarMenu() {
		String aux = "";

		aux += "Restaurante SABOR SOFISTICADO\n";
		aux += "1. Reservar Mesa\n";
		aux += "2. Pesquisar Reserva\n";
		aux += "3. Imprimir Reservas\n";
		aux += "4. Imprimir lista de espera\n";
		aux += "5. Cancelar Reserva\n";
		aux += "6. Finalizar\n";

		return aux;
	}
	
	public void reservarMesa() {
	int opcaoPagamento, opcaoTipo;
			
		boolean formaPagamento = true;

		if (listaReserva.size() < 5) {

			String nome = JOptionPane.showInputDialog("Digite seu nome");

			opcaoPagamento = Integer
					.parseInt(JOptionPane.showInputDialog("Forma de Pagamento\n1. A vista\n 2. Parcelado"));
			switch (opcaoPagamento) {
			case 1:
				formaPagamento = true;
				break;
			case 2:
				formaPagamento = false;
				break;
			}

			opcaoTipo = Integer.parseInt(JOptionPane.showInputDialog("1. Pessoa Fisica\n 2. Pessoa Juridica"));
			switch (opcaoTipo) {
			case 1:
				String cpf = JOptionPane.showInputDialog("Digite seu cpf");
				PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf);
				listaReserva.add(new Reserva(pessoaFisica, formaPagamento));
				break;
			case 2:
				String cnpj = JOptionPane.showInputDialog("Digite seu cnpj");
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, cnpj);
				listaReserva.add(new Reserva(pessoaJuridica, formaPagamento));
				break;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Você estará na lista de espera!");

			String nome = JOptionPane.showInputDialog("Digite seu nome");

			opcaoPagamento = Integer
					.parseInt(JOptionPane.showInputDialog("Forma de Pagamento\n1. A vista\n 2. Parcelado"));
			switch (opcaoPagamento) {
			case 1:
				formaPagamento = true;
				break;
			case 2:
				formaPagamento = false;
				break;
			}

			opcaoTipo = Integer.parseInt(JOptionPane.showInputDialog("1. Pessoa Fisica\n 2. Pessoa Juridica"));
			switch (opcaoTipo) {
			case 1:
				String cpf = JOptionPane.showInputDialog("Digite seu cpf");
				PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf);
				listaEspera.add(new Reserva(pessoaFisica, formaPagamento));
				break;
			case 2:
				String cnpj = JOptionPane.showInputDialog("Digite seu cnpj");
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, cnpj);
				listaEspera.add(new Reserva(pessoaJuridica, formaPagamento));
				break;
			}
		}
	}
	
	
	public void pesquisarReserva() {
		Reserva aux;
		boolean temReserva = true;
		boolean temLista = true;
		String id = JOptionPane.showInputDialog("Digite seu cpf ou cnpj");
		
			for(int i = 0; i < listaReserva.size(); i++) {
				aux = listaReserva.get(i);
				if(aux.toString().contains(id)) {					
					JOptionPane.showMessageDialog(null, "Cliente tem reserva\n"+aux.getCliente());
					temReserva = true;
					break;
				}else {
					temReserva = false;
				}
			}
			if(temReserva == false) {
				JOptionPane.showMessageDialog(null, "Cliente não possui reserva");
			}
			
			if(listaReserva.size() >= 5 && temReserva == false) {
			
				for(int i = 0; i < listaEspera.size(); i++) {
					aux = listaEspera.get(i);
					if(aux.toString().contains(id)) {
						JOptionPane.showMessageDialog(null, "Cliente está na lista de espera");
						temLista = true;
					}else{
						temLista = false;
					}
				}
				if(temLista == false) {
					JOptionPane.showMessageDialog(null, "Cliente não está na lista de espera");
				}
			}				
	}
	
	public String imprimirReservas() {
		Reserva aux;
		String reserva = "";
		for(int i = 0; i < listaReserva.size(); i++) {
			aux = listaReserva.get(i);
			reserva += aux.toString()+"\n";			
		}
		return reserva;
	}
	
	public String imprimirEspera() {
		Reserva aux;
		String reserva = "";
		for(int i = 0; i < listaEspera.size(); i++) {
			aux = listaEspera.get(i);
			reserva += aux.toString()+"\n";			
		}
		return reserva;
	}
	
	public void cancelarReserva() {
		Reserva aux;
		boolean temReserva = true;
		int r = 0;
		String id = JOptionPane.showInputDialog("Digite seu cpf ou cnpj");
		
			for(int i = 0; i < listaReserva.size(); i++) {
				aux = listaReserva.get(i);
				if(aux.toString().contains(id)) {
					temReserva =true;
					JOptionPane.showMessageDialog(null, "Foi excluida a reserva do cliente\n "+aux.getCliente());
					listaReserva.remove(i);
					if(!listaEspera.isEmpty()) {
						listaReserva.add(listaEspera.get(r));
						JOptionPane.showMessageDialog(null, "Um cliente da lista de espera foi para lista de reservas!");
						listaEspera.remove(r);						
					}
					break;
				}else{
					temReserva =false;
				}
			}
			if(temReserva == false) {
				JOptionPane.showMessageDialog(null, "Reserva não encontrada!");
			}
	}
	
	public void finalizar() {
		
		int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja finalizar?");

		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Restaurante SABOR SOFISTICADO agradece!");
		}else {
			JOptionPane.showMessageDialog(null, "Obrigado por ter ficado!");
		}
	}
	
	
	
	
}
