package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double sal,vendas,comissao,sal_final;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do sal�rio base: ");
		sal = sc.nextInt();
		
		System.out.println("Digite o valor do total de vendas: ");
		vendas = sc.nextInt();
		
		comissao = vendas * 4/100;
		sal_final = sal + comissao;
		
		System.out.println("O valor da comiss�o foi: " + comissao);
		System.out.println("O valor do sal�rio junto com a comiss�o foi: " + sal_final);
		
		
	}

}
