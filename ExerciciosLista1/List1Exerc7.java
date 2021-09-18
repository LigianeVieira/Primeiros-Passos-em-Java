package ExerciciosLista1;

//LER SALARIO E %DE REAJUSTE E CALCULAR NOVO SALARIO

import java.util.Scanner;

public class List1Exerc7 {

	public static void main(String args[]) {
		System.out.print("Digite o valor do seu sálario sem reajuste: ");
		Scanner leitor = new Scanner(System.in);
		float salario = leitor.nextFloat();
		System.out.print("Digite o percentual de reajuste: ");
		float percReaj = leitor.nextFloat();
		float percentual = percReaj / 100;

		float salarioFinal = salario * percentual + salario;

		System.out.println("Seu salário com reajuste é: " + salarioFinal);
		leitor.close();
	}
}
