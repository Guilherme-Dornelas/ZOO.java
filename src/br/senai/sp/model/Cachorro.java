package br.senai.sp.model;

import java.util.Scanner;

public class Cachorro {

    Scanner tecaldo = new Scanner(System.in);
    String nome, apelido, raca, cor;

    int idade;


    public  void cadastrarCachoro(){
        System.out.println("/...... Dog ------/");
        System.out.println("/ informe o nome: ");
        nome = tecaldo.next();
        System.out.print("informe O APELIDO");
        apelido = tecaldo.next();
        System.out.print("informe o raça: ");
        raca = tecaldo.next();
        System.out.print("informe a cor: ");
        cor = tecaldo.next();
        System.out.print("informe a idade");
        idade = tecaldo.nextInt();
        tecaldo.nextLine();
        System.out.println("/------ Cadatro Finalizado ......./");
    }

    public  void listarCachorro(){

        for (Cachorro cachorro : lis){

            System.out.println("nome: " + cachorro.nome);
            System.out.println("nome: " + cachorro.apelido);
            System.out.println("nome: " + cachorro.idade);
            System.out.println("nome: " + cachorro.raca);
            System.out.println("nome: " + cachorro.cor);
            System.out.println("nome: " + cachorro.idade);
        }
    }
}
