package ATIVIDADE1;

import java.util.Random;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		int i=0;
		int aux = 0; 
		int vet[]= new int[50];
		Random randomico = new Random();
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Vetor Desordenado");
			  for(i=0;i< vet.length;i++){
			       vet[i]= randomico.nextInt(900);
			  }
			System.out.println("");  
			for(i=0; i<vet.length; i++) {
				for(int j=0; j<49; j++) {
					if(vet[j]>vet[j+1]) {
						aux = vet[j];
						vet[j] = vet[j+1];
						vet[j+1] = aux;
					}
				}
			}
			System.out.print("Vet: ");
			for(int a:vet) {
			        System.out.print(a +" | ");
			}
			
			System.out.println("\nDigite o número que deseja encontrar: ");
			int num = ler.nextInt();	
			int inicio=0, meio=0, fim=vet.length - 1;
			
			while(inicio <= fim) {
				meio = (fim+inicio) / 2;
				if(vet[meio] == num) {
			        System.out.printf("Encontrou o número %d na posição %d \n", num, meio);
			        break;
				}       	
				if(vet[meio] < num) { 
					inicio = meio + 1;
				}else {
			        fim = meio - 1;
				}       	 
			    if(inicio > fim) {
			      System.out.println("Número não encontrado " + num);
			    }
			}
			ler.close();
		}
		System.out.println("Encerrado");
	}
}
