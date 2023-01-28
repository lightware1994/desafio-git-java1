package br.com.senaitagua.sa01app1;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa01BO.CalculoBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valor1, valor2;
		
		JOptionPane.showMessageDialog(null, "Empresa Voe, Grupo Empresarial!");
		//Entrada de dados
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro avião: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo avião: "));
		
		// Passar uma mensagem (método) para o objeto
		CalculoBO cbo = new CalculoBO();
		
		//Ultilizar o objeto
		
		
		JOptionPane.showMessageDialog(null, cbo.somar(valor1, valor2));
	}

}
