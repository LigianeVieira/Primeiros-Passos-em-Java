package ExerciciosLista1;

//CALCULAR MEDIA FINAL PONDERADA DE UM ALUNO

import java.util.Scanner;

public class List1Exerc3 {
	public static void main(String args[]) {
		System.out.println("Digite a sua primeira nota: ");

		Scanner leitor = new Scanner(System.in);
		float primeiraNota = leitor.nextFloat();

		System.out.println("Digite a sua segunda nota nota: ");
		float segundaNota = leitor.nextFloat();

		System.out.println("Digite a sua terceira nota nota: ");
		float terceiraNota = leitor.nextFloat();

		
		float peso1 = 2;
		float peso2 = 3;
		float peso3 = 5;
		
		float mediaAri = (primeiraNota + segundaNota + terceiraNota) / 3;
		float mediaPonderada = 	((primeiraNota*peso1) + (segundaNota*peso2) + (terceiraNota*peso3) )/(peso1+peso2+peso3);
	    
	    System.out.print("Sua média é: " + mediaAri  +  "e média ponderada: " + mediaPonderada);
	    leitor.close();		
	}
}


