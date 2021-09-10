package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayExercicio1ComArrayList {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)){
             var programaDeveContinuarExecutando= true;

             var numeros = new ArrayList<Integer>();
             //ArrayList<Integer> numeros =  new ArrayList<>();  // poderia ser assim também

            while (programaDeveContinuarExecutando){
                System.out.println("Digie um numero:");
                numeros.add(in.nextInt());

                System.out.println("Deseja adicionar mais um número? [s] [n]");{
                if (in.next().charAt(0) == 'n'){
                    programaDeveContinuarExecutando = false;
                }}
            }
        }

    }
}
