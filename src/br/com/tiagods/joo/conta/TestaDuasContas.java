package br.com.tiagods.joo.conta;

public class TestaDuasContas {

	public static void main(String[] args){
		Conta minhaConta = new Conta();
		Conta meuSonho = new Conta();
		
		minhaConta.saldo = 1000;
		
		meuSonho.saldo = 1500000;
		
		System.out.println("MINHACONTA saldo: " +minhaConta.saldo+ "\nMEUSONHO saldo: " +meuSonho.saldo);
	}
}
