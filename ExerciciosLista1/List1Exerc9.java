package ExerciciosLista1;

//CUSTO DE UM CARRO E SEUS IMPOSTOS

import java.util.Scanner;

public class List1Exerc9 {
	public static void main(String args[]) {
		System.out.print("Digite o valor custo de fabrica: ");
		Scanner leitor = new Scanner(System.in);
		float custoFabrica = leitor.nextFloat();

		float percDistribuidor = 28;
		float percImposto = 45;


				float valorImp = custoFabrica*percImposto/100;
				float valordist = custoFabrica * percDistribuidor/100;
				double custoConsu = (custoFabrica+ valorImp + valordist);
				
				System.out.println("O valor de custo da fabrica é:" + custoFabrica);
		        System.out.println("O valor do imposto é: " + valorImp);
		        System.out.println("O valor do distribuidor é: " + valordist);
		        System.out.println("O valor total consumidor: " + custoConsu);

			
		
        leitor.close();
}	}

