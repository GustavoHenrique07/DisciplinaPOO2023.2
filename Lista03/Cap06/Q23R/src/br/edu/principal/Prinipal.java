package br.edu.principal;

import java.util.Scanner;

public class Prinipal {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int[] corredor = new int[25]; 
		        int[] janela = new int[25]; 
		        boolean achou = false; 
		        char posição;
		        int num;
		        int op;

		        do { 
		            for (int i = 1; i <= 24; i++) {
		                corredor[i] = 0;
		                janela[i] = 0;
		            }

		            System.out.println("1- Vender passagem");
		            System.out.println("2- Mostrar mapa de ocupação do ônibus");
		            System.out.println("3- Encerrar");
		            System.out.println("Digite sua opção");
		            op = sc.nextInt();
		            
		            if (op == 1) {
		                achou = false; 

		                System.out.println("Digite a posição (C para corredor, J para janela):");
		                posição = sc.next().charAt(0); 
		                
		                System.out.println("Digite o número da poltrona (1-24):");
		                num = sc.nextInt();

		                if (num >= 1 && num <= 24) {
		                    if (posição == 'J' && janela[num] == 1) {
		                        System.out.println("Poltrona ocupada");
		                    } else if (posição == 'C' && corredor[num] == 1) {
		                        System.out.println("Poltrona ocupada");
		                    } else {
		                        System.out.println("Venda efetivada");
		                        if (posição == 'J') {
		                            janela[num] = 1;
		                        } else if (posição == 'C') {
		                            corredor[num] = 1;
		                        }
		                    }
		                } else {
		                    System.out.println("Número de poltrona inválido");
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
