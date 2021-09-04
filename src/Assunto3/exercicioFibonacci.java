package Assunto3;

public class exercicioFibonacci {
    public static void main(String[] args) {

        int n1 = 1;
        int n2;
        int fibonacci = 0;


        for (int i = 0; i<=10; i ++){
            n2=fibonacci;
            fibonacci = n1 + fibonacci;
            n1=n2;
            System.out.println(n2);
        }
    }
}
