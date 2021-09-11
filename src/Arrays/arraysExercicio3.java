package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arraysExercicio3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Digite o tamanho do vetor:" );
            var tamanhoDoVetor = sc.nextInt();

            var numeros = new int [tamanhoDoVetor];

            for (int i =0;i < numeros.length; i++){
                System.out.println("Digite os números: ");
                numeros[i] = sc.nextInt();
            }
           var stream =  Arrays.stream(numeros).filter(numero -> numero % 2 == 0);
           stream.forEach(System.out::print);
        }

    }
}
