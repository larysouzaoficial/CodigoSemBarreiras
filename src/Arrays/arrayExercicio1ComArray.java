package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayExercicio1ComArray {
    public static void main(String[] args) {


        try (Scanner in = new Scanner(System.in)){
            var programaDeveContinuarExecutando= true;
            var quantidadeDeItensAdicionados = 0;

            var numeros = new Integer[10];


            while (programaDeveContinuarExecutando && quantidadeDeItensAdicionados < 10){
                System.out.println("Digie um numero:");
                numeros[quantidadeDeItensAdicionados] = in.nextInt();

                System.out.println("Deseja adicionar mais um número? [s] [n]");
                if (in.next().charAt(0) == 'n'){
                    programaDeveContinuarExecutando = false;
                }

                quantidadeDeItensAdicionados++;
            }
            System.out.println(Arrays.toString(numeros));


        }

    }
}
