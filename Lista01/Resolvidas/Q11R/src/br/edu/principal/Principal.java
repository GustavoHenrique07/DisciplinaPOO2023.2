package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num, quad, cubo,r2,r3;
		
		Scanner sc1 = new Scanner(System.in);	
		System.out.println("Digite o número:");
		num = sc1.nextDouble();
		
		quad = num * num;
		cubo = quad * num;
		
		r2 = Math.sqrt(num);
		r3 = Math.cbrt(num);
		
		System.out.println("o número elevado ao quadrado é:" + quad);
		System.out.println("o número elevado ao cubo é:" + cubo);
		System.out.println("a raiz quadrada do número é:" + r2);
		System.out.println("a raiz cúbica do número é:" + r3);
		
		sc1.close();
	}

}
