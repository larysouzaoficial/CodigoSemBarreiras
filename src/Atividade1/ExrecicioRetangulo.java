package Atividade1;

import java.util.Scanner;

public class ExrecicioRetangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, altura;
        double area;


        System.out.println("Digite a base: ");
        base = scanner.nextInt();

        System.out.println("Digite a altura: ");
        altura = scanner.nextInt();

        area = (base * altura);

        System.out.println("A área do retângulo é: " + area);
    }
}
