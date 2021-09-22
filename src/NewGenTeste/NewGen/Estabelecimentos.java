package NewGenTeste.NewGen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estabelecimentos {
    static List<Estabelecimento> estabelecimentos = new ArrayList<>();

    public void criarEstabelecimentosDisponiveisParaGastar() {
        estabelecimentos.add(new Estabelecimento("Supermercado Pague Menos", 1, "Salvador", "Mercado", "00.000.000/0001-00"));
        estabelecimentos.add(new Estabelecimento("Supermercado Mais Barato", 2, "São Paulo", "Mercado","11.111.111/0001-11"));
        estabelecimentos.add(new Estabelecimento("Farmácia Confiança", 3, "Recife", "Farmacia", "22.222.222/0001-22"));
        estabelecimentos.add(new Estabelecimento("Farmácia do Brasil", 4, "Campina Grande", "Farmacia", "33.333.333/0001-33"));
        estabelecimentos.add(new Estabelecimento("Posto Shell", 5, "Bahia", "Combustível", "44.444.444/0001-44"));
        estabelecimentos.add(new Estabelecimento("Posto Petrobras", 6, "Rio de Janeiro", "Combustível", "55.555.555/0001-55"));
        estabelecimentos.add(new Estabelecimento("Restaurante Predileto", 7, "Recife", "Restaurante", "66.666.666/0001-66"));
        estabelecimentos.add(new Estabelecimento("Restaurante Prazer da Carne", 8, "Recife", "Restaurante", "77.777.777/0007-77"));
    }


    public void cadastrarEstabelecimento(){
        Scanner in = new Scanner(System.in);
        boolean criarEstabelecimento = true;
        while (criarEstabelecimento){
            int identificador = estabelecimentos.size() + 1;
            String tipo = "";
            System.out.println("Nome do Estabelecimento: ");
            String nome = in.nextLine();
            System.out.println("Digite o local do estabelecimento: ");
            String local = in.nextLine();
            System.out.println("Selecionar Estabelecimento: ");
            System.out.println("1 - Mercado");
            System.out.println("2 - Restaurante");
            System.out.println("3 - Farmácia");
            System.out.println("4 - Posto de combustível");

            int op = in.nextInt();
            switch (op){
                case 1:
                    tipo = "Mercado"; break;
                case 2:
                    tipo = "Farmacia"; break;
                case 3:
                    tipo = "Restaurante"; break;
                case 4:
                    tipo = "Combustível"; break;
                default:
                    System.out.println("Opção inválida");break;
            }
            System.out.println("Digite o CNPJ do estabelecimento: ");
            String cnpj = in.next();
            String b1 = cnpj.substring(0,2);
            String b2 = cnpj.substring(2,5);
            String b3 = cnpj.substring(5,8);
            String b4 = cnpj.substring(8,12);
            String b5 = cnpj.substring(12,14);
            cnpj = String.format("%s.%s.%s/%s-%s", b1, b2, b3, b4, b5);
            estabelecimentos.add(new Estabelecimento(nome, identificador, local, tipo, cnpj));
            System.out.println("Deseja criar novo estabelecimento?");
            System.out.println("1 -Sim");
            System.out.println("1 -Não");
            int resp = in.nextInt();
            if (resp == 1){
                criarEstabelecimento = true;
            }else {
                criarEstabelecimento = false;
            }
        }
    }

}

