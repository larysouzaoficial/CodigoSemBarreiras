package Lista2;
//Dia da semana com switch case

import java.util.Scanner;

public class diaDaSemana{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int diaDaSemana;

        System.out.println("Digite o dia da semana de 1 a 7");
        diaDaSemana = sc.nextInt();

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");break;
            case 2:
                System.out.println("Segunda-feira");break;
            case 3:
                System.out.println("Terça-feira");break;
            case 4:
                System.out.println("Quarta-feira");break;
            case 5:
                System.out.println("Quinta-feira");break;
            case 6:
                System.out.println("Sexta-feira");break;
            case 7:
                System.out.println("Sábado");break;
            default:
                System.out.println("Não é um dia da semana");

        }
    }
}
