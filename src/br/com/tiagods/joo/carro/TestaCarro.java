package br.com.tiagods.joo.carro;

public class TestaCarro {

	public static void main(String[] args){
		Carro meuCarro = new Carro();
		meuCarro.cor="Verde";
		meuCarro.modelo="Fusca";
		meuCarro.velocidadeAtual=0;
		meuCarro.velocidadeMaxima=80;
		
		meuCarro.liga();
		
		meuCarro.acelera(20);
		System.out.println("Velocidade Atual:" +meuCarro.velocidadeAtual);
		System.out.println("Marcha: " +meuCarro.pegaMarcha());		
		
	}
	
}
