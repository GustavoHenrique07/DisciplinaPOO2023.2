package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int[] voo = new int[13]; 
		        int[] lugares = new int[13]; 
		        String[] origem = new String[13]; 
		        String[] destino = new String[13]; 
		        int i, op, op2, num_voo;
		        
		        for (i = 1; i <= 12; i++) {
		            System.out.println("Digite o n�mero do voo: ");
		            voo[i] = sc.nextInt();
		            sc.nextLine();
		            System.out.println("Digite o local de origem: ");
		            origem[i] = sc.nextLine();
		            System.out.println("Digite o local de destino: ");
		            destino[i] = sc.nextLine();
		            System.out.println("Digite a quantidade de lugares dispon�veis: ");
		            lugares[i] = sc.nextInt();
		        }

		        do {
		            System.out.println("1- Consultar");
		            System.out.println("2- Reservar");
		            System.out.println("3- Finalizar");
		            System.out.println("Digite sua op��o: ");
		            op = sc.nextInt();

		            if (op == 1) {
		                System.out.println("1- Consulta por voo");
		                System.out.println("2- Consulta por origem");
		                System.out.println("3- Consulta por destino");
		                System.out.println("Digite sua op��o: ");
		                op2 = sc.nextInt();

		                if (op2 == 1) {
		                    System.out.println("Digite o n�mero de voo: ");
		                    num_voo = sc.nextInt();
		                    i = 1;
		                    while (i <= 12 && voo[i] != num_voo) {
		                        i = i + 1;
		                    }
		                    if (i > 12) {
		                        System.out.println("Voo inexistente");
		                    } else {
		                        System.out.println("N�mero do voo: " + voo[i]);
		                        System.out.println("Local de origem: " + origem[i]);
		                        System.out.println("Local de destino: " + destino[i]);
		                        System.out.println("Lugares dispon�veis: " + lugares[i]);
		                    }
		                }
		            }
		        } while (op != 3);
		    }
		}
