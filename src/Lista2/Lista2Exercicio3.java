package Lista2;

//verificar se a letra digitada corresponde ao sexo feminino ou masculino

import java.util.Scanner;

public class Lista2Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite F ou M");
        String letra = sc.next();
/* não se pode fazer uma comparação com string,
pois ela é uma classe. Ela não é sensível,
pode receber letras maiúsculas ou minúsculas */

        if (letra.equalsIgnoreCase("f")){
            System.out.println("Feminino");}
        else if (letra.equalsIgnoreCase("m")){
            System.out.println("Masculino");}
        else{
            System.out.println("Sexo inválido");
        }
    }
}
