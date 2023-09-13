package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		double area,raio;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite o raio do circulo: ");
		raio = sc1.nextDouble();
		
		area = 3.1415 * (raio * raio);
		
		sc1.close();
		
		System.out.println("A area do circulo é: " + area);
}
}