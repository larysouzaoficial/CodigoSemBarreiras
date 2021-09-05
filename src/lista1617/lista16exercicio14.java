package lista1617;
import javax.swing.JOptionPane;

/*Faça um programa que peça 10 números inteiros, calcule
e mostre a quantidade de números pares e a quantidade de números impares
 */

import javax.swing.*;
import java.util.Scanner;

public class lista16exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int par = 0;
        int impar = 0;

        for (int i = 0; i<10;i++){
            JOptionPane.showMessageDialog(null,"::: Entre com um número:::: \n");
           num = sc.nextInt();
            if (num % 2 ==0){
                par ++;
            }else {
                impar ++;
            }


        }
        System.out.println("A quantidade de númers pares é: "+par);
        System.out.println("A quantidade de númers pares é: "+impar);
    }


}
