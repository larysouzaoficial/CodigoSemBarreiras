package lista19;

/*Criar um vetor A com 8 elementos inteiros. Construir um vetor B
de mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2
 */

import java.util.Scanner;

public class lista19Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] B = new int [8];
        int [] A = new int [B.length];

        for (int i = 0; i < B.length; i++){
            System.out.println("Digie os valores de B: ");
            B[i] = sc.nextInt();
            A[i] = B[i] * 2;}

        System.out.println();

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
