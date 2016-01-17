package br.com.tiagods.variaveisefluxo;

public class condicaoIFELSE {

	
	public static void main(String[] args){
		
		int idade = 15;
		
		boolean amigodoDono = false;
		
		//if (idade < 18 && amigodoDono==false){
		if (idade<18 && !amigodoDono){
			System.out.println("Não pode entrar");
		}
		else
			System.out.println("Entrada permitida");
	}
}
