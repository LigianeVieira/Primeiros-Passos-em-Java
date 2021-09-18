package ExerciciosLista1;

//CALCULAR % DE VOTOS 

import java.util.Scanner;

public class List1Exerc8 {
	public static void main(String args[]) {
		System.out.print("Digite o valor total de eleitores: ");
		Scanner leitor1 = new Scanner(System.in);
		float eleitorT = leitor1.nextFloat();

		System.out.print("Digite o valor total de votos nulos: ");
		float nulos = leitor1.nextFloat();

		System.out.print("Digite o valor total de votos brancos: ");
		float brancos = leitor1.nextFloat();

		System.out.print("Digite o valor total de votos válidos: ");
		float validos = leitor1.nextFloat();

		float percnulos = (nulos / eleitorT) * 100;
		float percbrancos = (brancos / eleitorT) * 100;
		float percvalidos = (validos / eleitorT) * 100;

		System.out.print("Os valores em percentual são: votos brancos:" + percbrancos + "%, " + "votos nulos:"
				+ percnulos + "%"  + " e votos válidos:" + percvalidos + "%");
		leitor1.close();
	}
}
