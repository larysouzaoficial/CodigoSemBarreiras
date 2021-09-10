package lista1617;

/*Faça um programa que peça dois números, base e expoente,
calcule e mostre o primeiro número elevado ao segundo número.
Não utilize a função de potência da linguagem.
 */

import java.util.Scanner;

public class lista16exercicio13 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    int base;
    int expoente;
    int potencia;
    int i;

    System.out.println("Digite a base:");
    base = sc.nextInt();

    System.out.println("Digite a base:");
    expoente = sc.nextInt();

    potencia=base;


    for (i = 1; i <expoente; i++){
        potencia = potencia * base;

    } System.out.println(base + " ^ " + i + " = " + potencia);


}

}
