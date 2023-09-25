package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal,aumento = 0,sal_final;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do seu salário:");
		sal = sc.nextDouble() ;
		
		if(sal<=500) {
			aumento = sal * 30/100;
		}
		else {
			System.out.println("O funcionário não tem direito ao aumento. ");
		}
		
		sal_final = sal + aumento;
		
		System.out.println("O salário final é de : R$" + sal_final);
	}

}
