package br.com.tiagods.joo.conta;

public class TestaTransferencia {

	public static void main(String[] args){
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.dono="Manoel";
		c1.saldo=1000;
		c2.dono="Fabio";
		c2.saldo=0;
		
		if(c1.transfere(c2, 1000) == false){
			System.out.println("Transferência não autorizada!");
			System.out.println("Novo saldo em conta de "+c1.dono+": "+c1.saldo);
			
		}
		else{
			System.out.println("Transferência autorizada!");
			System.out.println("Novo saldo de "+c1.dono+": "+c1.saldo);
			System.out.println("Saldo em conta de "+c2.dono+": "+c2.saldo);
		}

		
		
		
	}
	
}
