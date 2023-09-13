package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double preco,preco_final,imp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto antes dos impostos: ");
		preco = sc.nextInt();
		
		imp = preco * 10/100;
		preco_final = preco - imp;
		
		System.out.println("O valor final do produto é: " + preco_final);
		
	}

}
