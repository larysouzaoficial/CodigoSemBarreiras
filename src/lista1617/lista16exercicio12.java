package lista1617;

/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada
de qualquer número inteiro entre 1 a 10. O usuário deve informar
de qual numero ele deseja ver a tabuada. A saída deve ser conforme
o exemplo abaixo: o Tabuada de 5: o 5 X 1 = 5 o 5 X 2 = 10 o ... o 5 X 10 = 50
 */

import java.util.Scanner;

public class lista16exercicio12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num;
        int tabuada = 0;
        System.out.println("De qual número deseja ver a tabuada?");
        num = sc.nextInt();

        for (int i = 0; i <=10; i++){
            tabuada = num * i;

            System.out.println(num + "X" + i + " = " + tabuada );

        }


    }
}
