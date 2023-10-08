package br.edu.principal;

import java.util.Scanner;

public class Prinipal {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int[] corredor = new int[25]; 
		        int[] janela = new int[25]; 
		        boolean achou = false; 
		        char posi��o;
		        int num;
		        int op;

		        do { 
		            for (int i = 1; i <= 24; i++) {
		                corredor[i] = 0;
		                janela[i] = 0;
		            }

		            System.out.println("1- Vender passagem");
		            System.out.println("2- Mostrar mapa de ocupa��o do �nibus");
		            System.out.println("3- Encerrar");
		            System.out.println("Digite sua op��o");
		            op = sc.nextInt();
		            
		            if (op == 1) {
		                achou = false; 

		                System.out.println("Digite a posi��o (C para corredor, J para janela):");
		                posi��o = sc.next().charAt(0); 
		                
		                System.out.println("Digite o n�mero da poltrona (1-24):");
		                num = sc.nextInt();

		                if (num >= 1 && num <= 24) {
		                    if (posi��o == 'J' && janela[num] == 1) {
		                        System.out.println("Poltrona ocupada");
		                    } else if (posi��o == 'C' && corredor[num] == 1) {
		                        System.out.println("Poltrona ocupada");
		                    } else {
		                        System.out.println("Venda efetivada");
		                        if (posi��o == 'J') {
		                            janela[num] = 1;
		                        } else if (posi��o == 'C') {
		                            corredor[num] = 1;
		                        }
		                    }
		                } else {
		                    System.out.println("N�mero de poltrona inv�lido");
		                }
		            } else if (op == 2) {
		                System.out.println("JANELA CORREDOR");
		                for (int i = 1; i <= 24; i++) {
		                    if (janela[i] == 0) {
		                        System.out.println("- Livre " + i);
		                    } else {
		                        System.out.println("- Ocupada " + i);
		                    }
		                    if (corredor[i] == 0) {
		                        System.out.println("- Livre " + i);
		                    } else {
		                        System.out.println("- Ocupada " + i);
		                    }
		                }
		            }
		        } while (op != 3);
		    }
		}
