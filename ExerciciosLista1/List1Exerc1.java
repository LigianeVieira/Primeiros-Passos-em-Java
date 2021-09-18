package ExerciciosLista1;

//CALCULAR AREA RETANGULO 

import java.util.Scanner;
public class List1Exerc1 {
	public static void main(String args[])
    { 
    System.out.print("Digite o valor da base do retangulo: ");
    
    @SuppressWarnings("resource")
	Scanner leitor = new Scanner (System.in);
    
    float base = leitor.nextFloat();

    System.out.println("Digite o valor da altura do retangulo: ");
    float altura= leitor.nextFloat();
    float area = (base*altura);

     System.out.println (" A área do retangulo é: "+ area);

      }
  }
