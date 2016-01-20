package br.com.tiagods.joo.conta;

public class TestaReferencias {

	public static void main(String[] args){
		Conta c1 = new Conta();
		c1.deposita(100);
		Conta c2 = c1; //passa a ser uma referencia nas duas classes,
		
		c2.deposita(200);
		c1.dono= "Duke";
		c2.dono= "Duke";
		
		System.out.println("Conta 1: " +c1.saldo);
		System.out.println("Conta 2: " +c2.saldo);
		//como a referencia é a mesma as contas terão o mesmo saldo
		
		if (c1 == c2) {//vai verificar o conteudo das contas, se forem iguais retorna mensagem
			System.out.println("Contas iguais");
		}
		
	}
	
}
