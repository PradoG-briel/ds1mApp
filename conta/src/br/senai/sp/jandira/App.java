package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {
	public static void main(String[] args) {
		
		Conta contaAna = new Conta();
		Conta contaJoao = new Conta();
		
		contaAna.titular = "Ana Gomes";
		contaAna.numero = "111-98";
		contaAna.tipo = "Corrente";
		contaAna.ativa = true;		
		contaAna.chequeEspecial = 200;
		contaAna.depositar(100);
		contaAna.mostrarSaldo();
		contaAna.depositar(30);
		contaAna.mostrarSaldo();
		contaAna.sacar(50);
		contaAna.mostrarSaldo();
		contaAna.sacar(500);
		contaAna.mostrarSaldo();
		
	}
	
	public void somar(int valor1, int valor2) {
		int resultado = valor1 + valor2;
		System.out.println(resultado);
	}
	
}
