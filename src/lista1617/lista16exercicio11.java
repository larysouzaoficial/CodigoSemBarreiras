package lista1617;

//Altere o programa anterior para mostrar no final a soma dos números

import java.util.Scanner;

public class lista16exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Entre com o primeiro número:");
        x = sc.nextInt();
        System.out.println("Entre com o segundo número:");
        y = sc.nextInt();

        int soma = 0;

        System.out.printf("Os somas dos números entre %d e %d é: \n", x, y);

        for (int i = x; i <= y; i++){
            soma = soma + i;
            } System.out.print(soma + " ");

    }

}
