package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double pre, valor_adic = 0, imposto, novo_pre;
		
		String tipo, refrig;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço: ");
		pre = sc.nextDouble();
		
		System.out.println("Digite o tipo: " + "\n1-Alimentação" + "\n2-Limpeza" + "\n3-Vestuário");
		tipo = sc.next();
		
		System.out.println("Digite a Refrigeração: " + "\nR — produto que necessita de refrigeração" + "\nN — produto que não necessita de refrigeração");
		refrig = sc.next();
		
		if(pre <= 25) {
		if (tipo.equals("1")) {
			valor_adic = pre * 5/100;
		}
		else if (tipo.equals("2")) {
			valor_adic = pre * 8/100;
		}
		else if (tipo.equals("2")) {
			valor_adic = pre * 10/100;
		}
		else {
			System.out.println("Opção Inválida");
		}
		
		}
		
		if(pre > 25) {
			if (tipo.equals("1")) {
				valor_adic = pre * 12/100;
			}
			else if (tipo.equals("2")) {
				valor_adic = pre * 15/100;
			}
			else if (tipo.equals("2")) {
				valor_adic = pre * 18/100;
			}
			else {
				System.out.println("Opção Inválida");
			}
			
			}
		
		if(tipo.equals("2") || refrig.equals("R")) {
			imposto = pre * 5/100;
		}
		else {
			imposto = pre * 8/100;
		}
		
		novo_pre = (pre + valor_adic) - imposto;
		
		System.out.println("O valor final do aumento é de :R$" + valor_adic);
		System.out.println("O valor final do imposto é de :R$" + imposto);
		System.out.println("O valor total final é de :R$" + novo_pre);
		if(novo_pre <= 50) {
			System.out.println("PRODUTO BARATO");
		}
		else if(novo_pre < 120) {
			System.out.println("PRODUTO COM PREÇO NORMAL");
		}
		else{
			System.out.println("PRODUTO CARO");
		}
		
	}

}
