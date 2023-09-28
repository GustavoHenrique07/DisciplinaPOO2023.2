package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double pesos = 0,peso,media_peso,media_peso1,media_peso2,media_peso3,idade,cont1 = 0,cont2 = 0,cont3 = 0,cont = 0,pesos1 = 0,peso1 = 0,pesos2 = 0,peso2 = 0,pesos3 = 0,peso3 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1;i <= 5;i++) {
			System.out.println("Digite sua idade");
			idade = sc.nextDouble();
			
			if(idade >= 1 && idade <= 10) {
				System.out.println("Digite seu peso");
				peso = sc.nextDouble();
				pesos = pesos + peso;
				cont++;
			}
			else if(idade >= 11 && idade <= 20) {
				System.out.println("Digite seu peso");
				peso1 = sc.nextDouble();
				pesos1 = pesos1 + peso1;
				cont1++;
			}
			else if(idade >= 21 && idade <= 30) {
				System.out.println("Digite seu peso");
				peso2 = sc.nextDouble();
				pesos2 = pesos2 + peso2;
				cont2++;
			}
			else if(idade > 30) {
				System.out.println("Digite seu peso");
				peso3 = sc.nextDouble();
				pesos3 = pesos3 + peso3;
				cont3++;
			}
			
		}
		media_peso = pesos/cont;
		media_peso1 = pesos1/cont1;
		media_peso2 = pesos2/cont2;
		media_peso3 = pesos3/cont3;
		
		System.out.println("Media do peso das pessoas com idade entre 1 e 10 anos:" + media_peso);
		System.out.println("Media do peso das pessoas com idade entre 11 e 20 anos:" + media_peso1);
		System.out.println("Media do peso das pessoas com idade entre 21 e 30 anos:" + media_peso2);
		System.out.println("Media do peso das pessoas com idade maior de 30 anos" + media_peso3);
	}

}
