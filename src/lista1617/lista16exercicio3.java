package lista1617;

/*Faça um programa que leia e valide as seguintes
informações: a. Nome: maior que 3 caracteres; b.
Idade: entre 0 e 150; c. Salário: maior que zero;
d. Sexo: 'f' ou 'm'; e. Estado Civil: 's', 'c', 'v', 'd';
 */

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class lista16exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        float salario;
        String sexo;
        String estadoCivil;
        boolean infoValida = false;

        do {
            System.out.println("Digite o nome:");
            nome = sc.nextLine();
            if (nome.length() > 3){
                infoValida = true;
            }else{
                System.out.println("O nome deve ter mais de 3 caraceres. Digite novamente");
            }
        }while (infoValida == false);

        infoValida = false;

        do{
            System.out.println("Digite a idade:");
            idade = sc.nextInt();
            if (idade >= 0 && idade <=150){
                infoValida = true;
            }else {
                System.out.println("A idade de estar entre 0 a 150. Digite novamente");
            }
        }while (infoValida == false);

        infoValida = false;

        do{
            System.out.println("Digite o salário:");
            salario = sc.nextFloat();
            if (salario > 0){
                infoValida = true;
            }else {
                System.out.println("O salária deve ser maior que zero.Digite novamente:");
            }
        }while (infoValida == false);

        infoValida = false;

        do{
            System.out.println("Digite o sexo. F- para feminino.M para masculino:");
            sexo = sc.nextLine();
            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")){
                infoValida = true;
            }else {
                System.out.println("Você deve digitar F ou M. Digite novamente:");
            }
        }while (infoValida == false);

        infoValida = false;

        do{
            System.out.println("Digite o estado civil. C - casado. D - divorciado. V - viúvo. S - solteiro:");
            estadoCivil = sc.nextLine();
            if (estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("d") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("s")){
                infoValida = true;
            }else {
                System.out.println("Você deve digitar c,d,v ou s. Digite novamente:");
            }
        }while (infoValida == false);

        System.out.println("AS iformações são:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$" + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);


    }

}
