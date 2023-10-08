package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int  i, j = 0, z, aux,X[] = new int[5], Y[] = new int[5], R[] = new int[10];
	
		Scanner sc = new Scanner(System.in);
		
		for(i = 1;i <= 5;i++) {
			System.out.println("Digite um elemento:");
			X[i] = sc.nextInt();
			
		}
		for(i = 1;i <= 5;i++) {
			for(j = 1;j <= 4;j++) {
				if (X[j] > X[j+1]) {
						aux = X[j];
						X[j] = X[j+1];
						X[j+1] = aux;
				}
			}	
		}
	
		for(i = 1;i <= 5;i++) {
			System.out.println("Digite um elemento:");
			X[i] = sc.nextInt();
			
		}
		for(i = 1;i <= 5;i++) {
			for(j = 1;j <= 4;j++) {
				if (Y[j] > Y[j+1]) {
						aux = Y[j];
						Y[j] = Y[j+1];
						Y[j+1] = aux;
				}
			}	
		}
	
		j = 1;
		
		for( i = 1 ;i <= 5;) { 
		R[j] = X[i];
		j = j + 1;
		R[j] = Y[i];
		j = j + 1;
		}
		
		for (i = 1; i <= 10;) {
		for (j = 1 ; i <= 9; ) {
		if (R[j] > R[j+1]) {
		aux = R[j];
		R[j] = R[j+1];
		R[j+1] = aux;
		}
		}
		}
		
		for( i = 1; i <= 5;) {
		System.out.println(X[i]);
		}
		
		for (i = 1;i <= 5;) {
		System.out.println(Y[i]);
		}
		
		for (i = 1;i <= 10;) { 
			System.out.println(R[i]);
		}
		
	
	
	}
}
