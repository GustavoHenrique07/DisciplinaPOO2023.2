package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal,grat = 0,sal_final,imp;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do seu salário:");
		sal = sc.nextDouble() ;
		
		if(sal <= 350) {
			grat = 150;
		}
		else if(sal> 350 && sal < 600) {
			grat = 75;
		}
		else if(sal >= 600 && sal <= 900) {
			grat = 50;
		}
		
		else {
			grat = 35;
		}
		
		sal_final = (sal + grat) - ((sal+grat) * 7/100);
		
		System.out.println("O salário final é de : R$" + sal_final);
	
	}

}
