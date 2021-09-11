package POO.ClassesObjetos;

public class Caneta {//classe caneta
    public String modelo; //criação dos aributos
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status (){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada?" + this.tampada);
    }

    public void rabiscar(){//criação de um método
        if(this.tampada == true){
            System.out.println("Não pode rabiscar.");
        }else {
            System.out.println("Pode rabiscar.");
        }

    }

    public void tampar(){
        this.tampada = true;

    }
    public void  destampar(){
        this.tampada = false;

    }
}
