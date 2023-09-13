package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num, num2, r1, r2;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		num = sc1.nextDouble();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite o segundo número:");
		num2 = sc1.nextDouble();
		
		r1 = Math.pow(num, num2);
		r2 = Math.pow(num2, num);
		
		System.out.println("o resultado do primeiro elevado ao segundo foi:" + r1);
		System.out.println("o resultado do segundo elevado ao primeiro foi:" + r2);
		
		sc1.close();
		sc2.close();
	}

}
