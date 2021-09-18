package ExerciciosLista1;

//LER TEMPERATURA EM F E CALCULAR CELSIUS

import java.util.Scanner;

public class List1Exerc6 {
	
	public static void main(String args[]) {
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		Scanner leitor1 = new Scanner(System.in);
		int F = leitor1.nextInt();

		float tempC = (F - 32) * 5 / 9;

		System.out.println("A temperatura em Celsius é: " + tempC);
		leitor1.close();
	}
}
