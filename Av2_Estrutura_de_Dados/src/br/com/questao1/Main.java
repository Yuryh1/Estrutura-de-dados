package br.com.questao1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, FullStackException {
        ArrayStack<String> pilha = new ArrayStack<>();
        LinkedList<String> lista = new LinkedList<>();
        Scanner scanner;
        scanner = new Scanner(new File("./nomes.txt"));

        while(scanner.hasNextLine()){
            pilha.push(scanner.nextLine());
        }

        while(pilha.size() != 0){
            lista.add(pilha.pop());
        }

        ListIterator<String> iterador = lista.listIterator(0);
        while(iterador.hasNext()){
            String nome = iterador.next();
            System.out.println(nome);
        }

    }
}