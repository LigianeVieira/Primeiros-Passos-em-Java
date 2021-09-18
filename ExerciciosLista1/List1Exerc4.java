package ExerciciosLista1;

//LER IDADE EM DIAS E CALCULAR ANOS,MESES

import java.util.Scanner;
public class List1Exerc4 {  
  public static void main(String args[])
    { 
    System.out.print("Digite sua sua idade em dias: ");
    Scanner leitor = new Scanner (System.in);
    int diasidade = leitor.nextInt();
      
     int anos= diasidade/365;
     int meses = (diasidade%365)/30;
     int dias = (diasidade%365)%30;    

     System.out.println ("Sua idade em anos é: " + anos);
     System.out.println ("Sua idade em meses é: " + meses);   
     System.out.println ("Sua idade em dias é: " + dias); 
     
     leitor.close();
      }
  }
