package br.edu.principal;

import java.util.Scanner;

public class Pricipal {

	public static void main(String[] args) {
		double num1, num2, soma, raiz, op;
		
		System.out.println("          --MENU--            ");
		System.out.println("1 - Somar dois números        ");
		System.out.println("2 - Raiz quadrada de um número" + "\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a opção desejada:");
		op = sc.nextDouble();
		
		if(op == 1) {
			System.out.println("Digite um valor para o primeiro número:");
			num1 = sc.nextDouble();
			
			System.out.println("Digite um valor para o segundo número:");
			num2 = sc.nextDouble();
			
			soma = num1 + num2;
			
			System.out.println( "A soma de " + num1 + "e" + num2 + "é" + soma);
		}
		
		if(op == 2) {
			
			System.out.println("Digite um valor:");
			num1 = sc.nextDouble();
			
			raiz = Math.sqrt(num1);
			
			System.out.println("A raiz quadrada de " + num1 + " é " + raiz);
		}
		
		else {
			System.out.println("OPÇÃO INVÁLIDA!");
		}
	}

}
