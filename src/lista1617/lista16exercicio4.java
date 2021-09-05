package lista1617;

/*Supondo que a população de um país A seja da ordem
de 80000 habitantes com uma taxa anual de crescimento
de 3% e que a população de B seja 200000 habitantes
com uma taxa de crescimento de 1.5%. Faça um programa
que calcule e escreva o número de anos necessários para
que a população do país A ultrapasse ou iguale a população
do país B, mantidas as taxas de crescimento*/

public class lista16exercicio4 {
    public static void main(String[] args) {

        int A = 80000;
        int B = 200000;
        int count = 0;

        while (A < B){
            A = (A * 3)/100 + A;
            B = (int) ((B * 1.5)/100 + B);
            count++;

        }
        System.out.println("A população de A é: " + A);
        System.out.println("A população de B é: " + B);
        System.out.println("A quantidade de anos é: " + count);




    }


}
