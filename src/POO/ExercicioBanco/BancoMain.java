package POO.ExercicioBanco;

public class BancoMain {
    public static void main(String[] args) {
        Banco cliente1 = new Banco();
        cliente1.abrirConta("cc");
        cliente1.setNumeroDaConta(1111);
        cliente1.setDono("Jubileu");

        System.out.println();

        Banco cliente2 =  new Banco();
        cliente2.setNumeroDaConta(2222);
        cliente2.abrirConta("cp");
        cliente2.setDono("Larissa");
        cliente1.depositar(100);
        cliente2.depositar(500);

        System.out.println();

        cliente1.status();
        cliente2.status();


    }
}
