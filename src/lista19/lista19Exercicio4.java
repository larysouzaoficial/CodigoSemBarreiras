package lista19;

/*Criar um vetor A com 15 elementos inteiros. Construir um
vetor B de mesmo tamanho, sendo que cada elemento do vetor B
deverá ser a raiz quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i])
 */

import java.util.Scanner;

public class lista19Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double [] A = new double [15];
        double [] B = new double [A.length];

        for (int i = 0; i < A.length; i++){
            System.out.println("Digie os valores de A: ");
            A[i] = sc.nextInt();
            B[i] = Math.sqrt(A[i]);}

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
