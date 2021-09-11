package lista1617;

//Faça um programa que calcule o mostre a média aritmética de N notas.

import java.util.Scanner;

public class lista16exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        double soma = 0;
        double media;

        System.out.println("Entre como número de notas:");
        int notas = sc.nextInt();

        for (int i = 0; i < notas; i ++){
            System.out.println("Entre a nota:" + (i+1));
            nota = sc.nextInt();
            soma = soma + nota;
        }
        media = soma/notas;
        System.out.println(" A média é:" + media);
    }
}
