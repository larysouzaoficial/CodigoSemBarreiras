package Lista2;

//verificr se a letra é vogal ou consoante

import java.util.Scanner;

public class
Lista2Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a letra:");

        String letra = sc.next();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            System.out.println("É vogal");} else{
            System.out.println("É consoante");
        }
    }
}

