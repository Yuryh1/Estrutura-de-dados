package ATIVIDADE1;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
	 public static void main(String[] args) {
	    	
	    	Scanner scan = new Scanner(System.in);
	    	
	        int vet[]= new int[10];

	        Random randomico = new Random();

	        for(int i=0;i< vet.length;i++){
	            vet[i]= randomico.nextInt(100);
	        }

	        //exibe todo o vetor
	        System.out.print("Vet: ");
	        for(int i:vet) {
	            System.out.print(i +" | ");
	        }
	        
			
			System.out.println("\nDigite o número que quer encontrar: ");
			int num = scan.nextInt();	
			scan.close();
	        
			
	        
			for(int i=0; i<vet.length; i++) {
				
				if(vet[i]==num) {
					System.out.printf("A posição do %d é: %d \n", num, i);
					i = vet.length;
				}else if(i+1 == vet.length) {
					System.out.printf("não localizado!!!!!");
				}
				
	        }
	        
	        
	        
	    }
}
