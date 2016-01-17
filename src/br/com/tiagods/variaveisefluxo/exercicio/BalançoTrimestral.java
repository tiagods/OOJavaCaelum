package br.com.tiagods.variaveisefluxo.exercicio;

public class BalançoTrimestral {

	public static void main(String[] args){
		
		int gastosJaneiro=15000, gastosFevereiro=23000, gastosMarco=17000;
		int gastosTrimestre= gastosJaneiro + gastosFevereiro + gastosMarco;
		
		System.out.println("Total de gastos no trimestre: " +gastosTrimestre);
		
		int mediaMensal = gastosTrimestre / 3;
		
		System.out.println("Total de gastos em media: " +mediaMensal);
		
		
	}
	
}
