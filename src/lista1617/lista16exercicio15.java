package lista1617;

/*.A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
Faça um programa capaz de gerar a série até o n−ésimo termo.
 */

public class lista16exercicio15 {
    public static void main(String[] args) {

        int i;
        int num1=1;
        int num2;
        int fibonacci=0;



        for (i = 0; i <10; i++){
            num2 = fibonacci;
            fibonacci = num1 + fibonacci;
            num1 = num2;
            System.out.println(num2 + " ");
        }
    }
}
