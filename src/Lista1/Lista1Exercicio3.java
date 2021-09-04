package Lista1;

/* façaum programa que peça dois números e imprima uma soma*/

import java.util.Scanner;

public class Lista1Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int soma;

        System.out.println("Digite os números que deseja somar:");
        System.out.println("Digite o primeiro número:");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número:");
        num2 = sc.nextInt();

        soma = (num1+num2);

        System.out.printf("O resultado da soma é: %d + %d = %d", num1, num2,soma);






    }

}
