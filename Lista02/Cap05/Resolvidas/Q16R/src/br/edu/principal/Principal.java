package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double base = 0, altura = 0, área;
		
		Scanner sc = new Scanner(System.in);
		
		while(base <= 0) {
			System.out.println("Digite a medida da base: ");
			base = sc.nextDouble();
		}
		while(altura <= 0) {
			System.out.println("Digite a medida da altura: ");
			altura = sc.nextDouble();
		}
		
		área = base * altura / 2;
		
		System.out.println("A medida da área é igual a : " + área);
	}

}
