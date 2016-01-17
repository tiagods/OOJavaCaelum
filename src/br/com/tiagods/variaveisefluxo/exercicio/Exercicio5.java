package br.com.tiagods.variaveisefluxo.exercicio;

public class Exercicio5 {

	public static void main(String[] args){
		long fatorial = 1 , resultado=1;
		for (long n = 1; n <= 40; n++) {
			
			resultado = resultado * n;
			System.out.println("O fatorial de "+fatorial+" é igual a "+resultado);
			fatorial++;
        }

 }
}
