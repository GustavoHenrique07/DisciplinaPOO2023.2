package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double cod_prod, peso_quilos,cod_pais, peso_gramas , pre_total,
		imposto = 0, valor_total, pre_grama = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do produto comprado:");
		cod_prod = sc.nextDouble();
		
		System.out.println("Digite o peso do produto em quilos:");
		peso_quilos = sc.nextDouble();
		
		System.out.println("Digite o código do país de origem:");
		cod_pais = sc.nextDouble();
		
		peso_gramas = peso_quilos * 1000;
		
		System.out.println("O peso em gramas foi de: " + peso_gramas + "g");
		
		if(cod_prod >= 1 && cod_prod <= 4) {
			pre_grama = 10;
		}
		else if(cod_prod >= 5 && cod_prod <= 7) {
			pre_grama = 25;
		}
		else if(cod_prod >= 8 && cod_prod <= 10) {
			pre_grama = 35;
		}
		
		pre_total = peso_gramas * pre_grama;
		
		System.out.println("O preço total foi de: " + pre_total + " reais");
		
		if(cod_pais == 1) {
			imposto = 0;
		}
		if(cod_pais == 2) {
			imposto = pre_total * 15/100;
		}
		if(cod_pais == 3) {
			imposto = pre_total * 25/100;
		}
		
		System.out.println("O valor do imposto é de: " + imposto + " reais");
		
		valor_total = pre_total + imposto;
		
		System.out.println("O valor final após impostos foi de: " + valor_total + " reais");
	}

}
