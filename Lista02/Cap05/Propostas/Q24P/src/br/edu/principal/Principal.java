package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

        
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        System.out.println("Insira um conjunto de valores inteiros e positivos(para encerrar a entrada de dados insira 0):");
        
        while (true) {
            int valor = sc.nextInt();
            
            if (valor == 0) {
                break;
            } else if (valor < 0) {
                System.out.println("Valor negativo. Digite apenas valores positivos.");
            } else {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }
        }
        
        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        } else {
            System.out.println("Nenhum valor válido foi digitado.");
        }
        
   
    }
}