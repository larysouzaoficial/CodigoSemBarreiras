/*package NewGenTeste.NewGen;

import java.util.Locale;
import java.util.Scanner;

public class LayoutDoPrograma22 {
    Scanner sc = new Scanner(System.in);
    boolean programaInicial = true;
    boolean executarOMenuInicial = true;
    boolean programaParaUsuarios;
    boolean abastecimentoDeCartao;
    Administrador administrador = new Administrador();
    Estabelecimentos estabelecimentos = new Estabelecimentos();
    int valeSelecionadoPeloUsuario;
    int tipoDeTransacao;
    Integer opcaoDeExtrato;


    public static void logomarcaDoCartaoDeBeneficios() {
        System.out.println("""
                 @@@@@@@      @@@@@                                                :@@@@@@@@@@@@@@
                #@@@@@@@@     @@@@@                                               @@@@@@@@@@@@@@@@                                     \s
                @@@@@!@@@@    @@@@@                                              @@@@@.                                                \s
                @@@@@ @@@@:   @@@@@       !@@@@@@!     @@@@    #@@@@@@    @@@@  !@@@@                     !#@@@@@!       !@@@@@@@@@@!  \s
                @@@@@ :@@@@   @@@@@    @@@@@@@@@@@@@:  @@@@:  #@@@@@@@@   @@@@  !@@@@                  !@@@@@@@@@@@@@   !@@@@@@@@@@@@@@\s
                @@@@@  @@@@!  @@@@@  :@@@@       @@@@  .@@@!  @@@@@@@@@  :@@@@  !@@@@   .@@@@@@@@@@:  @@@@!      !@@@@  !@@@:      @@@@@
                @@@@@  #@@@@  @@@@@  @@@@         @@@@  @@@@  @@@@ @@@@  !@@@.  !@@@@   .@@@@@@@@@@: !@@@.        @@@@  !@@@:       @@@@
                @@@@@   @@@@: @@@@@ .@@@@@@@@@@@@@@@@@  #@@@  @@@@ @@@@! @@@@   !@@@@          @@@@: @@@@@@@@@@@@@@@@@  !@@@:       @@@@
                @@@@@   :@@@@ @@@@@ .@@@@!!!!!!!!!!!!!  #@@@#.@@@@ .@@@! @@@@   !@@@@!         @@@@: #@@@!!!!!!!!!!!!!  !@@@:       @@@@
                @@@@@    @@@@#@@@@@  @@@@@               @@@@@@@@@ .@@@@@@@@#    @@@@@@.     !@@@@@. .@@@@:             !@@@:       @@@@
                @@@@@     @@@@@@@@#   @@@@@@@@@@@@@@.    @@@@@@@@   @@@@@@@@      #@@@@@@@@@@@@@@@    :@@@@@@@@@@@@@#   !@@@:       @@@@
                @@@@@      @@@@@@.       @@@@@@@@@@@.     @@@@@@!    @@@@@@:        !@@@@@@@@@@#          @@@@@@@@@@#   :@@@.       @@@@""");
    }


    public void entradaDoPrograma() {
        Scanner input = new Scanner(System.in);
        while (programaInicial) {
            System.out.printf("%n============================== Seja bem vindo ao sistema de cart??es de benef??cios NewGen! =============================" +
                    "%nDigite seu nome: ");
            String nomeDoBeneficiario = input.nextLine();
            nomeDoBeneficiario = Character.toUpperCase(nomeDoBeneficiario.charAt(0)) + nomeDoBeneficiario.substring(1).toLowerCase(Locale.ROOT);

            System.out.println("Digite o cpf:");
            String cpf = input.nextLong();
            var usuario = Usuario.retornaUsuario(nomeDoBeneficiario, cpf);
            usuario.criarCartoesParaUsuario();

            System.out.println("Qual cartao deseja criar?");
            int op = sc.nextInt();



            programaParaUsuarios = true;

            while (programaParaUsuarios) {
                System.out.printf("%n%n**************************************************" +
                        "%nOl??, %s" +
                        "%nEscolha qual op????o voc?? deseja realizar agora: " +
                        "%n1 - Usufruir do cartao" +
                        "%n2 - Abastecer o cartao" +
                        "%n3 - Mostrar saldo de cart??o" +
                        "%n4 - Mostrar usu??rios cadastrados" +
                        "%n5 - Cadastrar novo usu??rio" +
                        "%n6 - Selecionar usu??rio cadastrado" +
                        "%n7 - Mostrar extrato" +
                        "%n9 - Desligar o programa" +
                        "%nOp????o escolhida: ", nomeDoBeneficiario);
                tipoDeTransacao = input.nextInt();

                if (tipoDeTransacao == 1) {
                    programaParaUsuarios = false;
                    executarOMenuInicial = true;
                    usufruirDoPrograma(nomeDoBeneficiario);
                } else if (tipoDeTransacao == 2) {
                    if (administrador.acessoAdministrador()) {
                        System.out.printf("%nOl??, Administrador" +
                                "%nEscolha o cartao que voc?? quer colocar saldo" +
                                "%n1 - Vale Alimenta????o" +
                                "%n2 - Vale Refei????o" +
                                "%n3 - Vale Combust??vel" +
                                "%n4 - Vale Multibenef??cios" +
                                "%n0 - Voltar para o menu anterior" +
                                "%nOp????o escolhida: ");
                        valeSelecionadoPeloUsuario = input.nextInt();

                        if (valeSelecionadoPeloUsuario == 0) {
                            System.out.println("Voltando ao menu inicial...");
                            abastecimentoDeCartao = false;
                        } else if (valeSelecionadoPeloUsuario >= 1 && valeSelecionadoPeloUsuario <= 4) {
                            abastecimentoDeCartao = true;
                        } else {
                            System.out.printf("%nOp????o inv??lida.");
                            abastecimentoDeCartao = false;
                        }
                    } else {
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

                } else if (tipoDeTransacao == 3) {
                    System.out.printf("%nOk, %s." +
                            "%nEscolha o cartao que voc?? deseja ver o saldo" +
                            "%n1 - Vale Alimenta????o" +
                            "%n2 - Vale Refei????o" +
                            "%n3 - Vale Combust??vel" +
                            "%n4 - Multibenef??cios" +
                            "%n5 - Todos os cart??es" +
                            "%n0 - Voltar para o menu anterior" +
                            "%nOp????o escolhida: ", nomeDoBeneficiario);
                    valeSelecionadoPeloUsuario = input.nextInt();

                    if (valeSelecionadoPeloUsuario == 0) {
                        System.out.println("Voltando ao menu inicial...");
                    } else if (valeSelecionadoPeloUsuario >= 1 && valeSelecionadoPeloUsuario <= 4) {
                        InterfaceCartaoDeBeneficiosNewGen cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, valeSelecionadoPeloUsuario);
                        cartaoDeBeneficiosNewGen.mostraSaldoDoCartao(nomeDoBeneficiario, valeSelecionadoPeloUsuario);
                    } else if (valeSelecionadoPeloUsuario == 5) {
                        InterfaceCartaoDeBeneficiosNewGen cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, 1);
                        cartaoDeBeneficiosNewGen.mostraSaldoDoCartao(nomeDoBeneficiario, 1);
                        cartaoDeBeneficiosNewGen.mostraSaldoDoCartao(nomeDoBeneficiario, 2);
                        cartaoDeBeneficiosNewGen.mostraSaldoDoCartao(nomeDoBeneficiario, 3);
                        cartaoDeBeneficiosNewGen.mostraSaldoDoCartao(nomeDoBeneficiario, 4);
                    }
                } else if (tipoDeTransacao == 4) {
                    int i = 1;
                    System.out.printf("%n************************************************" +
                            "%nLista de usu??rios cadastrados no programa:%n");
                    for (Usuario usuario1 : Usuario.dataBaseParaSelecionarUsuarios) {
                        System.out.printf("%d  - Nome: %s  CPF: %d%n", i, usuario1.nomeDoBeneficiario, usuario1.cpf);
                        i += 1;
                    }
                    System.out.println("************************************************");
                } else if (tipoDeTransacao == 5) {
                    programaParaUsuarios = false;
                    programaInicial = true;
                    nomeDoBeneficiario.replace("A-Za-z", input.nextLine());
                } else if (tipoDeTransacao == 6) {
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

                } else if (tipoDeTransacao == 7) {
                    System.out.printf("%nEscolha o cartao que voc?? deseja ver o extrato" +
                            "%n1 - Vale Alimenta????o" +
                            "%n2 - Vale Refei????o" +
                            "%n3 - Vale Combust??vel" +
                            "%n4 - Multibenef??cios" +
                            "%n5 - Todos os cart??es" +
                            "%n0 - Voltar para o menu anterior" +
                            "%nOp????o escolhida: ");
                    opcaoDeExtrato = input.nextInt();

                    if (opcaoDeExtrato == 5) {
                        for (int i = 1; i < 5; i++) {
                            InterfaceCartaoDeBeneficiosNewGen cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, i);
                            cartaoDeBeneficiosNewGen.mostrarExtratoDoCartao(nomeDoBeneficiario, i);
                        }
                    } else if (opcaoDeExtrato >= 1 && opcaoDeExtrato <= 4) {
                        InterfaceCartaoDeBeneficiosNewGen cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, opcaoDeExtrato);
                        cartaoDeBeneficiosNewGen.mostrarExtratoDoCartao(nomeDoBeneficiario, opcaoDeExtrato);
                    } else {
                        System.out.printf("%nOp????o inv??lida.");
                    }

                } else if (tipoDeTransacao == 9) {
                    input.close();
                    System.out.println("Obrigado por utilizar os cart??es NewGen!");
                    executarOMenuInicial = false;
                    programaInicial = false;
                    programaParaUsuarios = false;
                }
            }
        }
    }


    public void usufruirDoPrograma(String nomeDoBeneficiario) {
        Scanner input = new Scanner(System.in);
        if (Estabelecimentos.estabelecimentos.size() == 0) {
            estabelecimentos.criarEstabelecimentosDisponiveisParaGastar();
        }

        while (executarOMenuInicial) {
            System.out.printf("%n%n**************************************************" +
                    "%nOl??, %s!" +
                    "%nEscolha qual cart??o voc?? quer utilizar:" +
                    "%n1 - Vale Alimenta????o" +
                    "%n2 - Vale Refei????o" +
                    "%n3 - Vale Combust??vel" +
                    "%n4 - Multibenef??cios" +
                    "%n9 - Desligar programa" +
                    "%n0 - Retornar ao menu anterior" +
                    "%nOp????o escolhida: ", nomeDoBeneficiario);
            int valeSelecionadoPeloUsuario = input.nextInt();

            if (valeSelecionadoPeloUsuario == 0) {
                executarOMenuInicial = false;
                programaInicial = false;
                programaParaUsuarios = true;
                entradaDoPrograma();

            } else if (valeSelecionadoPeloUsuario >= 1 && valeSelecionadoPeloUsuario <= 4) {
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
            } else {
                System.out.println("Op????o inv??lida");
            }
        }
    }
}




















System.out.println("Digite o cpf do benefici??rio:");
                        String cpf = input.next();
                        String c1 = cpf.substring(0,3);
                        String c2 = cpf.substring(3,6);
                        String c3 = cpf.substring(6,9);
                        String c4 = cpf.substring(9,11);
                        cpf = String.format("%s.%s.%s-%s", c1, c2, c3, c4);
                        System.out.println("Digite a data de nascimento do benefici??rio (sem espa??os,no formato: ddMMyyyy):");
                        datadenascimento = input.next();
                        String d1 = datadenascimento.substring(0,2);
                        String d2 = datadenascimento.substring(2,4);
                        String d3 = datadenascimento.substring(4,8);
                        datadenascimento = String.format("%s/%s/%s", d1, d2, c3, c4);
 */