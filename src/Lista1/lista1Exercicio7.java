package Lista1;

//calcular a area de um quadrilátero e mostrar o dobro de sua área

import java.util.Scanner;

public class lista1Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float base, altura, areaDoQuadrilatero, areaDobro;

        System.out.println("Digite a base e a altura do quadrilátero:");
        base = sc.nextFloat();
        altura = sc.nextFloat();

        areaDoQuadrilatero = base * altura;
        areaDobro = 2 * areaDoQuadrilatero;

        System.out.printf("A área do quadrilátero é %.2f\n", areaDoQuadrilatero);
        System.out.printf("O dobro de sua área é %.2f", areaDobro);

    }
}
