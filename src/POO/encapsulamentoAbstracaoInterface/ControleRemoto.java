package POO.encapsulamentoAbstracaoInterface;

import java.util.Scanner;

public class ControleRemoto implements controlador {//implementar controlador
    Scanner sc = new Scanner(System.in);

    private int volume;
    private boolean ligado;
    private boolean tocando;

    //criar construtor para mostrar estado inicialdo controle
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    // criar os getters e setters


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado(boolean b) {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando(boolean b) {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    //Override significa que estou subescrevendo,ou seja, já tinha um método definido,
    // que é um método abstrato e que agora estou sobrescrevendo, ou seja, desconsiderando
    // aquela programação que não tinha sido feita e agora vou programar cada um deles.
    public void ligar() {
        this.setLigado(true);

    }

    @Override
    public void desligar() {
        this.setLigado(false);

    }

    @Override
    public void abrirMenu() {
        //vai mostrar o menu e suas funções
        System.out.println("Está ligado?" + this.getLigado(true));
        System.out.println("Está tocando?" + this.getTocando(true));
        System.out.println("Volume: "+ this.getVolume());
        for (int i =0;i< this.getVolume(); i++){
            System.out.print("|");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");

    }

    @Override
    public void maisVolume() {
        if (this.getLigado(true)){
            this.setVolume(this.getVolume() + 1);
        }

    }

    @Override
    public void menosVolume() {
        if (this.getLigado(true)){
            this.setVolume(this.getVolume() - 1);
        }

    }

    @Override
    public void ligrMudo() {
        if (this.getLigado(true) && this.getVolume() > 0){
            this.setVolume(0);
        }

    }

    @Override
    public void desligarMudo() {
        if (this.getLigado(true) && this.getVolume() == 0){
            this.setVolume(50);
        }

    }

    @Override
    public void play() {
        if (this.getLigado(true) && !this.getTocando(true)){
            this.setTocando(true);
        }

    }

    @Override
    public void pause() {
        if (this.getLigado(true) && this.getTocando(true)){
            this.setTocando(false);
        }

    }
// criar os métodos abstratos
// implementando o controlador e chamandoos métodos absratos




}
