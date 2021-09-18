package ExerciciosLista1;

//CALCULAR MEDIA ARITMETICA SIMPLES

import java.util.Scanner;

public class List1Exerc2 {
	public static void main(String args[]) {
		System.out.println("Digite a sua primeira nota: ");

		Scanner leitor = new Scanner(System.in);
		float primeiraNota = leitor.nextFloat();

		System.out.println("Digite a sua segunda nota nota: ");
		float segundaNota = leitor.nextFloat();

		System.out.println("Digite a sua terceira nota nota: ");
		float terceiraNota = leitor.nextFloat();

		float mediaAri = (primeiraNota + segundaNota + terceiraNota) / 3;

		System.out.print("Sua média é: " + mediaAri);
		leitor.close();
	}
}
