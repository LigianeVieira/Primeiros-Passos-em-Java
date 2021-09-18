package ExerciciosLista1;

//VALOR SALARIO DE UM VENDEDOR DE CARROS

import java.util.Scanner;


public class List1Exerc10 {
	public static void main(String args[]) {

		System.out.print("Digite a quantidade de carros vendidos: ");
		Scanner leitor = new Scanner(System.in);
		int Carros = leitor.nextInt();

		System.out.print("Digite o valor total de suas vendas: ");
		float valorvendas = leitor.nextFloat();

		System.out.print("Digite o valor de seu salario fixo: ");
		float salario = leitor.nextFloat();

		System.out.print("Digite sua comissão fixa por carro vendido: ");
		float valor = leitor.nextFloat();

		float salariofinal = (salario + (valorvendas * 0.05f) + (Carros * valor));
		System.out.print("O valor final do seu sálario será: " + salariofinal);
		leitor.close();
	}
}
