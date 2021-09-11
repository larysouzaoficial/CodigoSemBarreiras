package lista19;

public class lista19Aula {
    public static void main(String[] args) {

        int [] temp = new int[365];
        temp [0] = 10;
        temp [1] = 20;
        temp [2] = 25;
        temp [3] = 27;
        temp [4] = 30;

        System.out.println("O valor da temperatura do dia 3 é" + temp[3]);
        System.out.println("Valores do array é: " + temp);
        System.out.println("O tamanho do array é:" +temp.length);

        for (int i= 0;i< temp.length;i++){
            System.out.println("O valor do dia "+ (i+1) + " é " +temp[i]);

        for (int t : temp){
            System.out.println(temp);
        }
        }
    }
}
