package NewGenTeste.NewGen;

public interface InterfaceCartaoDeBeneficiosNewGen {

    void adicionarNovaTransacao(Double valorASerGastoPeloUsuario, String nomeDoBeneficiario,
                                Integer valeSelecionadoPeloUsuario, Estabelecimento estabelecimentoUtilizadoPeloPrograma);

    Boolean senhaDoCartao(Integer senhaDoCartao);

    String nomeDoCartao();

    Double saldoAtualDoCartao();

    void efetuarTransacao(Double valorASerDebitado);

    void mostrarExtratoDoCartao(String nomeDoBeneficiario, Integer valeSelecionadoPeloUsuario);

    void mostraSaldoDoCartao(String nomeDoBeneficiario, Integer valeSelecionadoPeloUsuario);

}
