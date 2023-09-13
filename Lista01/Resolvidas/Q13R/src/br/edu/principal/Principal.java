package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double pes, polegadas, jardas, milhas;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite a medida em pés:");
		pes = sc1.nextDouble();
		
		polegadas = pes * 12;
		jardas = pes / 3;
		milhas = jardas / 1760;
		
		System.out.println("A medida em polegadas é: " + polegadas);
		System.out.println("A medida em jardas é: " + jardas);
		System.out.println("A medida em milhas é: " + milhas);
		
		sc1.close();
	}

}
