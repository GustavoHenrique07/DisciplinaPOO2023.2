package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double sal,salreceber,imp;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite o salario base:");
		sal = sc1.nextDouble();
		
		imp = sal * 10/100;
		
		salreceber = (sal + 50) - imp;
		
		sc1.close();
		
		System.out.println("O salario a receber será de: " + salreceber);
	}

}
