package NewGenTeste.NewGen;

public class ValeRefeicao extends CartaoDeBeneficiosNewGen implements InterfaceCartaoDeBeneficiosNewGen {

    private final Integer senhaDoCartaoVR = 2020;
    private Double saldoAtualDoCartao = 1500.00;

    public Boolean senhaDoCartao(Integer senhaDoCartaoVR) {
        return senhaDoCartaoVR.equals(this.senhaDoCartaoVR);
    }

    @Override
    public void adicionarNovaTransacao(Double valorASerGastoPeloUsuario, String nomeDoBeneficiario,
                                       Integer valeSelecionadoPeloUsuario, Estabelecimento estabelecimentoUtilizadoPeloPrograma) {
        super.adicionarNovaTransacao(valorASerGastoPeloUsuario, nomeDoBeneficiario, valeSelecionadoPeloUsuario, estabelecimentoUtilizadoPeloPrograma);
    }

    public String nomeDoCartao() {
        return "Alelo Refeição";
    }

    @Override
    public void efetuarTransacao(Double valorASerDebitado) {
        saldoAtualDoCartao += valorASerDebitado;
    }

    public Double saldoAtualDoCartao() {
        return saldoAtualDoCartao;
    }
}