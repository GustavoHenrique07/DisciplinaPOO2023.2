package br.edu.pricipal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        char[] sexo = new char[5];
	        char[] olhos = new char[5];
	        char[] cabelos = new char[5];
	        int[] idade = new int[5];
	        
	        leitura(sc, sexo, olhos, cabelos, idade);
	        
	        double m = maior_Idade(olhos, cabelos, idade);
	        System.out.println(m);
	        
	        int i = maior_Idade(idade);
	        System.out.println(i);
	        
	        int q = qtIndividuos(sexo, olhos, cabelos, idade);
	        System.out.println(q);
	        
	    }
	    
	    private static double maior_Idade(char[] olhos, char[] cabelos, int[] idade) {
		return 0;
	}
public static void leitura(Scanner sc, char[] sexo, char[] olhos, char[] cabelos, int[] idade) {
	        for (int x = 1; x < 5; x++) {
	            do {
	                System.out.print("Informe o sexo (F/M) para a pessoa " + (x + 1) + ": ");
	                sexo[x] = sc.next().charAt(0);
	            } while (sexo[x] != 'F' && sexo[x] != 'M');
	            
	            do {
	                System.out.print("Informe a cor dos olhos (C/A) para a pessoa " + (x + 1) + ": ");
	                olhos[x] = sc.next().charAt(0);
	            } while (olhos[x] != 'C' && olhos[x] != 'A');
	            
	            do {
	                System.out.print("Informe a cor dos cabelos (C/L/P) para a pessoa " + (x + 1) + ": ");
	                cabelos[x] = sc.next().charAt(0);
	            } while (cabelos[x] != 'C' && cabelos[x] != 'L' && cabelos[x] != 'P');
	            
	            System.out.print("Informe a idade da pessoa " + (x + 1) + ": ");
	            idade[x] = sc.nextInt();
	        }
	    }
	    
	    public static double mediaIdade(char[] olhos, char[] cabelos, int[] idade) {
	    	 int soma = 0;
	         int cont = 0;
	         
	         for (int i = 1; i < 5; i++) {
	             if (olhos[i] == 'C' && cabelos[i] == 'P') {
	                 soma += idade[i];
	                 cont++;
	             }
	         }
	         
	         if (cont == 0) {
	             return 0;
	         } else {
	             return (double) soma / cont;
	         }
	     }
	     
	     public static int maior_Idade(int[] idade) {
	         int maior = idade[0];
	         
	         for (int i = 1; i < 5; i++) {
	             if (idade[i] > maior) {
	                 maior = idade[i];
	             }
	         }
	         
	         return maior;
	     }
	     
	     public static int qtIndividuos(char[] sexo, char[] olhos, char[] cabelos, int[] idade) {
	         int qtd = 0;
	         
	         for (int i = 1; i < 5; i++) {
	             if (sexo[i] == 'F' && idade[i] >= 18 && idade[i] <= 35 && olhos[i] == 'A' && cabelos[i] == 'L') {
	                 qtd++;
	             }
	         }
	         
	         return qtd;
	     }
	 }
	    

	    