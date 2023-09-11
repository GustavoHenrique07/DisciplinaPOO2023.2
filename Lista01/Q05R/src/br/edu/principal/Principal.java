package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double sal,perc = 25,aumento,novosal;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite o salario base:");
		sal = sc1.nextDouble();
		
		aumento = sal * perc/100;
		novosal = sal + aumento;
		
		sc1.close();
		
		System.out.println("O aumento foi de: R$" + aumento);
		System.out.println("O salário final é de: R$" + novosal);
		
	}

}
