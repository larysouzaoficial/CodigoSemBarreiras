package lista1617;

    /*Faça um programa que peça uma nota, entre zero e dez.
    Mostre uma mensagem caso o valor seja inválido e continue
    pedindo até que o usuário informe um valor válido
     */

import java.util.Scanner;

public class lista16exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean notaValida = false;

        do{
            System.out.println("Digite uma nota:");
            float nota = sc.nextFloat();
            if (nota >= 0 && nota <= 10){
                notaValida = true;
            System.out.println("Nota válida" + nota);
            } else {
            System.out.println("Nota inválida, digie novamente:");}
        }while (notaValida == false);



    }

}
