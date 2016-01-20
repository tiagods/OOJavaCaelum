package br.com.tiagods.joo.exercicio.funcionario;

public class TestaFuncionario {
	
	public static void main(String[] args){
		
		Funcionario f1 = new Funcionario();
		
		f1.nome="Fabio";
		f1.departamento="Tesouraria";
		f1.rg = "11111111-0";
		f1.salario=5000.0;
		f1.dataEntradaBanco="18/01/2014";
		f1.ativoNaEmpresa=true;
		
//		f1.demite();
		
		f1.recebeAumento(1000);
		System.out.println("Rendimentos previstros em 2015: " +f1.calculaGanhoAnual());
		
	}
	
}
