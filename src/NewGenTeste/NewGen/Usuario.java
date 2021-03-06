package NewGenTeste.NewGen;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Usuario {

    public static final List<Usuario> dataBaseParaSelecionarUsuarios = new ArrayList<>();
    List<InterfaceCartaoDeBeneficiosNewGen> listaDeCartoes = new ArrayList<>();
    String nomeDoBeneficiario;
    String cpf;
    String dataDeNascimento;



    public Usuario(String nomeDoBeneficiario, String cpf, String dataDeNascimento) {
        this.nomeDoBeneficiario = nomeDoBeneficiario;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Usuario(String nomeDoBeneficiario) {
        this.nomeDoBeneficiario = nomeDoBeneficiario;
    }


    public Usuario() {


    }

    public static Usuario retornaUsuario(String nomeDoBeneficiario, String  cpf, String dataDeNascimento){
        var usuarioParaPesquisar =  new Usuario(nomeDoBeneficiario,cpf, dataDeNascimento);
        if (dataBaseParaSelecionarUsuarios.contains(usuarioParaPesquisar)){
            return dataBaseParaSelecionarUsuarios.get(dataBaseParaSelecionarUsuarios.indexOf(usuarioParaPesquisar));
        }
        var usuarioNovo =new Usuario(nomeDoBeneficiario, cpf,dataDeNascimento);
        dataBaseParaSelecionarUsuarios.add(usuarioNovo);
        return usuarioNovo;

    }

    public static Usuario retornaUsuarioPeloNomeDoBeneficiario(String nomeDoBeneficiario) {
        var usuarioParaPesquisar = new Usuario(nomeDoBeneficiario);
        if (dataBaseParaSelecionarUsuarios.contains(usuarioParaPesquisar)) {
            return dataBaseParaSelecionarUsuarios.get(dataBaseParaSelecionarUsuarios.indexOf(usuarioParaPesquisar));
        }
        var usuarioNovo = new Usuario(nomeDoBeneficiario);
        dataBaseParaSelecionarUsuarios.add(usuarioNovo);
        return usuarioParaPesquisar;
    }

    public void criarCartoesParaUsuario() {


        var op = 0;
        boolean continuarCriando = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite qual cart??o deseja adicionar para o benefici??rio:");
        System.out.println("1 - Alelo Alimenta????o");
        System.out.println("2 - Alelo Refei????o");
        System.out.println("3 - Alelo Mobilidade");
        System.out.println("4 - Alelo Multibenef??cios");

        op = in.nextInt();
        boolean jaPossui= false;
       switch (op){
           case 1:
               for (int i = 0; i<listaDeCartoes.size(); i++){
                   if (listaDeCartoes.get(i).nomeDoCartao().equals("Alelo Alimenta????o")){
                       jaPossui = true;
                   }
               }
               if (jaPossui){
                   System.out.println("Benefici??rio j?? possui esse cart??o");
               }else {
                   listaDeCartoes.add(TiposDeCartaoDeBeneficio.VA.fabricar());
                   System.out.println("Cart??o Alelo alimenta????o criado com sucesso!");
               }
               ;break;
           case 2:
               for (int i = 0; i<listaDeCartoes.size(); i++){
                   if (listaDeCartoes.get(i).nomeDoCartao().equals("Alelo Refei????o")){
                       jaPossui = true;
                   }
               }
               if (jaPossui){
                   System.out.println("Benefici??rio j?? possui esse cart??o");
               }else {
                   listaDeCartoes.add(TiposDeCartaoDeBeneficio.VR.fabricar());
                   System.out.println("Cart??o Alelo refei????o criado com sucesso!");
               }
               ;break;

           case 3:
               for (int i = 0; i<listaDeCartoes.size(); i++){
                   if (listaDeCartoes.get(i).nomeDoCartao().equals("Alelo Mobilidade")){
                       jaPossui = true;
                   }
               }
               if (jaPossui){
                   System.out.println("Benefici??rio j?? possui esse cart??o");
               }else {
               listaDeCartoes.add(TiposDeCartaoDeBeneficio.VC.fabricar());
               System.out.println("Cart??o Alelo mobilidade criado com sucesso!");
           }
           ;break;

           case 4:
               for (int i = 0; i<listaDeCartoes.size(); i++){
                   if (listaDeCartoes.get(i).nomeDoCartao().equals("Alelo Multibenef??cios")){
                       jaPossui = true;
                   }
               }
               if (jaPossui){
                   System.out.println("Benefici??rio j?? possui esse cart??o");
               }else {
                   listaDeCartoes.add(TiposDeCartaoDeBeneficio.MB.fabricar());
                   System.out.println("Cart??o Alelo multibenef??cios criado com sucesso!");
               }
               ;break;



           default:
               System.out.println("Op????o inv??lida");

       }}
       public void listaDeCartoes(){
           for (int i =0; i<listaDeCartoes.size(); i++){
               System.out.println((i+1)+ "-"+ listaDeCartoes.get(i).nomeDoCartao());
           }
        }

        public int tamanhoDaLista(){
           int tam = listaDeCartoes.size()+1;
           return tam;
        }


    public static InterfaceCartaoDeBeneficiosNewGen retornarCartaoDeBeneficiosUtilizadoPeloUsuario(String nomeDoBeneficiario, Integer valeSelecionadoPeloUsuario) {
        return (retornaUsuarioPeloNomeDoBeneficiario(nomeDoBeneficiario).listaDeCartoes.get(valeSelecionadoPeloUsuario - 1));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nomeDoBeneficiario, usuario.nomeDoBeneficiario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDoBeneficiario);
    }
}
