package br.com.tiagods.variaveisefluxo;

public class variaveisSimples {

	public static void main(String[] args) {
		// declarando idade
		int idade = 15;
		System.out.println(idade);

		// calculo simples
		int idadeanoquevem = idade + 1;
		System.out.println(idadeanoquevem);

		// verdadeiro ou falso
		boolean menordeIdade = idade < 18;

		// condicional simples simples
		if (menordeIdade == true) {
			System.out.println("Você é menor de idade!");
		} else
			System.out.println("Você é maior de idade!");

		// auxiliar

		int aux = 5;
		int j = aux;
		aux = j + 1;

	}

}
