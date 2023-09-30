package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num,r;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		num = sc.nextDouble();
		
		r = num%2;
		if (r == 0) {
			System.out.println("O número é par!");
		}
		else {
			System.out.println("O número é impar!");
			
		}
		
	}

}
