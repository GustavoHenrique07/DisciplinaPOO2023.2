package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
   
	double novosal,sal;
	
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Digite o salario base:");
	sal = sc1.nextDouble();
	
	sc1.close();
    
    System.out.println("O salário base é:" + sal);
    novosal = sal + sal * 25/100;
    System.out.println("O salário após o aumento é:" + novosal);
	}

}
