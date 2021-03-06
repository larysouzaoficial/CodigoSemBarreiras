package NewGenTeste.NewGen;

import java.util.Locale;
import java.util.Scanner;

public class LayoutDoPrograma {
    Scanner sc = new Scanner(System.in);
    boolean programaInicial = true;
    boolean executarOMenuInicial = true;
    boolean programaParaUsuarios;
    boolean menuUsusario = true;
    boolean abastecimentoDeCartao;
    boolean escolherMenu = true;
    boolean retornarMenuAdm = true;
    String nomeDoBeneficiario;
    Administrador administrador = new Administrador();
    Estabelecimentos estabelecimentos = new Estabelecimentos();
    int valeSelecionadoPeloUsuario;
    int tipoDeTransacao;
    Integer opcaoDeExtrato;
    String cpf;
    String dataDeNascimento;
    Scanner input = new Scanner(System.in);



    public static void logomarcaDoCartaoDeBeneficios() {
        System.out.println("                             !####                               !####                              \n" +
                "                             !####                               !####                              \n" +
                "         :!!!!!.             !####              !!!!!!.          !####              .!!!!!:         \n" +
                "     ##############!         !####         .##############!      !####         .!##############     \n" +
                "  :########!:#########       !####       !########!!#########    !####         ########:#########:  \n" +
                " !#####.         .######     !####      ######.         !#####:  !####      :####           .#####! \n" +
                ":####!             !####!    !####     #####:       :#########!  !####     !####!             !####:\n" +
                "#####              .####!    !####     #####  :##########:       !####     !####.              #####\n" +
                "#####.              ####!    !####     ############!:            !####     !####:             .#####\n" +
                " #####:             ####!    !####     :######!                  !####      #####!              !##.\n" +
                "  #######.     .    ####!    !#####!.    .######.    .:###!      :#####!.    #######.     .##:####  \n" +
                "    #############   ######:   !#######       :#############!      !#######     #################    \n" +
                "       !#########:    ###.       .###         ##########.            .###         :#########!    \n\n");
    }


    public void entradaDoPrograma() {


        escolherMenu = true;


        System.out.println("Escolha uma op????o de menu:");
        System.out.println("1 - Usu??rio");
        System.out.println("2 - Administrador");
        System.out.println("3 - Desligar o programa");
        Scanner input = new Scanner(System.in);
        int opMenu = input.nextInt();

        if (opMenu == 3){

            input.close();
            System.out.println("Obrigado por utilizar os cart??es Alelo!");
            executarOMenuInicial = false;
            programaInicial = false;
            programaParaUsuarios = false;

        }


        if (opMenu == 2) {
            if (administrador.acessoAdministrador()) {
                while (retornarMenuAdm) {

                    System.out.printf("%n%n**************************************************" +
                            "%nEscolha qual op????o voc?? deseja realizar agora: " +
                            "%n1 - Cadastrar novo usu??rio" +
                            "%n2 - Abastecer o cartao" +
                            "%n3 - Mostrar saldo de cart??o" +
                            "%n4 - Mostrar usu??rios cadastrados" +
                            "%n5 - Selecionar usu??rio cadastrado" +
                            "%n6 - Mostrar extrato" +
                            "%n7 - Adicionar cart??o para usu??ro" +
                            "%n8 - Estabelecimenos" +
                            "%n9 - Voltar ao Menu" +
                            "%nOp????o escolhida: ");
                    int opAdm = input.nextInt();

                    if (opAdm == 1) {

                        System.out.printf("%n============================== Bem vindo ao menu do administrativo dos cart??es de benef??cio Alelo =============================" +
                                "%nDigite o nome do benefici??rio: ");


                        nomeDoBeneficiario = input.next();
                        nomeDoBeneficiario = Character.toUpperCase(nomeDoBeneficiario.charAt(0)) + nomeDoBeneficiario.substring(1).toLowerCase(Locale.ROOT);

                        System.out.println("Digite o cpf do benefici??rio:");
                        cpf = input.nextLine();
                        String cpf = input.next();
                        String c1 = cpf.substring(0,3);
                        String c2 = cpf.substring(3,6);
                        String c3 = cpf.substring(6,9);
                        String c4 = cpf.substring(9,11);
                        cpf = String.format("%s.%s.%s-%s", c1, c2, c3, c4);
                        System.out.println("Digite a data de nascimento do benefici??rio (sem espa??os,no formato: ddMMyyyy):");
                        dataDeNascimento = input.next();
                        String d1 = dataDeNascimento.substring(0,2);
                        String d2 = dataDeNascimento.substring(2,4);
                        String d3 = dataDeNascimento.substring(4,8);
                        dataDeNascimento = String.format("%s/%s/%s", d1, d2, d3);


                        var usuario = Usuario.retornaUsuario(nomeDoBeneficiario, cpf, dataDeNascimento);
                        usuario.criarCartoesParaUsuario();

                    } else if (opAdm == 2) {
                        var usuario = Usuario.retornaUsuarioPeloNomeDoBeneficiario(nomeDoBeneficiario);

                        System.out.printf("%nOl??, Administrador" +
                                "%nEscolha o cartao que voc?? quer colocar saldo%n");
                        usuario.listaDeCartoes();
                        valeSelecionadoPeloUsuario = input.nextInt();

                        if (valeSelecionadoPeloUsuario == 0) {
                            System.out.println("Voltando ao menu inicial...");
                            abastecimentoDeCartao = false;
                        } else if (valeSelecionadoPeloUsuario >= 1 && valeSelecionadoPeloUsuario < usuario.tamanhoDaLista()) {
                            abastecimentoDeCartao = true;
                        } else {
                            System.out.printf("%nOp????o inv??lida.");
                            abastecimentoDeCartao = false;
                        }

                        while (abastecimentoDeCartao) {
                            System.out.printf("%nDigite o valor que voc?? quer adicionar no cart??o: R$ ");
                            Double valorASerAdicionado = input.nextDouble();

                            if (valorASerAdicionado < 0) {
                                System.out.printf("%nImposs??vel adicionar um valor negativo.");
                            } else {
                                InterfaceCartaoDeBeneficiosNewGen cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, valeSelecionadoPeloUsuario);
                                cartaoDeBeneficiosNewGen.efetuarTransacao(valorASerAdicionado);
                                System.out.printf("O cart??o foi adicionado em R$ %.2f", valorASerAdicionado);
                            }
                            abastecimentoDeCartao = false;
                        }

                    } else if (opAdm == 3) {
                        var usuario = Usuario.retornaUsuarioPeloNomeDoBeneficiario(nomeDoBeneficiario);

                        System.out.printf("%nOk, %s." +
                                "%nEscolha o cartao que voc?? deseja ver o saldo%n", nomeDoBeneficiario);
                        usuario.listaDeCartoes();
                        valeSelecionadoPeloUsuario = input.nextInt();

                        if (valeSelecionadoPeloUsuario == 0) {
                            System.out.println("Voltando ao menu inicial...");
                        } else if (valeSelecionadoPeloUsuario >= 1 && valeSelecionadoPeloUsuario < usuario.tamanhoDaLista()) {
                            InterfaceCartaoDeBeneficiosNewGen cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, valeSelecionadoPeloUsuario);
                            cartaoDeBeneficiosNewGen.mostraSaldoDoCartao(nomeDoBeneficiario, valeSelecionadoPeloUsuario);
                        } else if (valeSelecionadoPeloUsuario == 5) {
                            InterfaceCartaoDeBeneficiosNewGen cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, 1);
                            cartaoDeBeneficiosNewGen.mostraSaldoDoCartao(nomeDoBeneficiario, 1);
                            cartaoDeBeneficiosNewGen.mostraSaldoDoCartao(nomeDoBeneficiario, 2);
                            cartaoDeBeneficiosNewGen.mostraSaldoDoCartao(nomeDoBeneficiario, 3);
                            cartaoDeBeneficiosNewGen.mostraSaldoDoCartao(nomeDoBeneficiario, 4);

                        }
                    } else if (opAdm == 4) {

                        int i = 1;
                        System.out.printf("%n************************************************" +
                                "%nLista de usu??rios cadastrados no programa:%n");
                        for (Usuario usuario1 : Usuario.dataBaseParaSelecionarUsuarios) {
                            System.out.printf("%d  - Nome: %s  CPF: %s  Data de Nascimento: %s%n", i, usuario1.nomeDoBeneficiario, usuario1.cpf, usuario1.dataDeNascimento);
                            i += 1;
                        }
                        System.out.println("************************************************");


                    } else if (opAdm == 5) {

                        boolean encontrarNovoUsuario = true;
                        String armazenarNomeComoFoiDigitado = nomeDoBeneficiario;
                        while (encontrarNovoUsuario) {
                            nomeDoBeneficiario.replace("A-Za-z", input.nextLine());
                            System.out.printf("%nDigite o nome do usu??rio que voc?? deseja buscar: ");
                            nomeDoBeneficiario = input.nextLine();
                            nomeDoBeneficiario = Character.toUpperCase(nomeDoBeneficiario.charAt(0)) + nomeDoBeneficiario.substring(1).toLowerCase(Locale.ROOT);

                            if (Usuario.retornaUsuarioPeloNomeDoBeneficiario(nomeDoBeneficiario) != null) {
                                programaParaUsuarios = true;
                                encontrarNovoUsuario = false;
                            } else {
                                System.out.printf("%nO usu??rio n??o foi encontrado em nosso banco de dados." +
                                        "Deseja buscar um outro usu??rio cadastrado [s/n]? ");
                                if (input.next().charAt(0) == 'n') {
                                    nomeDoBeneficiario = armazenarNomeComoFoiDigitado;
                                    encontrarNovoUsuario = false;
                                }
                            }
                        }


                    } else if (opAdm == 6) {
                        var usuario = Usuario.retornaUsuarioPeloNomeDoBeneficiario(nomeDoBeneficiario);

                        System.out.printf("%nEscolha o cartao que voc?? deseja ver o extrato%n");
                        usuario.listaDeCartoes();
                        opcaoDeExtrato = input.nextInt();

                        if (opcaoDeExtrato == 5) {
                            for (int i = 1; i < usuario.tamanhoDaLista(); i++) {
                                InterfaceCartaoDeBeneficiosNewGen cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, i);
                                cartaoDeBeneficiosNewGen.mostrarExtratoDoCartao(nomeDoBeneficiario, i);
                            }
                        } else if (opcaoDeExtrato >= 1 && opcaoDeExtrato < usuario.tamanhoDaLista()) {
                            InterfaceCartaoDeBeneficiosNewGen cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, opcaoDeExtrato);
                            cartaoDeBeneficiosNewGen.mostrarExtratoDoCartao(nomeDoBeneficiario, opcaoDeExtrato);
                        } else {
                            System.out.printf("%nOp????o inv??lida.");
                        }


                    } else if (opAdm == 7){
                        var usuario = Usuario.retornaUsuarioPeloNomeDoBeneficiario(nomeDoBeneficiario);
                        usuario.criarCartoesParaUsuario();
                    }
                    else if (opAdm == 8){
                        System.out.println("Escolha uma op????o");
                        System.out.println("1 - Lista de Estabelecimentos");
                        System.out.println("2 - Cadastrar novo Estabelecimento");
                        System.out.println("0 - Voltar ao menu anterior");
                        int opEstabelecimento = input.nextInt();
                        switch (opEstabelecimento){
                            case 1:
                                if (Estabelecimentos.estabelecimentos.size() == 0) {
                                    estabelecimentos.criarEstabelecimentosDisponiveisParaGastar();
                                }

                                for (int i = 0; i< Estabelecimentos.estabelecimentos.size() ;i ++){
                                    System.out.printf("%n--------------------------------%d--------------------------------%n", + Estabelecimentos.estabelecimentos.get(i).identificadorDoEstabelecimento);
                                    System.out.println("Nome do Estabelecimento: "+ Estabelecimentos.estabelecimentos.get(i).nomeDoEstabelecimento);
                                    System.out.println("Localiza????o: "+ Estabelecimentos.estabelecimentos.get(i).localizacaoDoEstabelecimento);
                                    System.out.println("Tipo do Estabelecimento: "+ Estabelecimentos.estabelecimentos.get(i).tipoDeEstabelecimento);
                                    System.out.println("CNPJ: "+ Estabelecimentos.estabelecimentos.get(i).cnpj);
                                    System.out.println("");
                                }break;

                            case 2:
                                estabelecimentos.cadastrarEstabelecimento();
                                break;
                            default:
                                System.out.println("Op????o inv??lida");
                                break;


                        }

                    }

                    else if (opAdm == 9) {
                        entradaDoPrograma();
                    }


                }
            }

        }


        if (opMenu == 1) {
            System.out.println("---------------------------- Bem-vindo ao menu do Usu??rio ---------------------------------");


            boolean encontrarNovoUsuario = true;
            String armazenarNomeComoFoiDigitado = nomeDoBeneficiario;
            while (encontrarNovoUsuario) {
                nomeDoBeneficiario.replace("A-Za-z", input.nextLine());
                System.out.printf("%nDigite seu nome para come??ar a usar os benef??cios:  ");
                nomeDoBeneficiario = input.nextLine();
                nomeDoBeneficiario = Character.toUpperCase(nomeDoBeneficiario.charAt(0)) + nomeDoBeneficiario.substring(1).toLowerCase(Locale.ROOT);

                if (Usuario.retornaUsuarioPeloNomeDoBeneficiario(nomeDoBeneficiario) != null) {
                    programaParaUsuarios = true;
                    encontrarNovoUsuario = false;
                } else {
                    System.out.printf("%nO usu??rio n??o foi encontrado em nosso banco de dados." +
                            "Deseja buscar um outro usu??rio cadastrado [s/n]? ");
                    if (input.next().charAt(0) == 'n') {
                        nomeDoBeneficiario = armazenarNomeComoFoiDigitado;
                        encontrarNovoUsuario = false;
                    }
                }
            }




           while (opMenu == 1){
            System.out.printf("%n%n**************************************************" +
                    "%nOl??, %s" +
                    "%nEscolha qual op????o voc?? deseja realizar agora: " +
                    "%n1 - Usufruir do cartao" +
                    "%n2 - Mostrar saldo de cart??o" +
                    "%n3 - Mostrar extrato" +
                    "%n4 - Lista de Estabelecimentos" +
                    "%n9 - Retornar ao menu do usu??rio" +
                    "%n0 - Retornar ao menu do inicial" +
                    "%nOp????o escolhida: ", nomeDoBeneficiario);
               var usuario = Usuario.retornaUsuarioPeloNomeDoBeneficiario(nomeDoBeneficiario);

            tipoDeTransacao = input.nextInt();



            if (tipoDeTransacao == 1) {
                programaParaUsuarios = false;
                executarOMenuInicial = true;
                usufruirDoPrograma(nomeDoBeneficiario);


            } else if (tipoDeTransacao == 2) {
                System.out.printf("%nOk, %s." +
                        "%nEscolha o cartao que voc?? deseja ver o saldo"
                        , nomeDoBeneficiario);
                usuario.listaDeCartoes();
                valeSelecionadoPeloUsuario = input.nextInt();


                if (valeSelecionadoPeloUsuario == 0) {
                    System.out.println("Voltando ao menu inicial...");
                } else if (valeSelecionadoPeloUsuario >= 1 && valeSelecionadoPeloUsuario < usuario.tamanhoDaLista()) {
                    InterfaceCartaoDeBeneficiosNewGen cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, valeSelecionadoPeloUsuario);
                    cartaoDeBeneficiosNewGen.mostraSaldoDoCartao(nomeDoBeneficiario, valeSelecionadoPeloUsuario);
                } else if (valeSelecionadoPeloUsuario == 5) {
                    InterfaceCartaoDeBeneficiosNewGen cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, 1);
                    cartaoDeBeneficiosNewGen.mostraSaldoDoCartao(nomeDoBeneficiario, 1);
                    cartaoDeBeneficiosNewGen.mostraSaldoDoCartao(nomeDoBeneficiario, 2);
                    cartaoDeBeneficiosNewGen.mostraSaldoDoCartao(nomeDoBeneficiario, 3);
                    cartaoDeBeneficiosNewGen.mostraSaldoDoCartao(nomeDoBeneficiario, 4);
                }

            } else if (tipoDeTransacao == 3) {
                System.out.printf("%nEscolha o cartao que voc?? deseja ver o extrato%n"
                        );
                usuario.listaDeCartoes();
                opcaoDeExtrato = input.nextInt();


                if (opcaoDeExtrato == 5) {
                    for (int i = 1; i < usuario.tamanhoDaLista(); i++) {
                        InterfaceCartaoDeBeneficiosNewGen cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, i);
                        cartaoDeBeneficiosNewGen.mostrarExtratoDoCartao(nomeDoBeneficiario, i);
                    }
                } else if (opcaoDeExtrato >= 1 && opcaoDeExtrato < usuario.tamanhoDaLista()) {
                    InterfaceCartaoDeBeneficiosNewGen cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, opcaoDeExtrato);
                    cartaoDeBeneficiosNewGen.mostrarExtratoDoCartao(nomeDoBeneficiario, opcaoDeExtrato);
                    System.out.println("5 - Ver todos os extratos");
                } else {
                    System.out.printf("%nOp????o inv??lida.");
                }

            }  if (tipoDeTransacao == 4){
                   if (Estabelecimentos.estabelecimentos.size() == 0) {
                       estabelecimentos.criarEstabelecimentosDisponiveisParaGastar();
                   }
               }else if (tipoDeTransacao == 9) {
                System.out.println("Obrigado por utilizar os cart??es NewGen!");
                executarOMenuInicial = false;
                programaInicial = false;
                programaParaUsuarios = true;
            } if (tipoDeTransacao == 0){
                   entradaDoPrograma();
                   }
               }
        }}




    public void usufruirDoPrograma(String nomeDoBeneficiario) {
        Scanner input = new Scanner(System.in);
        if (Estabelecimentos.estabelecimentos.size() == 0) {
            estabelecimentos.criarEstabelecimentosDisponiveisParaGastar();
        }

        while (executarOMenuInicial) {
            var usuario = Usuario.retornaUsuarioPeloNomeDoBeneficiario(nomeDoBeneficiario);
            System.out.printf(
                    "%n%n*************************************************" +
                    "%n9 - Retornar ao menu anterior" +
                            "%n0 - Retornar ao menu inicial%n" +

                    "%nOl??, %s!" +
                    "%nEscolha qual cart??o voc?? quer utilizar:%n", nomeDoBeneficiario);


            usuario.listaDeCartoes();
            System.out.println( "*************************************************" );

            int valeSelecionadoPeloUsuario = input.nextInt();

            if (valeSelecionadoPeloUsuario == 9) {
                executarOMenuInicial = false;
                programaInicial = false;
                programaParaUsuarios = true;

            }else if (valeSelecionadoPeloUsuario == 0) {
                executarOMenuInicial = false;
                programaInicial = false;
                programaParaUsuarios = true;
                entradaDoPrograma();
            }

            else if (valeSelecionadoPeloUsuario >= 1 && valeSelecionadoPeloUsuario < usuario.tamanhoDaLista()) {
                InterfaceCartaoDeBeneficiosNewGen cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, valeSelecionadoPeloUsuario);

                System.out.printf("%n%n**************************************************" +
                        "%nEscolha o estabelecimento onde ocorrer?? a compra%n");
                for (int i = 0; i < Estabelecimentos.estabelecimentos.size(); i++) {
                    System.out.printf("%d - %s%n", (Estabelecimentos.estabelecimentos.get(i).identificadorDoEstabelecimento()), Estabelecimentos.estabelecimentos.get(i).nomeDoEstabelecimento);
                }
                System.out.printf("%nDigite o identificador do local desejado: ");
                int opcaoDeEstabelecimentoEscolhidaPeloUsuario = input.nextInt();

                if (opcaoDeEstabelecimentoEscolhidaPeloUsuario >= 1 && opcaoDeEstabelecimentoEscolhidaPeloUsuario <= Estabelecimentos.estabelecimentos.size()) {
                    System.out.print("Digite o valor a ser gasto: ");
                    Double valorASerGastoPeloUsuario = input.nextDouble();

                    cartaoDeBeneficiosNewGen.adicionarNovaTransacao(valorASerGastoPeloUsuario, nomeDoBeneficiario, valeSelecionadoPeloUsuario,
                            Estabelecimentos.estabelecimentos.get(opcaoDeEstabelecimentoEscolhidaPeloUsuario - 1));
                } else {
                    System.out.printf("%n*** ERRO! ***" +
                            "%nC??digo de estabelecimento inv??lido. ");
                }

            } else if (valeSelecionadoPeloUsuario == 9) {
                input.close();
                System.out.println("Obrigado por utilizar os cart??es NewGen!");
                executarOMenuInicial = false;
                programaInicial = false;
                programaParaUsuarios = false;
                entradaDoPrograma();
            } else {
                System.out.println("Op????o inv??lida");
            }
        }
    }
}
