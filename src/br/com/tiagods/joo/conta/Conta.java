package br.com.tiagods.joo.conta;

public class Conta {

	int numero;
	String dono;
	double saldo, limite;
	
//	metodo sem retorno
//	void saca(double quantidade){
//		double novoSaldo = this.saldo - quantidade;
//		this.saldo = novoSaldo;
//	}
	
//	metodo com retorno
	boolean saca(double valor){
		if(this.saldo < valor){
			return false;
		}
		else
			this.saldo = this.saldo - valor;
			return true;
	}
	
	
	void deposita(double quantidade){
		this.saldo += quantidade;
	}
	
	boolean transfere(Conta destino, double valor){
		
		boolean retirou = this.saca(valor);
		if(retirou == false){
			System.out.println("Valor não disponivel na conta");
			return false;
		}
		else{
			destino.deposita(valor);
			return true;
		}
	}
}
