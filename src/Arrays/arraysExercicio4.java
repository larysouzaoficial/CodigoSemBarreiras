package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arraysExercicio4 {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)){
            var programaDeveContinuarExecutando = true;


            var numeros = new ArrayList<Integer>();

            while (programaDeveContinuarExecutando){
                System.out.println("Digite um número");
                numeros.add(in.nextInt());


                System.out.println("Deseja adicionar mais um número? [s] [n]");
                if (in.next().charAt(0) == 'n'){
                    programaDeveContinuarExecutando = false;
                }

            }  int maior = Integer.MIN_VALUE;
            for (var n : numeros){
                if (n>maior){
                    maior=n;
                }
            }
            System.out.println("O maior valor é:");
            System.out.println(maior);
        }

    }
}
