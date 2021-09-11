package POO.GetterSetterContrutor;

public class CanetaConstrutor {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public CanetaConstrutor(String m, String c, float p){
        this.modelo = m;
        this.ponta = p;
        this.cor = c;
        this.tampar();

    }



    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

}
