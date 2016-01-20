package br.com.tiagods.variaveisefluxo;

public class condicaoFOR {
		public static void main(String[] args){
		
		/*int i = 10;
		
		for(i = 0; i<18; i++){
			System.out.println(i);
			i++;
		}*/
		
		/*int x = ++i;
		
		for(int y=i; y<=x; y++){
			if(y % 11 == 0){
				System.out.println("Achei um numero divisivel por 11= " +y);
				break;
				
			}
		}*/
		
		for(int y = 1 ; y < 100; y++){
			if(y % 19 == 0){
				System.out.println("Achei um numero divisivel por 19 = " +y);
				continue;
			}
			
		}
		
	}
}
