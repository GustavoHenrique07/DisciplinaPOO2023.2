package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		 double salario, novo_salario, percentual;
	        int ano_atual;

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o ano atual:");
	        ano_atual = sc.nextInt();
	        salario = 1000;
	        percentual = 1.5 / 100;
	        novo_salario = salario + percentual * salario;

	        for (int i = 2007; i <= ano_atual; i++) {
	            percentual = 2 * percentual;
	            novo_salario = novo_salario + percentual * novo_salario;
	        }

	        System.out.println("O valor do seu novo salário é:" + novo_salario);
	    }
	}                    
