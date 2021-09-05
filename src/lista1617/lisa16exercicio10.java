package lista1617;

//Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

import java.util.Scanner;

public class lisa16exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Entre com o primeiro número:");
        x = sc.nextInt();
        System.out.println("Entre com o segundo número:");
        y = sc.nextInt();

        System.out.printf("Os números entre %d e %d são: \n", x, y);

        for (int i = x; i <= y; i++){
            System.out.print(i + " ");
        }

    }
}
