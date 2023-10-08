package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		        int[][] mes1 = new int[5][3];
		        int[][] mes2 = new int[5][3];
		        int[][] bim = new int[5][3];
		        int tot_prod, tot_loja, maior;

		      
		        for (int i = 0; i < 5; i++) {
		            for (int j = 0; j < 3; j++) {
		         }
		       }

		        for (int i = 0; i < 5; i++) {
		            for (int j = 0; j < 3; j++) {
		         
		            }
		        }

		        maior = bim[0][0];

		        for (int i = 0; i < 5; i++) {
		            for (int j = 0; j < 3; j++) {
		                bim[i][j] = mes1[i][j] + mes2[i][j];
		                System.out.print(bim[i][j] + " ");

		                if (i == 0 && j == 0) {
		                    maior = bim[i][j];
		                } else if (bim[i][j] > maior) {
		                    maior = bim[i][j];
		                }
		            }
		            System.out.println();
		        }

		        System.out.println("Maior valor: " + maior);

		   
		        for (int i = 0; i < 3; i++) {
		            tot_loja = 0;
		            for (int j = 0; j < 5; j++) {
		                tot_loja += bim[j][i];
		            }
		            System.out.println("Total da loja " + (i + 1) + ": " + tot_loja);
		        }
		        for (int i = 0; i < 5; i++) {
		            tot_prod = 0;
		            for (int j = 0; j < 3; j++) {
		                tot_prod += bim[i][j];
		            }
		            System.out.println("Total do produto " + (i + 1) + ": " + tot_prod);
		        }
		    }
		}
