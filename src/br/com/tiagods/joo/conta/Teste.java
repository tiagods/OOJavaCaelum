package br.com.tiagods.joo.conta;

public class Teste {

	public static void main(String[] args){

	      Conta minhaConta = new Conta();
	      Cliente c = new Cliente();
	      minhaConta.titular = c;

	      minhaConta.titular.nome = "Duke";

	      System.out.println(minhaConta.titular.nome);
	      
	}
}
