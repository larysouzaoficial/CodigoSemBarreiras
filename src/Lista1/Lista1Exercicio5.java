package Lista1;

//faça um programa que converta metros para centímetros

import java.util.Scanner;

public class Lista1Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float m;
        float cm;

        System.out.println("Qual valar em metros deseja converter para centímetros?");
        m = sc.nextFloat();

        cm = m * 100;

        System.out.printf("O valor de %.2fm em centímetros é: %.2f", m, cm);


    }
}
