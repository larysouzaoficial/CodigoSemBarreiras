package POO.GetterSetterContrutor;

public class CanetaConstrutorMain {

    public static void main(String[] args) {
        CanetaConstrutor c1 = new CanetaConstrutor("BIC", "Azul", 0.4f);
        c1.status();
        CanetaConstrutor c2 = new CanetaConstrutor("NIK", "Amarela", 0.5f);//posso criar quantas canetas quiser
        c2.status();


    }
}
