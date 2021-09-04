package Atividade2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número para a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int escolha = 0;
        float x, y;

        escolha = in.nextInt();

        System.out.println("Digite o primeiro valor:");
        x = in.nextFloat();

        System.out.println("Digite o segundo valor:");
        y = in.nextFloat();

        switch (escolha){
            case 1:
                System.out.println("O resultado da adição é: " + (x + y));
                break;
            case 2:
                System.out.println("O resultado da adição é: " + (x * y));
                break;
            case 3:
                System.out.println("O resultado da adição é: " + (x - y));
                break;
            case 4:
                System.out.println("O resultado da adição é: " + (x / y));
                break;
        } in.close();

    }}