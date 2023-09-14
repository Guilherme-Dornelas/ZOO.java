package br.senai.sp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {

    Scanner teclado = new Scanner(System.in);
    List<Cachorro> Listcachorr= new ArrayList<>();;

    public void Menu(){
        boolean continuar = true;
        while (continuar){
            System.out.println("---------- menu ..........");
            System.out.println("1 para cadastrar cachorro  ");
            System.out.println("2 para listar cachorro  ");
            System.out.println("3  para sair  ");
            System.out.println("---------- the end ..........");

            int opcaoUser = teclado.nextInt();
            teclado.nextLine();

            Cachorro objCachorro = new Cachorro();

            switch (opcaoUser){
                case 1:
                    objCachorro.cadastrarCachoro();
                    addAnimal(objCachorro);
                    Listcachorr.size();
                    break;

                case 2:
                        objCachorro.listarCachorro();


                    break;

                case 3:
                    continuar = false;
                    break;

            }

        }
    }

    public void addAnimal(Cachorro cachorro){
        Listcachorr.add(cachorro);

    }

    // lista de dog

    public void listdog(Cachorro Listdog){
        Listcachorr.add(Listdog);
    }

}
