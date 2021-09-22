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
        System.out.println("Digite qual cartão deseja adicionar para o beneficiário:");
        System.out.println("1 - Alelo Alimentação");
        System.out.println("2 - Alelo Refeição");
        System.out.println("3 - Alelo Mobilidade");
        System.out.println("4 - Alelo Multibenefícios");

        op = in.nextInt();
        boolean jaPossui= false;
       switch (op){
           case 1:
               for (int i = 0; i<listaDeCartoes.size(); i++){
                   if (listaDeCartoes.get(i).nomeDoCartao().equals("Alelo Alimentação")){
                       jaPossui = true;
                   }
               }
               if (jaPossui){
                   System.out.println("Beneficiário já possui esse cartão");
               }else {
                   listaDeCartoes.add(TiposDeCartaoDeBeneficio.VA.fabricar());
                   System.out.println("Cartão Alelo alimentação criado com sucesso!");
               }
               ;break;
           case 2:
               for (int i = 0; i<listaDeCartoes.size(); i++){
                   if (listaDeCartoes.get(i).nomeDoCartao().equals("Alelo Refeição")){
                       jaPossui = true;
                   }
               }
               if (jaPossui){
                   System.out.println("Beneficiário já possui esse cartão");
               }else {
                   listaDeCartoes.add(TiposDeCartaoDeBeneficio.VR.fabricar());
                   System.out.println("Cartão Alelo refeição criado com sucesso!");
               }
               ;break;

           case 3:
               for (int i = 0; i<listaDeCartoes.size(); i++){
                   if (listaDeCartoes.get(i).nomeDoCartao().equals("Alelo Mobilidade")){
                       jaPossui = true;
                   }
               }
               if (jaPossui){
                   System.out.println("Beneficiário já possui esse cartão");
               }else {
               listaDeCartoes.add(TiposDeCartaoDeBeneficio.VC.fabricar());
               System.out.println("Cartão Alelo mobilidade criado com sucesso!");
           }
           ;break;

           case 4:
               for (int i = 0; i<listaDeCartoes.size(); i++){
                   if (listaDeCartoes.get(i).nomeDoCartao().equals("Alelo Multibenefícios")){
                       jaPossui = true;
                   }
               }
               if (jaPossui){
                   System.out.println("Beneficiário já possui esse cartão");
               }else {
                   listaDeCartoes.add(TiposDeCartaoDeBeneficio.MB.fabricar());
                   System.out.println("Cartão Alelo multibenefícios criado com sucesso!");
               }
               ;break;



           default:
               System.out.println("Opção inválida");

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
