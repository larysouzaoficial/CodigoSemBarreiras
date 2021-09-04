package Lista1;

//faça um programa que peça 4 notas e mostre a média

import java.util.Scanner;

public class Lista1Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num1, num2, num3, num4;
        float media;

        System.out.println("Digite as 4 notas:");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();
        num3 = sc.nextFloat();
        num4 = sc.nextFloat();

        media = (num1 + num2 + num3 + num4)/4;

        System.out.printf("A média é: %.2f", media);

    }
}
