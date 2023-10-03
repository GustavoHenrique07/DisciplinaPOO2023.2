package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner verifique = new Scanner(System.in);
		int senha = 4531;
		
		
		System.out.println("Digite o numero da senha: ");
		senha=verifique.nextInt();
		
		if(senha==4531) {
			System.out.println("Acesso Permitido.");
		}else {
			System.out.println("Acesso Negado.");
		}

	}
}


