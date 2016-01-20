package br.com.tiagods.joo.conta;

public class Programa {

	public static void main(String[] args){
		Conta minhaConta = new Conta();
		
		minhaConta.dono = "Duke";
		minhaConta.saldo = 1000.0;

//		teste de deposito simples						
//		minhaConta.deposita(200);
//		minhaConta.saca(500);
		
		
//		usando metodo de retorno
//		boolean consegui = minhaConta.saca(2000);
//		if(consegui){
//			System.out.println("Consegui sacar");
//		}else
//			System.out.println("Não consegui sacar");
//		
//		System.out.println("Saldo atual: " + minhaConta.saldo);

//		ou
		
		
		if(minhaConta.saca(100)){
			System.out.println("Consegui sacar!");
		}else
			System.out.println("Não consegui sacar, limite indisponivel!");
		
		System.out.println("Saldo atual: " + minhaConta.saldo);
	
		
		
	}
	
	
}
