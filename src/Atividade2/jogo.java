package Atividade2;

import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");

        int ja,jb;

        System.out.println("Jogador A: ");
        ja = in.nextInt();

        System.out.println("Jogador B: ");
        jb = in.nextInt();

        switch (ja){
            case 1:
                switch (jb){
                    case 1:
                        System.out.println("Empate");
                        break;
                    case 2:
                        System.out.println("Jogador B ganhou");
                        break;
                    case 3:
                        System.out.println("Jogador A ganhou");
                        break;
                    default:
                        System.out.println ("Nenhuma opção selecionada");
                } break;
            case 2:
                switch(jb) {
                    case 1:
                        System.out.println("Jogador A ganhou");
                        break;
                    case 2:
                        System.out.println("Empatou");
                        break;
                    case 3:
                        System.out.println("Jogador B ganhou");
                        break;
                    default:
                        System.out.println ("Nenhuma opção selecionada");
                } break;
            case 3:
                switch(jb) {
                    case 1:
                        System.out.println("Jogador B ganhou");
                        break;
                    case 2:
                        System.out.println("Jogador A ganhou");
                        break;
                    case 3:
                        System.out.println("Empatou");
                        break;
                    default:
                        System.out.println ("Nenhuma opção selecionada");
                } break;
            default:
                System.out.println ("Nenhuma opção selecionada");
        }
    }
}


