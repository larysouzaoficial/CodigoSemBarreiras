package Arrays;

//Escreva um algoritmo que leia números insira em um array e depois mostre os números e informações na tela

import java.util.ArrayList;
import java.util.Scanner;

public class arraysExercicio1 {
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

                        }

        }
    }}

