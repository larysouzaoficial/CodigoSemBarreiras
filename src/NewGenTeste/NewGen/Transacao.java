package NewGenTeste.NewGen;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Transacao{



    public Double valorDaTransacao;
    public LocalDateTime horarioDaTransacao;
    public Estabelecimento estabelecimentoUtilizadoPeloPrograma;
    public String nomeDoBeneficiario;
    public String cnpj;
    DateTimeFormatter formatacaoDaHoraParaOPadraoBrasileiro = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");

     public Random aleatorio(){

       Random gerador = new Random();

        System.out.println(gerador.nextInt(10000000 + 1));
        return gerador;
     }


    public Transacao(Double valorDaTransacao, Estabelecimento estabelecimentoUtilizadoPeloPrograma, String nomeDoBeneficiario, String cnpj) {
        this.valorDaTransacao = valorDaTransacao;
        this.horarioDaTransacao = LocalDateTime.now();
        this.nomeDoBeneficiario = nomeDoBeneficiario;
        this.estabelecimentoUtilizadoPeloPrograma = estabelecimentoUtilizadoPeloPrograma;
        this.cnpj = estabelecimentoUtilizadoPeloPrograma.cnpj;


    }



    @Override
    public String toString() {
        return System.lineSeparator()  + "-------------------Número da transação-----" + aleatorio().nextInt() + "-----------------" + "\n" + horarioDaTransacao.format(formatacaoDaHoraParaOPadraoBrasileiro) + "\nLocalização: " +
                estabelecimentoUtilizadoPeloPrograma.localizacaoDoEstabelecimento + "  Estabelecimento: " +
                estabelecimentoUtilizadoPeloPrograma.nomeDoEstabelecimento + "\nValor: R$" +
                valorDaTransacao + "  CNPJ:" + estabelecimentoUtilizadoPeloPrograma.cnpj;
    }
}
