package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		double sal,salreceber,grat,imp;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite o salario base:");
		sal = sc1.nextDouble();
		
		grat = sal * 5/100;
		imp = sal * 7/100;
		
		salreceber = (sal + grat) - imp;
		
		System.out.println("O salário a receber será " + salreceber);
	
		sc1.close();
	}

}
