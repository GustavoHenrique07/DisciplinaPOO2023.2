package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args ) {
		
        int n, num, fat = 1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo:");
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite um número inteiro positivo:");
            num = sc.nextInt();
            
            fat = 1; // Reset fat to 1 for each new number
            
            for (int j = 1; j <= num; j++) {
                fat = fat * j;
            }
            
            System.out.println("O valor fatorial do número é: " + fat);
        }
    }
}
