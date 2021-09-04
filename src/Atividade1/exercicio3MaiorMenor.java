package Atividade1;

import java.util.Scanner;

public class exercicio3MaiorMenor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = in.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = in.nextInt();

        if (num1 > num2){
            System.out.printf("%d é maior que %d, portanto o primeiro número digitado é maior e o segundo é menor", num1,num2);
        } else {
            System.out.printf("%d é menor que %d, portanto o primeiro número digitado é menor e o segundo maior", num1,num2);
        }
        in.close();
    }

}
