package lista1617;
/*.Faça um programa que peça um número inteiro e determine
se ele é ou não um número primo. Um número primo é aquele
que é divisível somente por ele mesmo e por 1
 */

import java.util.Scanner;

public class lista16exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int i;

        System.out.println("Digite um número:");
        num = sc.nextInt();

        boolean primo = true;

            for (i = 2; i < num; i ++){
            if (num % i == 0){
            System.out.println("Não é primo primo");
            primo = false;}
        }
        if (primo) System.out.println("É primo");
}
}
