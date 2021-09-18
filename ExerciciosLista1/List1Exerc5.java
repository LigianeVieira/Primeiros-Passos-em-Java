package ExerciciosLista1;

//LER IDADE EM ANOS E CALCULAR DIAS

import java.util.Scanner;
  class List1Exerc5 {  
  public static void main(String args[])
    { 
    System.out.print("Digite sua sua idade em anos: ");
    Scanner leitor1 = new Scanner (System.in);
    int anos = leitor1.nextInt();
    
    System.out.print("Digite sua sua idade em meses: ");
    Scanner leitor2 = new Scanner (System.in);
    int meses = leitor2.nextInt();
    
    System.out.print("Digite sua sua idade em dias: ");
    Scanner leitor3 = new Scanner (System.in);
    int dias = leitor3.nextInt();
      
    int diaT = (anos*365) + (meses*30) + dias;
            

     System.out.println ("Sua idade em dias é: " + diaT);
      
     leitor1.close();
     leitor2.close();
     leitor3.close();
      }
  }

