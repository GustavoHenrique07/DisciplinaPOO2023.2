package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
 
		double At,a,B,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da base maior do trap�zio: ");
		B = sc.nextInt();
		
		System.out.println("Digite o tamanho da base menor do trap�zio: ");
		b = sc.nextInt();
		
		System.out.println("Digite o tamanho da altura do trap�zio: ");
		a = sc.nextInt();
		
		At = ((B + b) * a)/2;
		
		System.out.println("O valor da area do trap�zio �: " + At);
	}

}
