package NewGenTeste.NewGen;

public class Multibeneficios extends CartaoDeBeneficiosNewGen implements InterfaceCartaoDeBeneficiosNewGen {

    private final Integer senhaDoCartaoMB = 4040;
    private Double saldoAtualDoCartao = 1500.00;

    public Boolean senhaDoCartao(Integer senhaDoCartaoMB) {
        return senhaDoCartaoMB.equals(this.senhaDoCartaoMB);
    }

    @Override
    public void adicionarNovaTransacao(Double valorASerGastoPeloUsuario, String nomeDoBeneficiario,
                                       Integer valeSelecionadoPeloUsuario, Estabelecimento estabelecimentoUtilizadoPeloPrograma) {
        super.adicionarNovaTransacao(valorASerGastoPeloUsuario, nomeDoBeneficiario, valeSelecionadoPeloUsuario, estabelecimentoUtilizadoPeloPrograma);
    }

    public String nomeDoCartao() {
        return "Alelo Multibenefícios";
    }

    @Override
    public void efetuarTransacao(Double valorASerDebitado) {
        saldoAtualDoCartao += valorASerDebitado;
    }

    public Double saldoAtualDoCartao() {
        return saldoAtualDoCartao;
    }
}