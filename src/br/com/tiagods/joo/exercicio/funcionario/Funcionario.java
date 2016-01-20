package br.com.tiagods.joo.exercicio.funcionario;

/*Esboço
 * Modele um funcionário. Ele deve ter o nome do funcionário, o departamento onde trabalha, seu salário
(double), a data de entrada no banco (String) e seu RG (String).
Você deve criar alguns métodos de acordo com sua necessidade. Além deles, crie um método
recebeAumento que aumenta o salario do funcionário de acordo com o parâmetro passado como argumento.
Crie também um método calculaGanhoAnual, que não recebe parâmetro algum, devolvendo
o valor do salário multiplicado por 12..
A ideia aqui é apenas modelar, isto é, só identique que informações são importantes e o que um funcionário
faz. Desenhe no papel tudo o que um Funcionario tem e tudo que ele faz.
 */


public class Funcionario {

	String nome;
	String departamento;
	double salario;
	String rg;
	String dataEntradaBanco;
	boolean ativoNaEmpresa;
	
	
	
	boolean recebeAumento(double valor){
		if (ativoNaEmpresa == true){
			this.salario += valor;
			System.out.println("Salário reajustado, novo salario: " +this.salario);
					
			return true;
		}
		else{
			System.out.println("Funcionario demitido não recebe aumento!");
			return false;
		}
	}
	double calculaGanhoAnual(){
		return this.salario = this.salario * 12;
		
	}
	boolean demite(){
		if(ativoNaEmpresa == true){
			System.out.println("Funcionario demitido em 18/01/2015!");
			ativoNaEmpresa = false;
			return true;
		}
		else{
			System.out.println("O funcionario já foi demitido antes!");
			return false;
		}
			
	}
	void mostrar(){
		String status= "";
		if(ativoNaEmpresa == false){
			status="Ativo";
			
		}
		else{
			status="Inativo";
		}
			
		System.out.println("Nome: " +this.nome+
				"Rg: "+this.rg+
				"Data de Entrada: "+this.dataEntradaBanco+
				"Departamento: "+this.departamento+
				"Salario: " + this.salario+
				"Status: " + status);
	}
	
}
