package Atividade1;

import java.util.Scanner;

public class exercicio02ifelse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Digite um idade:");
        int idade = in.nextInt();

        if (idade >= 5 && idade <=7) {
            System.out.println("Infantil A");
        }
        if (idade >= 8 && idade <=11) {
            System.out.println("Infantil B");
        }
        if (idade >= 12 && idade <=13) {
            System.out.println("Juvenil A");
        }
        if (idade >= 14 && idade <=17) {
            System.out.println("Juvenil B");
        }
        if (idade >= 18) {
            System.out.println("Adulto");
        }
        if (idade >= 0 && idade <=4) {
            System.out.println("Não está na lista");
        }
        in.close();

}

}
