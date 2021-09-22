package POO.RelacionamentoEntreClassesObjCompostosAgregacao.PessoaLivroPublicacao;

public class LivroMain {
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];

        p [0] = new Pessoa("Pedro", 22,"M");
        p [1] = new Pessoa("Maria", 25, "F");
        l [0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        l [1] = new Livro("POO pra iniciantes","Pedro Paulo", 500, p[0]);
        l [2] = new Livro("Java avançado", "Maria Cândido", 800, p[0]);

        l[1].abrir();
        l[1].folhear(100);

        System.out.println(l[1].detalhes());



    }
}
