package lista19;
/*Criar dois vetores A e B cada um com 10 elementos inteiros.
Construir um vetor C, onde cada elemento de C é a soma dos
respectivos elementos em A e B, ou seja: C[i] = A[i] + B[i].
 */

import java.util.Scanner;

public class lista19exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] A = new double[10];
        double [] B = new double[10];
        double [] C = new double[10];

        for (int i=0;i < A.length; i ++){
            System.out.println("Digite os valores de A: ");
            A[i] = sc.nextDouble();
            System.out.println("Digite os valores de B: ");
            B[i] = sc.nextDouble();
            C[i] = A[i] + B[i];
        }
        System.out.print("Vetor A: ");
        for (int i = 0; i <A.length; i++){
            System.out.print(A[i] + " ");
        }

        System.out.println();
        System.out.print("Vetor B: ");
        for (int i = 0; i <B.length; i++){
            System.out.print(B[i] + " ");
        }

        System.out.println();
        System.out.print("Vetor C: ");
        for (int i = 0; i <C.length; i++){
            System.out.print(C[i] + " ");
        }


    }


}
