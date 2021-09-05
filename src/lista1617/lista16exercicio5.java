package lista1617;

/*Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada
e permita repetir a operação
 */

import java.util.Scanner;

public class lista16exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A;
        double B;
        double taxaA, taxaB;
        int count = 0;
        boolean infoValida = false;

        do {
            System.out.println("Digite o tamanho da população A: ");
            A = sc.nextDouble();
            if (A>0){
                infoValida = true;
            }else {
                System.out.println("O número precisa ser maior que zero. Digite novamente");
            }
        }while (infoValida == false);

        infoValida = false;

        do {
            System.out.println("Digite o tamanho da população B: ");
            B = sc.nextDouble();
            if (B>0){
                infoValida = true;
            }else {
                System.out.println("O número precisa ser maior que zero. Digite novamente");
            }
        }while (infoValida == false);

        infoValida = false;

        do {
            System.out.println("Digite a taxa de crescimento da população A: ");
            taxaA = sc.nextDouble();
            if (taxaA>0){
                infoValida = true;
            }else {
                System.out.println("O número precisa ser maior que zero. Digite novamente");
            }
        }while (infoValida == false);

        infoValida = false;

        do {
            System.out.println("Digite a taxa de crescimento da população B: ");
            taxaB = sc.nextDouble();
            if (taxaB>0){
                infoValida = true;
            }else {
                System.out.println("O número precisa ser maior que zero. Digite novamente");
            }
        }while (infoValida == false);


        while (A < B) {
            A = (A * taxaA) / 100 + A;
            B = ((B * taxaB) / 100 + B);
            count++;

        }
        System.out.println("A população de A é: " + A);
        System.out.println("A população de B é: " + B);
        System.out.println("A quantidade de anos é: " + count);


    }

}