package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double nota1,nota2,nota3,media;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite a primeira nota:");
		nota1 = sc1.nextDouble();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite a segunda nota:");
		nota2 = sc2.nextDouble();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Digite a terceira nota:");
		nota3 = sc3.nextDouble();
		
		
		sc1.close();
		sc2.close();
		sc3.close();

		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("A média final foi: " + media );
	}

}
