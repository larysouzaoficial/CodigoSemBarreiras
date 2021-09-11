package lista19;

/*Criar um vetor A com 10 elementos inteiros. Construir um
vetor B de mesmo tipo e tamanho, sendo que cada elemento do
vetor B deverá ser o respectivo elemento de A multiplicado
por sua posição (ou índice), ou seja: B[i] = A[i] * i
 */

import java.util.Scanner;

public class lista19exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] A = new double[10];
        double [] B = new double [A.length];

        for (int i = 0; i< A.length;i++){
            System.out.println("Digite os valores de A:");
            A[i]= sc.nextDouble();
            B[i]= A[i]*i;
        }
        System.out.print("Vetor A: ");
        for (int i = 0; i<A.length; i++){
            System.out.print(A[i] + " ");}

        System.out.println();

        System.out.print("Vetor B: ");
        for (int i = 0; i<B.length; i++){
            System.out.print(B[i] + " ");
        }





    }
}

