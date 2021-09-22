package NewGenTeste.NewGen;

public class ValeAlimentacao extends CartaoDeBeneficiosNewGen implements InterfaceCartaoDeBeneficiosNewGen {

    private final Integer senhaDoCartaoVA = 1010;
    private Double saldoAtualDoCartao = 1500.00;

    @Override
    public void adicionarNovaTransacao(Double valorASerGastoPeloUsuario, String nomeDoBeneficiario,
                                       Integer valeSelecionadoPeloUsuario, Estabelecimento estabelecimentoUtilizadoPeloPrograma) {
        super.adicionarNovaTransacao(valorASerGastoPeloUsuario, nomeDoBeneficiario, valeSelecionadoPeloUsuario, estabelecimentoUtilizadoPeloPrograma);
    }

    public Boolean senhaDoCartao(Integer senhaDoCartaoVA) {
        return senhaDoCartaoVA.equals(this.senhaDoCartaoVA);
    }

    public String nomeDoCartao() {
        return "Alelo Alimentação";
    }

    @Override
    public void efetuarTransacao(Double valorASerDebitado) {
        saldoAtualDoCartao += valorASerDebitado;
    }


    public Double saldoAtualDoCartao() {
        return saldoAtualDoCartao;
    }






}


