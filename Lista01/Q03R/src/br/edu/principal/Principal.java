package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double nota1 = 8 ,nota2 = 9, nota3= 6,peso1 = 1,peso2 = 2,peso3 = 3,media; 
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite a primeira nota:");
		nota1 = sc1.nextDouble();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite a segunda nota:");
		nota2 = sc2.nextDouble();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Digite a terceira nota:");
		nota3 = sc3.nextDouble();
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Digite o peso da primeira nota:");
		peso1 = sc4.nextDouble();
		
		Scanner sc5 = new Scanner(System.in);
		System.out.println("Digite o peso da segunda nota:");
		peso2 = sc5.nextDouble();
		
		Scanner sc6 = new Scanner(System.in);
		System.out.println("Digite o peso da terceira nota:");
		peso3 = sc6.nextDouble();
		
		sc1.close();
		sc2.close();
		sc3.close();
		sc4.close();
		sc5.close();
		sc6.close();

		media = (nota1*peso1+nota2*peso2+nota3*peso3)/(peso1+peso2+peso3);
		
		System.out.println("A média final foi: " + media);
		
	}

}
