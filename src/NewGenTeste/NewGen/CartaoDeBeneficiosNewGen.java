package NewGenTeste.NewGen;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public abstract class CartaoDeBeneficiosNewGen {

    SistemaDeSeguranca sistemaDeSeguranca = new SistemaDeSeguranca();
    final ArrayList<Transacao> listaParaMostrarOExtrato = new ArrayList<>();
    public LocalDateTime validadeDoCartao = LocalDateTime.now().plus(5, ChronoUnit.DAYS);

    InterfaceCartaoDeBeneficiosNewGen cartaoDeBeneficiosNewGen;

    public void adicionarNovaTransacao(Double valorASerGastoPeloUsuario, String nomeDoBeneficiario,
                                       Integer valeSelecionadoPeloUsuario, Estabelecimento estabelecimentoUtilizadoPeloPrograma) {
        cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, valeSelecionadoPeloUsuario);

        if (sistemaDeSeguranca.cartaoVASoPassaEmMercado(cartaoDeBeneficiosNewGen, estabelecimentoUtilizadoPeloPrograma.tipoDeEstabelecimento)) {
        } else if (sistemaDeSeguranca.cartaoVCSoPassaEmPosto(cartaoDeBeneficiosNewGen, estabelecimentoUtilizadoPeloPrograma.tipoDeEstabelecimento)) {
        } else if (sistemaDeSeguranca.cartaoVRSoPassaEmRestaurante(cartaoDeBeneficiosNewGen, estabelecimentoUtilizadoPeloPrograma.tipoDeEstabelecimento)) {
        } else if (sistemaDeSeguranca.cartaoMBSoPassaEmFarmacia(cartaoDeBeneficiosNewGen, estabelecimentoUtilizadoPeloPrograma.tipoDeEstabelecimento)) {
        } else if (!sistemaDeSeguranca.senhaDoCartaoEstaCorreta(cartaoDeBeneficiosNewGen)) {
        } else if (sistemaDeSeguranca.valorNegativo(valorASerGastoPeloUsuario)) {
        } else if (sistemaDeSeguranca.valorMaiorQueSaldo(cartaoDeBeneficiosNewGen, valorASerGastoPeloUsuario)) {
        } else if (sistemaDeSeguranca.sistemaAntiFraude1(listaParaMostrarOExtrato, estabelecimentoUtilizadoPeloPrograma.nomeDoEstabelecimento, valorASerGastoPeloUsuario)) {
        } else if (sistemaDeSeguranca.sistemaAntiFraude2(listaParaMostrarOExtrato)) {
        } else if (sistemaDeSeguranca.cartaoVCPassaCompraEmMaisDeDoisMinutos(listaParaMostrarOExtrato, cartaoDeBeneficiosNewGen)) {
        } else if (sistemaDeSeguranca.cartaoEstaNaValidade(validadeDoCartao)) {

        } else if (cartaoDeBeneficiosNewGen.nomeDoCartao().equals("Alelo Alimentação")) {
            if (valorASerGastoPeloUsuario > 999){
                armazenarCompra(valorASerGastoPeloUsuario, estabelecimentoUtilizadoPeloPrograma, nomeDoBeneficiario);
                Double valorASerDebitado = 0.0;
                System.out.println("Você não pode fazer um transação com valor maior que R$999,00");
                System.out.println("Seu saldo atual é R$" + cartaoDeBeneficiosNewGen.saldoAtualDoCartao());
            }else {
                armazenarCompra(valorASerGastoPeloUsuario, estabelecimentoUtilizadoPeloPrograma, nomeDoBeneficiario);
                Double valorASerDebitado = -valorASerGastoPeloUsuario + valorASerGastoPeloUsuario * 0.03;
                cartaoDeBeneficiosNewGen.efetuarTransacao(valorASerDebitado);
                System.out.printf("%nA compra em %s de R$ %.2f foi aprovada com sucesso!" +
                        "%nA compra rendeu um cashback de R$ %.2f que já foi adicionado ao seu saldo." +
                        "%nO saldo atual do cartão após a compra é de R$ %.2f", estabelecimentoUtilizadoPeloPrograma.nomeDoEstabelecimento, valorASerGastoPeloUsuario, valorASerGastoPeloUsuario * 0.03, cartaoDeBeneficiosNewGen.saldoAtualDoCartao());

            } } else if (cartaoDeBeneficiosNewGen.nomeDoCartao().equals("Alelo Refeição")) {
            if (valorASerGastoPeloUsuario > 299){
                armazenarCompra(valorASerGastoPeloUsuario, estabelecimentoUtilizadoPeloPrograma, nomeDoBeneficiario);
                Double valorASerDebitado = 0.0;
                System.out.println("Você não pode fazer um transação com valor maior que R$299,00");
                System.out.println("Seu saldo atual é R$" + cartaoDeBeneficiosNewGen.saldoAtualDoCartao());

            }else {
                armazenarCompra(valorASerGastoPeloUsuario, estabelecimentoUtilizadoPeloPrograma, nomeDoBeneficiario);
                Double valorASerDebitado = -valorASerGastoPeloUsuario + valorASerGastoPeloUsuario * 0.02;
                cartaoDeBeneficiosNewGen.efetuarTransacao(valorASerDebitado);
                System.out.printf("%nA compra em %s de R$ %.2f foi aprovada com sucesso!" +
                        "%nA compra rendeu um cashback de R$ %.2f que já foi adicionado ao seu saldo." +
                        "%nO saldo atual do cartão após a compra é de R$ %.2f", estabelecimentoUtilizadoPeloPrograma, valorASerGastoPeloUsuario, valorASerGastoPeloUsuario * 0.02, cartaoDeBeneficiosNewGen.saldoAtualDoCartao());

            } } else if (cartaoDeBeneficiosNewGen.nomeDoCartao().equals("Alelo Mobilidade")) {
            armazenarCompra(valorASerGastoPeloUsuario, estabelecimentoUtilizadoPeloPrograma, nomeDoBeneficiario);
            Double valorASerDebitado = (-valorASerGastoPeloUsuario + valorASerGastoPeloUsuario * 0.02) - 1;
            cartaoDeBeneficiosNewGen.efetuarTransacao(valorASerDebitado);
            System.out.printf("A compra em %s de R$ %.2f foi aprovada com sucesso! " +
                    "%nA compra gerou uma taxa de R$ 1.00  e rendeu um cashback de R$ %.2f que já foi debitado de seu saldo." +
                    "%nO saldo atual do cartão após a compra é de R$ %.2f", estabelecimentoUtilizadoPeloPrograma.nomeDoEstabelecimento, valorASerGastoPeloUsuario, valorASerGastoPeloUsuario * 0.02, cartaoDeBeneficiosNewGen.saldoAtualDoCartao());

        }else if (cartaoDeBeneficiosNewGen.nomeDoCartao().equals("Alelo Multibenefícios")) {
            armazenarCompra(valorASerGastoPeloUsuario, estabelecimentoUtilizadoPeloPrograma, nomeDoBeneficiario);
            Double valorASerDebitado = -valorASerGastoPeloUsuario + valorASerGastoPeloUsuario * 0.04;
            cartaoDeBeneficiosNewGen.efetuarTransacao(valorASerDebitado);
            System.out.printf("%nA compra em %s de R$ %.2f foi aprovada com sucesso!" +
                    "%nA compra rendeu um cashback de R$ %.2f que já foi adicionado ao seu saldo." +
                    "%nO saldo atual do cartão após a compra é de R$ %.2f", estabelecimentoUtilizadoPeloPrograma, valorASerGastoPeloUsuario, valorASerGastoPeloUsuario * 0.04, cartaoDeBeneficiosNewGen.saldoAtualDoCartao());
        }

    }


    public void armazenarCompra(Double valorASerGastoPeloUsuario, Estabelecimento estabelecimentoUtilizadoPeloPrograma, String nomeDoBeneficiario) {
        listaParaMostrarOExtrato.add(new Transacao(valorASerGastoPeloUsuario,estabelecimentoUtilizadoPeloPrograma, nomeDoBeneficiario, estabelecimentoUtilizadoPeloPrograma.cnpj));
//        transacao.dataBaseParaArmazenarOExtrato.put(cartaoDeBeneficiosNewGen.nomeDoCartao(), listaParaMostrarOExtrato);
    }

    public void mostrarExtratoDoCartao(String nomeDoBeneficiario, Integer valeSelecionadoPeloUsuario) {
        cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, valeSelecionadoPeloUsuario);
        System.out.printf("%n######################### EXTRATO DO CARTÃO #########################" +
                "%n----------- CARTÃO %s ---------Número do Extrato:", cartaoDeBeneficiosNewGen.nomeDoCartao());


        if (listaParaMostrarOExtrato.size() == 0) {
            System.out.printf("%nAinda não há compras efetuadas neste cartão.%n");
        } else {
            for (Transacao paraMostrarOExtrato : listaParaMostrarOExtrato) {
                System.out.println(paraMostrarOExtrato);
            }
        }
        System.out.println("---------------------------------------------------------------------");
    }

    public void mostraSaldoDoCartao(String nomeDoBeneficiario, Integer valeSelecionadoPeloUsuario) {
        cartaoDeBeneficiosNewGen = Usuario.retornarCartaoDeBeneficiosUtilizadoPeloUsuario(nomeDoBeneficiario, valeSelecionadoPeloUsuario);
        System.out.printf("%n* O saldo do cartão %s é R$ %.2f", cartaoDeBeneficiosNewGen.nomeDoCartao(), cartaoDeBeneficiosNewGen.saldoAtualDoCartao());
    }
}
