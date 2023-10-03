package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double op, sal, imp, aum, novosal;


		System.out.println("Menu de opções");
		System.out.println("1.Imposto");
		System.out.println("2.Novo salário");
		System.out.println("3.Classificação");
		System.out.println("4.Digite a opção desejada");

		System.out.println("Digite a opção desejada: ");
		op=sc.nextDouble();

		if(op==1) {
		System.out.println("Digite o valor do salario:");
		sal=sc.nextDouble();
		if(sal<500) {
		imp=sal*5/100;
		System.out.println("O valor do imposto é " +imp);
		}else if(sal >=500 && sal<850) {
		imp=sal*10/100;
		System.out.println("O valor do imposto é " +imp);
		}else if(sal>850) {
		imp=sal*15/100;
		System.out.println("O valor do imposto é " +imp);
		}
		}

		if(op==2) {
		System.out.println("Digite o valor do salario:");
		sal=sc.nextDouble();

		if(sal>1500) {
		aum=sal+25;
		System.out.println("O valor do salário agora é de R$" +aum);
		}else if(sal>=750 && sal<=1500) {
		aum=sal+50;
		System.out.println("O valor do salário agora é de R$" +aum);
		}else if(sal>=450 && sal<750) {
		aum=sal+75;
		System.out.println("O valor do salário agora é de R$" +aum);
		}else if(sal<450) {
		aum=sal+100;
		System.out.println("O valor do salário agora é de R$" +aum);
		}
		}


		if(op==3) {
		System.out.println("Digite o valor do salario:");
		sal=sc.nextDouble();

		if(sal<=700) {
		System.out.println("Mal remunerado.");
		} else if(sal>700) {
		System.out.println("Bem remunerado.");
		}
		}

		if(op<1 || op>3) {
		System.out.println("Opção inválida.");
		}

		}




		





	}


