package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double pre, valor_adic = 0, imposto , pre_custo, desconto, novo_pre;
		
		String tipo, refrig;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço: ");
		pre = sc.nextDouble();
		
		System.out.println("Digite o tipo: " + "\nA-Alimentação" + "\nL-Limpeza" + "\nV-Vestuário");
		tipo = sc.next();
		
		System.out.println("Digite a Refrigeração: " + "\nS — produto que necessita de refrigeração" + "\nN — produto que não necessita de refrigeração");
		refrig = sc.next();
		
		if(refrig.equals("N")) {
			if(tipo.equals("A")) {
				if (pre < 15) {
					valor_adic = 2;
				}
				else {
					valor_adic = 5;
				}
				}
				
			if(tipo.equals("L")) {
				if (pre < 10) {
					valor_adic = 1.50;
				}
				else {
					valor_adic = 2.50;
				}
				}
			
			if(tipo.equals("V")) {
				if (pre < 30) {
					valor_adic = 3;
				}
				else {
					valor_adic = 2.5;
				}
				}
			
			}
		else if(refrig.equals("S")) {
			if(tipo.equals("A")) {
				valor_adic = 8;
			}
			else if(tipo.equals("L")) {
				valor_adic = 0;
			}
			else if(tipo.equals("V")) {
				valor_adic = 0;
			}
		}
		else {
			System.out.println("Opção Inválida!");
		}
		
		System.out.println("O valor adicional foi: " + valor_adic);

		if (pre < 25) {
			imposto = pre * 5/100 ;
		}
		else {
			imposto = pre * 8/100 ;
		}
		
		System.out.println("O valor do imposto foi: " + imposto);
		
		pre_custo = pre + imposto;
		
		System.out.println("O valor do custo com imposto foi: " + pre_custo);
		
		if(tipo.equals("A") && refrig.equals("S")){
			desconto = 0;
		}
		else if(tipo.equals("A") || refrig.equals("S")) {
			desconto = 0;
		}
		else {
			desconto = pre_custo * (3 / 100);
		}
		System.out.println("O valor do desconto foi: " + desconto);
		
		novo_pre = pre_custo + valor_adic - desconto;
		
		System.out.println("O valor do preço de custo mais adicional menos desconto foi : " + novo_pre);
		
		if(novo_pre <= 50) {
			System.out.println("PRODUTO BARATO");
		}
		else if(novo_pre < 100) {
			System.out.println("PRODUTO COM PREÇO NORMAL");
		}
		else{
			System.out.println("PRODUTO CARO");
		}
		
	}

}
