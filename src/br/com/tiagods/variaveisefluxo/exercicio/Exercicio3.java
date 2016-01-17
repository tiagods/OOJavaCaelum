package br.com.tiagods.variaveisefluxo.exercicio;

public class Exercicio3 {

	public static void main(String[] args){
//		Imprima todos os multiplos de 3  entre 1 até 100
		
		for ( int i = 1; i <= 100; i++){
			if(i % 3 == 0){
				System.out.println(i);
				continue;
			}
		}
		
	}
}
