package Atividade1;

public class Exercicio1 {

    public static void main(String[] args) {
        int y = 99;
        int z = 11;
        int coringa = 0;

        coringa = y;
        y = z;
        z = coringa;

        System.out.println(y);
        System.out.println(z);

    }
}
