package Assunto3;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fatorial = 1;

        System.out.print("Digite o número: ");
        int num = sc.nextInt();

        if(num==0){
            System.out.println(" o fatorial é 1");
        }

        if(num < 0){
            System.out.println("Não existe fatorial de número negativo");
        }

        for (int i = 1; i <= num; i++) {

            fatorial *= i;
            System.out.println( i + "!= " + fatorial);
        }
    }
}
