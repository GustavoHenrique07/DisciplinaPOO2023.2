package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double peso,peso_min,peso_max;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu peso: ");
		peso = sc.nextInt();
		
		peso_max = peso + (peso * 15/100);
		peso_min = peso - (peso * 20/100);
		
		System.out.println("Seu peso após engordar 15% seria: " + peso_max + "kg");
		System.out.println("Seu peso após emagrecer 20% seria: " + peso_min + "kg");
	}

}
