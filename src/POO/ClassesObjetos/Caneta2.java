package POO.ClassesObjetos;

public class Caneta2 {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; // ponta está privada,não pode alterar
        //c1.tampada = false;
        c1.carga = 80;
        c1.destampar();
        c1.status();
        c1.rabiscar();

        System.out.println();

        Caneta c2 = new Caneta();
        c2.cor = "Rosa";
        c2.tampar();
        c2.status();
        c2.rabiscar();

    }
}
