package NewGenTeste.NewGen;

public class Estabelecimento {

    public String nomeDoEstabelecimento;
    public Integer identificadorDoEstabelecimento;
    public String localizacaoDoEstabelecimento;
    public String tipoDeEstabelecimento;
    public String cnpj;


    public Estabelecimento(String nomeDoEstabelecimento, Integer identificadorDoEstabelecimento, String localizacaoDoEstabelecimento, String tipoDeEstabelecimento, String cnpj) {
        this.nomeDoEstabelecimento = nomeDoEstabelecimento;
        this.identificadorDoEstabelecimento = identificadorDoEstabelecimento;
        this.localizacaoDoEstabelecimento = localizacaoDoEstabelecimento;
        this.tipoDeEstabelecimento = tipoDeEstabelecimento;
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Estabelecimento: " + nomeDoEstabelecimento;
    }

    public Integer identificadorDoEstabelecimento() {
        return this.identificadorDoEstabelecimento;
    }
}
