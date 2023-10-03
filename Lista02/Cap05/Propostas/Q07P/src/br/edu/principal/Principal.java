package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i,idade = 0,altura,peso,qtd_idade=0,soma_altura=0,peso_40=0,media_altura = 0,perc = 0;
		
		
		for(i=1;i<=5;i++) {
			System.out.println("Digite o peso da " +i+ "ª pessoa.");
			peso=sc.nextDouble();
			
			System.out.println("Digite a idade da " +i+ "ª pessoa.");
			idade=sc.nextDouble();
			
			System.out.println("Digite a altura da " +i+ "ª pessoa.");
			altura=sc.nextDouble();
			
			if(idade>50) {
				qtd_idade+=1;
			}
			
			if(idade>=10 && idade<=20) {
				soma_altura+=1;
			}
			
			if(peso<40) {
				peso_40+=1;
			}
			
			media_altura=soma_altura/5;
			perc=(peso_40/5)*100;
			
			
		}
		
		System.out.println("a quantidade de pessoas com idade superior a 50 anos:" +qtd_idade);
		System.out.println("a média das alturas das pessoas com idade entre 10 e 20 anos:" +media_altura);
		System.out.println("a porcentagem de pessoas com peso inferior a 40 kg entre todas as pessoas analisadas." +perc);

	}

}


