package Atividade2;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite 3 números:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


        if (a % 2 == 0){
             if(a > b && a>c){ System.out.println("maior: " + a);
            }}
        if (b % 2 == 0){
            if(b > a && b>c ){ System.out.println("maior: " + b);
            }}
        if (c % 2 == 0){
            if(c > b && c>a){ System.out.println("maior: " + c);
            }}

        if (a % 2 == 0){
            if(a < b && a<c){ System.out.println("menor: " + a);
            }}
        if (b % 2 == 0){
            if(b < a && b<c ){ System.out.println("menor: " + b);
            }}
        if (c % 2 == 0){
            if(c < b && c<a){ System.out.println("menor: " + c);
            }}



            int media = ((a+b+c)/3);
            System.out.println("a media é " + media);


                }
        }

