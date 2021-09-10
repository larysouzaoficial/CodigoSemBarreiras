package lista1617;

/*.A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,...
Faça um programa que gere a série até que o valor seja maior que 500.
 */

public class lista16exercicio16 {

    public static void main(String[] args) {

        int i;
        int num1=1;
        int num2 = 0;
        int fibonacci=0;



        while (num2<=500){
            num2 = fibonacci;
            fibonacci = num1 + fibonacci;
            num1 = num2;
            System.out.println(num2 + " ");
        }
    }


}
