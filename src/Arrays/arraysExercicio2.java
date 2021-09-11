package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class arraysExercicio2 {
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

            } int contador=0;
            for (Integer i : numeros){
                if (i<0 && i!= null){
                    contador++;
                }} System.out.println("O número de números negativos é: " + contador);
        }//Integer inicia nom null. Ex.: null, null, null.
        //int inicia com zero. Ex.: 0,0,0

    }

}
