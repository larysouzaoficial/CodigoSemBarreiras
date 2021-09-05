package lista1617;

/*Faça um programa que leia 5 números e informe o maior
número. */

import java.util.Scanner;

public class lista16exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int i;

        for (i = 0; i < 5; i++) {
            System.out.println("Entre com o número:");
            num = sc.nextInt();

            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }


        } System.out.println("O maior número é: " + maior);
          System.out.println("O menor número é: " + menor);

    }
}