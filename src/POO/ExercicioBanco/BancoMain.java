package POO.ExercicioBanco;

public class BancoMain {
    public static void main(String[] args) {
        Banco cliente1 = new Banco();
        cliente1.setNumeroDaConta(1111);
        cliente1.setDono("Jubileu");
        cliente1.status();

    }
}
