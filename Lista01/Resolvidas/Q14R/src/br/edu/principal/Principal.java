package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

	int ano_atual,ano_nascimento,idade_atual,idade_2050;
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Digite o ano atual:");
	ano_atual = sc1.nextInt();
	
	Scanner sc2 = new Scanner(System.in);
	System.out.println("Digite o seu ano de nascimento:");
	ano_nascimento = sc2.nextInt();
	
	idade_atual = ano_atual - ano_nascimento;
	idade_2050 = 2050 - ano_nascimento;
	
	System.out.println("Sua idade atual é: " + idade_atual);
	System.out.println("Sua idade em 2050 será: " + idade_2050);
	
	sc1.close();
	sc2.close();
	
	}

}
