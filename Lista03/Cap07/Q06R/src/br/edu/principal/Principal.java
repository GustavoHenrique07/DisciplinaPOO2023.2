package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		        int[][] a = new int[4][5];
		        int[][] b = new int[5][2];
		        int[][] c = new int[4][2];
		        int soma, mult;

		        for (int i = 0; i < 4; i++) {
		            for (int j = 0; j < 5; j++) {
		              
		            }
		        }

		     
		        for (int i = 0; i < 5; i++) {
		            for (int j = 0; j < 2; j++) {
		               
		            }
		        }


		        for (int i = 0; i < 4; i++) {
		            for (int k = 0; k < 2; k++) {
		                soma = 0;
		                for (int j = 0; j < 5; j++) {
		                    mult = a[i][j] * b[j][k];
		                    soma += mult;
		                }
		                c[i][k] = soma;
		            }
		        }

		        for (int i = 0; i < 4; i++) {
		            for (int j = 0; j < 2; j++) {
		                System.out.print(c[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		}

