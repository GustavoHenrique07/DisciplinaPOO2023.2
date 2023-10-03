package br.edu.pricipal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int i, num, qtde = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro maior que zero:");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++) {
		if(num%i==0) {
		qtde = qtde + 1;
		}
		}

		if(qtde>2) {
		System.out.println("Numero nao primo.");
		}else {
		System.out.println("Numero primo.");
		}

		}
}



