package lista1617;

//17.Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120

import java.util.Scanner;

public class lista16exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int fatorial=1;
        int num;

        System.out.println("Digite um número:");
        num = sc.nextInt();

        for (i = 1; i<num; i++){
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial é: " + fatorial);


    }
}
