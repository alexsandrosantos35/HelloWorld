package io;

import java.util.Scanner;

public class ScannerExemple {
    public static void main(String[] args) {

        //Iniciar
        Scanner scan = new Scanner(System.in);

        //Ações de leitura
        System.out.println("Digite seu nome ");
        String nome = scan.nextLine();

        System.out.println("Digite ssua idade ");
        int idade = scan.nextInt();

        //Ação de saída
        System.out.println("Seu nome é " + nome + " e você tem " + idade + " anos");

        //Ecerrar
        scan.close();


    }
}
