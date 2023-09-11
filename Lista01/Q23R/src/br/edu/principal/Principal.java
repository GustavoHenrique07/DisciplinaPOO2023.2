package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num_real,p_inteira, p_fracionaria,arredondado;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero real: ");
		num_real = sc.nextDouble();
		
		p_inteira = (int) num_real;
		p_fracionaria = num_real - p_inteira;
		arredondado = Math.round(num_real);
		
		System.out.println("A parte inteira desse numero é: " + p_inteira);
		System.out.println("A parte fracionaria desse numero é: " + p_fracionaria);
		System.out.println("O numero arredondado é: " + arredondado);
	}

}
