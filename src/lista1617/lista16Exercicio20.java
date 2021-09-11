package lista1617;

/*Faça um programa que peça para n pessoas a sua idade,
ao final o programa devera verificar se a média de idade
da turma varia entre 0 e 25,26 e 60 e maior que 60; e então,
dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
 */

import java.util.Scanner;

public class lista16Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoTurma;
        int idade = 0;
        double soma = 0;
        double media;

        System.out.println("Digite a quanidade de pessoas na turma:");
        tamanhoTurma = sc.nextInt();

        for (int i = 0; i < tamanhoTurma; i++){
            System.out.println("Digite as idades: "+ (i+1));
            idade = sc.nextInt();
            soma = soma + idade;
        }
        media = soma / tamanhoTurma;

        System.out.println("A média é: "+ media);
        if (media >= 0 && media <=25){
            System.out.println("Turma jovem");
        } else
        if (media >= 26 && media <=60){
            System.out.println("Turma adulta");
        } else
        if (media > 60){
            System.out.println("Turma idosa");
        }
    }
}
