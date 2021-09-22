package NewGenTeste.NewGen;

public class ValeCombustivel extends CartaoDeBeneficiosNewGen implements InterfaceCartaoDeBeneficiosNewGen {

    private final Integer senhaDoCartaoVC = 3030;
    private Double saldoAtualDoCartao = 1500.00;

    @Override
    public void adicionarNovaTransacao(Double valorASerGastoPeloUsuario, String nomeDoBeneficiario,
                                       Integer valeSelecionadoPeloUsuario, Estabelecimento estabelecimentoUtilizadoPeloPrograma) {
        super.adicionarNovaTransacao(valorASerGastoPeloUsuario, nomeDoBeneficiario, valeSelecionadoPeloUsuario, estabelecimentoUtilizadoPeloPrograma);
    }

    public Boolean senhaDoCartao(Integer senhaDoCartaoVC) {
        return senhaDoCartaoVC.equals(this.senhaDoCartaoVC);
    }


    public String nomeDoCartao() {
        return "Alelo Mobilidade";
    }

    @Override
    public void efetuarTransacao(Double valorASerDebitado) {
        saldoAtualDoCartao += valorASerDebitado;
    }

    public Double saldoAtualDoCartao() {
        return saldoAtualDoCartao;
    }
}
