package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		    	int[][] mat = new int[4][7];
		        int menor = Integer.MAX_VALUE;
		        int maior = Integer.MIN_VALUE;
		        int l_menor = 0;
		        int col_menor = 0;

		     
		        for (int i = 0; i < 4; i++) {
		            for (int j = 0; j < 7; j++) {
		             
		            }
		        }

		     
		        for (int i = 0; i < 4; i++) {
		            for (int j = 0; j < 7; j++) {
		                if (mat[i][j] < menor) {
		                    menor = mat[i][j];
		                    l_menor = i;
		                    col_menor = j;
		                }
		            }
		        }

		       
		        for (int j = 0; j < 7; j++) {
		            if (mat[l_menor][j] > maior) {
		                maior = mat[l_menor][j];
		                col_menor = j;
		            }
		        }

		        System.out.println("O menor valor é " + menor);
		        System.out.println("Ele está na linha " + (l_menor + 1)); 
		        System.out.println("E na coluna " + (col_menor + 1)); 
		        System.out.println("O maior valor na mesma linha é " + maior);
		        System.out.println("Ele está na coluna " + (col_menor + 1)); 
		    }
}

		

	


