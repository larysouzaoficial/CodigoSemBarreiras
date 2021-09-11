package POO.GetterSetterContrutor;

public class CanetaGetMain {
    public static void main(String[] args) {
        CanetaGet c1 = new CanetaGet();

        c1.modelo = "BIC";
       // c1.ponta = 0.5f; // não oposso escrever, pois ponta está privada
       // tenho que usar o set
       c1.setPonta(0.5f);
       c1.status();


    }
}
