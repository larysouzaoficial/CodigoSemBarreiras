package Lista2;
//Dia da semana com switch case

import java.util.Scanner;

public class exercicioCartao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op;
        int enter;
        float valor = 0;
        float refeicao;
        float alimentacao;
        float transporte;
        int x = 0;
        float valorRefeicao = 500;
        float valorAlimentacao = 600;
        float valorTransporte = 300;
        int senha = 1234;
        refeicao = valorRefeicao;
        alimentacao = valorAlimentacao;
        transporte = valorTransporte;


        System.out.println("                       @@@#                        @@@@!                        \n" +
                "                       @@@#                        @@@@!                        \n" +
                "     !@@@@@@@@!        @@@#        !@@@@@@@@!      @@@@!       .@@@@@@@@#       \n" +
                "    @@@@@@@@@@@@@:     @@@#      @@@@@@@@@@@@@@!   @@@@!     @@@@@@@@@@@@@@@    \n" +
                "!@@@@@       !@@@@@    @@@#    #@@@@:      :@@@@@  @@@@!   #@@@@@       @@@@@:  \n" +
                "@@@@@          #@@@@   @@@#   #@@@@     :@@@@@@@@@ @@@@!   @@@@           @@@@  \n" +
                "@@@@.           @@@@   @@@#   @@@@#!@@@@@@@@!      @@@@!  @@@@!           @@@@  \n" +
                "@@@@@          #@@@@   @@@#   #@@@@@@@@:           @@@@!   @@@@           @@@@  \n" +
                " @@@@@:      :@@@@@:   @@@#    #@@:        :@      @@@@!   !@@@@@         @@@@  \n" +
                "  :@@@@@@@@@@@@@.      @@@@@@@     .@@@@@@@@@@@     @@@@@@@  @@@@@@@@@@@  @@@@@@\n" +
                "     #@@@@@@@@#          :#@@      .@@@@@@@@#         :@@@      #@@@@@@@#  .@@@ ");



        System.out.println("\n*----------------------------------------------------------*");
        System.out.println("*               BEM-VINDO AO MENU DA OLELA                 *");
        System.out.println("*                                                          *");
        System.out.println("*                    ESCOLHA UMA OPÇÃO:                    *");
        System.out.println("*                    Entre com 1 ou 2:                     *");
        System.out.println("*                                                          *");
        System.out.println("*                       1 - Usuário                        *");
        System.out.println("*                    2 - Administrador                     *");
        System.out.println("*----------------------------------------------------------*");

        enter = sc.nextInt();
        if(enter == 1){

            char usuarioQuerExecutar = 's';
            System.out.println("*----------------------------------------------------------*");
            System.out.println("*                    PERFIL DO USUÁRIO                     *");
            System.out.println("*----------------------------------------------------------*");

                do {
                    System.out.println("\n*----------------------------------------------------------*");
                    System.out.println("*                 QUAL CARTÃO DESEJA USAR?                 *");
                    System.out.println("*                   Entre com 1, 2 ou 3:                   *");
                    System.out.println("*                                                          *");
                    System.out.println("*                      1 - Refeição                        *");
                    System.out.println("*                     2 - Alimentação                      *");
                    System.out.println("*                      3 - Transporte                      *");
                    System.out.println("*----------------------------------------------------------*");
                    Scanner in = new Scanner(System.in).useDelimiter("\n");
                    op = sc.nextInt();


                    if (op == 1) {
                        System.out.println("*----------------------------------------------------------*");
                        System.out.println("*                         REFEIÇÃO                         *");
                        System.out.println("*                  Quanto deseja utilizar?                 *");
                        System.out.println("*----------------------------------------------------------*");
                        valor = sc.nextFloat();
                        refeicao = refeicao - valor;

                        {
                            if (refeicao < 0) {
                                refeicao = refeicao + valor;
                                System.out.println("*----------------------------------------------------------*");
                                System.out.println("*                     SALDO INDISPONÍVEL                   *");
                                System.out.println("*----------------------------------------------------------*");
                            } else if(refeicao == 0) {
                                refeicao = x;

                                System.out.println("*----------------------------------------------------------*");
                                System.out.println("*                       SALDO ZERADO                       *");
                                System.out.println("*----------------------------------------------------------*");}else{

                                System.out.printf("************Seu saldo no cartão refeição é: %.2f************\n", refeicao);

                            }
                        }
                    } else if (op == 2) {
                        System.out.println("*----------------------------------------------------------*");
                        System.out.println("*                       ALIMENTAÇÃO                        *");
                        System.out.println("*                  Quanto deseja utilizar?                 *");
                        System.out.println("*----------------------------------------------------------*");
                        valor = sc.nextInt();
                        alimentacao = alimentacao - valor;
                        {
                            if (alimentacao < 0) {
                                alimentacao = alimentacao + valor;
                                System.out.println("*----------------------------------------------------------*");
                                System.out.println("*                     SALDO INDISPONÍVEL                   *");
                                System.out.println("*----------------------------------------------------------*");
                            } else if (alimentacao == 0){
                                alimentacao = x;
                                System.out.println("*----------------------------------------------------------*");
                                System.out.println("*                       SALDO ZERADO                       *");
                                System.out.println("*----------------------------------------------------------*");}else{
                                System.out.printf("*********Seu saldo no cartão alimentação é: %.2f************\n", alimentacao);
                            }
                        }
                    } else if (op == 3) {

                        System.out.println("*----------------------------------------------------------*");
                        System.out.println("*                        TRANSPORTE                        *");
                        System.out.println("*                  Quanto deseja utilizar?                 *");
                        System.out.println("*----------------------------------------------------------*");
                        valor = sc.nextInt();
                        transporte = transporte - valor;
                        {
                            if (transporte < 0) {
                                transporte = transporte + valor;
                                System.out.println("*----------------------------------------------------------*");
                                System.out.println("*                     SALDO INDISPONÍVEL                   *");
                                System.out.println("*----------------------------------------------------------*");
                            } else if(transporte == 0){
                                transporte = x;
                                System.out.println("*----------------------------------------------------------*");
                                System.out.println("*                       SALDO ZERADO                       *");
                                System.out.println("*----------------------------------------------------------*");}else {
                                System.out.printf("*********Seu saldo no cartão transporte é: %.2f:************\n", transporte);
                            }
                        }
                    }
                    System.out.println("*----------------------------------------------------------*");
                    System.out.println("                       SEU SALDO TOTAL É:                  ");
                    System.out.println("                        Refeição: "+ refeicao);
                    System.out.println("                      Alimentação: "+ alimentacao);
                    System.out.println("                       Transporte: "+ transporte);
                    System.out.println("*----------------------------------------------------------*");

                    StringBuilder strDeSaida = new StringBuilder();

                    System.out.println(strDeSaida);
                    System.out.println("\n*----------------------------------------------------------*");
                    System.out.println("*             DESEJA FAZER UMA NOVA OPERAÇÃO?              *");
                    System.out.println("*                  Entre com 's' ou 'n':                   *");
                    System.out.println("*                                                          *");
                    System.out.println("*                        s - Sim                           *");
                    System.out.println("*                        n - Não                           *");
                    System.out.println("*----------------------------------------------------------*");
                    usuarioQuerExecutar = sc.next().charAt(0);


                }while (usuarioQuerExecutar == 's');

        } else

            if (enter == 2){

                int a;
                System.out.println("\n*----------------------------------------------------------*");
                System.out.println("*                      INSIRA A SENHA:                     *");
                System.out.println("*----------------------------------------------------------*");
                a = sc.nextInt();

                if(senha == a) {

                    System.out.println("\n*----------------------------------------------------------*");
                    System.out.println("*                  PERFIL DO ADMINISTRADOR                 *");
                    System.out.println("*----------------------------------------------------------*");

                    System.out.println("\n*----------------------------------------------------------*");
                    System.out.println("*            INSIRA O VALOR INICIAL NOS CARTÕES            *");
                    System.out.println("*                       Refeição                           *");
                    System.out.println("*                      Alimentação                         *");
                    System.out.println("*                       Transporte                         *");
                    System.out.println("*----------------------------------------------------------*");
                    refeicao = sc.nextFloat();
                    alimentacao = sc.nextFloat();
                    transporte = sc.nextFloat();

                    System.out.println("*----------------------------------------------------------*");
                    System.out.println("                       O SALDO INICIAL É:                   ");
                    System.out.println("                        Refeição: " + refeicao);
                    System.out.println("                      Alimentação: " + alimentacao);
                    System.out.println("                       Transporte: " + transporte);
                    System.out.println("*----------------------------------------------------------*");


                    char usuarioQuerExecutar = 's';
                    do {
                        System.out.println("\n*----------------------------------------------------------*");
                        System.out.println("*          QUAL CARTÃO DESEJA DECREMENTAR O SALDO?         *");
                        System.out.println("*                   Entre com 1, 2 ou 3:                   *");
                        System.out.println("*                                                          *");
                        System.out.println("*                     1 - Refeição                         *");
                        System.out.println("*                    2 - Alimentação                       *");
                        System.out.println("*                     3 - Transporte                       *");
                        System.out.println("*----------------------------------------------------------*");
                        Scanner in = new Scanner(System.in).useDelimiter("\n");
                        op = sc.nextInt();


                        if (op == 1) {
                            System.out.println("*----------------------------------------------------------*");
                            System.out.println("*                         REFEIÇÃO                         *");
                            System.out.println("*               Quanto deseja decrementar?                 *");
                            System.out.println("*----------------------------------------------------------*");
                            valor = sc.nextFloat();
                            refeicao = refeicao - valor;
                            {
                                if (refeicao < 0) {
                                    refeicao = refeicao + valor;
                                    System.out.println("*----------------------------------------------------------*");
                                    System.out.println("*                     SALDO INDISPONÍVEL                   *");
                                    System.out.println("*----------------------------------------------------------*");
                                } else if (refeicao == 0) {
                                    refeicao = x;

                                    System.out.println("*----------------------------------------------------------*");
                                    System.out.println("*                       SALDO ZERADO                       *");
                                    System.out.println("*----------------------------------------------------------*");
                                } else {

                                    System.out.printf("*************O saldo no cartão refeição é: %.2f*************\n", refeicao);

                                }
                            }
                        } else if (op == 2) {
                            System.out.println("*----------------------------------------------------------*");
                            System.out.println("*                       ALIMENTAÇÃO                        *");
                            System.out.println("*               Quanto deseja decrementar?                 *");
                            System.out.println("*----------------------------------------------------------*");
                            valor = sc.nextInt();
                            alimentacao = alimentacao - valor;
                            {
                                if (alimentacao < 0) {
                                    alimentacao = alimentacao + valor;
                                    System.out.println("*----------------------------------------------------------*");
                                    System.out.println("*                     SALDO INDISPONÍVEL                   *");
                                    System.out.println("*----------------------------------------------------------*");
                                } else if (alimentacao == 0) {
                                    alimentacao = x;
                                    System.out.println("*----------------------------------------------------------*");
                                    System.out.println("*                       SALDO ZERADO                       *");
                                    System.out.println("*----------------------------------------------------------*");
                                } else {
                                    System.out.printf("**********O saldo no cartão alimentação é: %.2f*************\n", alimentacao);
                                }
                            }
                        } else if (op == 3) {
                            System.out.println("*----------------------------------------------------------*");
                            System.out.println("*                        TRANSPORTE                        *");
                            System.out.println("*               Quanto deseja decrementar?                 *");
                            System.out.println("*----------------------------------------------------------*");
                            valor = sc.nextInt();
                            transporte = transporte - valor;
                            {
                                if (transporte < 0) {
                                    transporte = transporte + valor;
                                    System.out.println("*----------------------------------------------------------*");
                                    System.out.println("*                     SALDO INDISPONÍVEL                   *");
                                    System.out.println("*----------------------------------------------------------*");
                                } else if (transporte == 0) {
                                    transporte = x;
                                    System.out.println("*----------------------------------------------------------*");
                                    System.out.println("*                       SALDO ZERADO                       *");
                                    System.out.println("*----------------------------------------------------------*");
                                } else {
                                    System.out.printf("*********Seu saldo no cartão transporte é: %.2f:************\n", transporte);
                                }
                            }
                        }


                        System.out.println("*----------------------------------------------------------*");
                        System.out.println("                       SEU SALDO TOTAL É:                   ");
                        System.out.println("                        Refeição: " + refeicao);
                        System.out.println("                      Alimentação: " + alimentacao);
                        System.out.println("                       Transporte: " + transporte);
                        System.out.println("*----------------------------------------------------------*");

                        System.out.println("*----------------------------------------------------------*");
                        System.out.println("*      Deseja acrescentar algum saldo em algum cartão?     *");
                        System.out.println("*                    Entre com 1 ou 2:                     *");
                        System.out.println("*                                                          *");
                        System.out.println("*                        1 - Sim                           *");
                        System.out.println("*                        2 - Não                           *");
                        System.out.println("*----------------------------------------------------------*");
                        int op2;
                        op2 = sc.nextInt();
                        if (op2 == 1) {
                            System.out.println("\n*----------------------------------------------------------*");
                            System.out.println("*          QUAL CARTÃO DESEJA ACRESCENTAR O SALDO?         *");
                            System.out.println("*                   Entre com 1, 2 ou 3:                   *");
                            System.out.println("*                                                          *");
                            System.out.println("*                     1 - Refeição                         *");
                            System.out.println("*                    2 - Alimentação                       *");
                            System.out.println("*                     3 - Transporte                       *");
                            System.out.println("*----------------------------------------------------------*");
                            int op3 = sc.nextInt();
                            {
                                switch (op3) {
                                    case 1:
                                        System.out.println("*----------------------------------------------------------*");
                                        System.out.println("*                         REFEIÇÃO                         *");
                                        System.out.println("*               Quanto deseja acrescentar?                 *");
                                        System.out.println("*----------------------------------------------------------*");
                                        valor = sc.nextFloat();
                                        refeicao = refeicao + valor;
                                        System.out.printf("************Seu saldo no cartão refeição é: %.2f************\n", refeicao);
                                        System.out.println("*----------------------------------------------------------*");
                                        System.out.println("                       SEU SALDO TOTAL É:                  ");
                                        System.out.println("                        Refeição: " + refeicao);
                                        System.out.println("                      Alimentação: " + alimentacao);
                                        System.out.println("                       Transporte: " + transporte);
                                        System.out.println("*----------------------------------------------------------*");
                                        break;
                                    case 2:
                                        System.out.println("*----------------------------------------------------------*");
                                        System.out.println("*                       ALIMENTAÇÃO                        *");
                                        System.out.println("*               Quanto deseja acrescentar?                 *");
                                        System.out.println("*----------------------------------------------------------*");
                                        valor = sc.nextInt();
                                        alimentacao = alimentacao + valor;
                                        System.out.printf("*********Seu saldo no cartão alimentação é: %.2f************\n", alimentacao);
                                        System.out.println("*----------------------------------------------------------*");
                                        System.out.println("                     SEU SALDO TOTAL É:                    ");
                                        System.out.println("                        Refeição: " + refeicao);
                                        System.out.println("                      Alimentação: " + alimentacao);
                                        System.out.println("                       Transporte: " + transporte);
                                        System.out.println("*----------------------------------------------------------*");
                                        break;
                                    case 3:
                                        System.out.println("*----------------------------------------------------------*");
                                        System.out.println("*                        TRANSPORTE                        *");
                                        System.out.println("*               Quanto deseja acrescentar?                 *");
                                        System.out.println("*----------------------------------------------------------*");
                                        valor = sc.nextInt();
                                        transporte = transporte + valor;
                                        System.out.printf("*********Seu saldo no cartão transporte é: %.2f:************\n", transporte);
                                        System.out.println("*----------------------------------------------------------*");
                                        System.out.println("                       SEU SALDO TOTAL É:                  ");
                                        System.out.println("                        Refeição: " + refeicao);
                                        System.out.println("                      Alimentação: " + alimentacao);
                                        System.out.println("                       Transporte: " + transporte);
                                        System.out.println("*----------------------------------------------------------*");
                                        break;


                                }

                            }
                        }


                        StringBuilder strDeSaida = new StringBuilder();

                        System.out.println(strDeSaida);
                        System.out.println("\n*----------------------------------------------------------*");
                        System.out.println("*             DESEJA FAZER UMA NOVA OPERAÇÃO?              *");
                        System.out.println("*                  Entre com 's' ou 'n':                   *");
                        System.out.println("*                                                          *");
                        System.out.println("*                        s - Sim                           *");
                        System.out.println("*                        n - Não                           *");
                        System.out.println("*----------------------------------------------------------*");
                        usuarioQuerExecutar = sc.next().charAt(0);

                    } while (usuarioQuerExecutar == 's');

                }else System.out.println("*----------------------------------------------------------*");
                System.out.println("*                     SENHA INVÁLIDA                       *");
                System.out.println("*----------------------------------------------------------*");}}}