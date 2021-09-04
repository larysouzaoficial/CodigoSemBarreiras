package Atividade1;

import java.util.Scanner;

public class ExrecicioEleitores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Neleitores, Total, Abst, validos, brancos, nulos, CA, CB;
        double Pvalidos, Pbrancos, Pnulos, PCA, PCB, Pabs;

        System.out.println("Digite o número de eleitores:");
        Neleitores = sc.nextDouble();

        System.out.println("Digite o número de votos válidos:");
        validos = sc.nextDouble();

        System.out.println("Digite o número de votos brancos:");
        brancos = sc.nextDouble();

        System.out.println("Digite o número de votos nulos:");
        nulos = sc.nextDouble();

        System.out.println("Digite o número de votos do candidato A:");
        CA = sc.nextDouble();

        System.out.println("Digite o número de votos do candidato B:");
        CB = sc.nextDouble();

        System.out.println("Digite o número de abstenções:");
        Abst = sc.nextDouble();

        //Pvalidos, Pbrancos, Pnulos, PCA, PCB

        Total = (Neleitores - Abst);
        Pvalidos = ((validos * 100)/Total);
        Pbrancos = ((brancos * 100)/Total);
        Pnulos = ((nulos * 100)/Total);
        PCA = ((CA * 100)/validos);
        PCB = ((CB * 100)/validos);
        Pabs = ((Abst * 100)/Neleitores);

        System.out.println("***Resultado das Eleições***");
        System.out.println("Total de votos válidos: " + Pvalidos);
        System.out.println("Total de votos brancos: " + Pbrancos);
        System.out.println("Total de votos nulos: " + Pnulos);
        System.out.println("Total de votos do candiato A: " + PCA);
        System.out.println("Total de votos o candidato B: " + PCB);
        System.out.println("Total de abstenções: " + Pabs);

    }


}
