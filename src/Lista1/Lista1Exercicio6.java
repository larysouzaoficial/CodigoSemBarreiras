package Lista1;

//faça um programa que peça o raio do círculo e encontre sua área

import java.util.Scanner;

public class Lista1Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float raio;
        float area;
        float pi = 3.1415f;

        System.out.println("Digite o raio do círculo");
        raio = sc.nextFloat();

        area = raio * raio * pi;

        System.out.printf("A a´rea do círculo é: %.2f", area);
    }
}
