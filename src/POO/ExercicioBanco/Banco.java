package POO.ExercicioBanco;

import java.util.Scanner;

public class Banco {

    Scanner sc = new Scanner(System.in);

    private int numeroDaConta;
    protected String tipo;
    public String dono;
    public float saldo;
    public boolean status;


    // após criar os atributos, crio as variáveis para o construtor

    /*public Banco(int num, String t, String d, float s){
        this.numeroDaConta = num;
        this.tipo = t;
        this.dono = d;
        this.saldo = s;
        this.status();

    }*/
    //métodos


    public void abrirConta(String t){

        this.setTipo(t);
        this.setStatus(true);
        if (t == "cc"){
            this.saldo=50;
        }else if (t == "cp"){
            this.saldo = 150;
        }
        System.out.println("Conta aberta com sucesso!");


    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro, não pode ser fechada");
        }else if (this.getSaldo() < 0){
            System.out.println("Conta com débito, não pode ser fechada");
        }this.setStatus(false);
        System.out.println("Conta fechada com sucesso!");

    }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Depósito realizado na conta de " + this.getDono());}
        else {
            System.out.println("Impossível realizar em uma conta fechada.");

        }

    }
    public void sacar(float v){
        if (this.getStatus()){
          if(this.getStatus() >= v){
              this.setSaldo(this.getSaldo() - v);
              System.out.println("Saque realizado naconta de " + this.getDono());
          }else System.out.println("Sauq einsuficiente para saque");
        }else System.out.println("Impossível sacar de uma conta fechada");

    }
     public void pagarMensal(){
        int v =0;
        if (this.getTipo() == "cc"){
            v = 12;
        }else if (this.getTipo() == "cp"){
            v = 20;
        }
        if (this.getStatus()){
            this.setStatus(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());

        }else {
            System.out.println("Impossível pagar uma conta fechada!");
        }

    }
// construtor
    public void Banco(){
        this.saldo = 0;
        this.status = false;

    }





    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int num) {
        this.numeroDaConta = num;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }

    public void status(){
        System.out.println("Nome: " + this.getNumeroDaConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Satus: " + this.getStatus());
    }
}
