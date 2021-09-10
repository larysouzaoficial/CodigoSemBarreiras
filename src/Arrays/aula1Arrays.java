package Arrays;

import java.util.Arrays;

public class aula1Arrays {
    public static void main(String[] args) {

        int [] diasDaSemana = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(diasDaSemana); // imprime o endereço de memória
        System.out.println(Arrays.toString(diasDaSemana)); //toString imprime o array

        //diasDaSemana [6]=999 // troca valor da variável

        for (int dia : diasDaSemana){
            System.out.println(dia);
        } // imprime o array

        for (int i =0; i < diasDaSemana.length; i++){
            System.out.print(diasDaSemana[i] + " ");
        }

        System.out.println("\nfor com lambda");
        //forma de imprimir
        //filtrar
        for (int i : diasDaSemana) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


    }}
