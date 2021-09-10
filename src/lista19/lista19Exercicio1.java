package lista19;

/*Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo
tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i]
 */

import java.util.Scanner;

public class lista19Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] A = new int[5];
        int [] B = new int[A.length];

        for (int i =0; i<A.length; i++){
            System.out.println("Entre com os valores de A: "+i);
            A [i] = sc.nextInt();
            B [i] = A[i];
        }
        System.out.print("Vetor A: ");
        for (int i =0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.print("Vetor B: ");
        for (int i =0; i<B.length; i++) {
            System.out.print(B[i] + " ");

        }
        System.out.println();


    }

}
