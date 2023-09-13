package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double base,altura,area;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite o tamanho da base do triangulo: ");
		base = sc1.nextDouble();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite o tamnho da altura do triangulo: ");
		altura = sc1.nextDouble();
		
		area = (base * altura)/2;
		
		sc1.close();
		sc2.close();
		
		System.out.println("A área do triangulo é: " + area );
		
		
		
	}

}
