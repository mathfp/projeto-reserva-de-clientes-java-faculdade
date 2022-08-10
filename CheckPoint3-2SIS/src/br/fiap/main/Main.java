package br.fiap.main;

import javax.swing.JOptionPane;

import br.fiap.util.Util;

public class Main {

	public static void main(String[] args) {
		Util util = new Util();
		int opcao;
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(util.gerarMenu()));
			
			switch(opcao) {
			case 1:
					util.reservarMesa();
					break;
			case 2:
					util.pesquisarReserva();
					break;
			case 3:
					JOptionPane.showMessageDialog(null, util.imprimirReservas());
					break;
			case 4:
					JOptionPane.showMessageDialog(null, util.imprimirEspera());
					break;
			case 5:
					util.cancelarReserva();
					break;
			case 6:
					util.finalizar();
					break;
			}
			
		}while(opcao != 6);

	}

}
