package lista1617;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/*Faça um programa que leia um nome de usuário
e a sua senha e não aceite a senha igual ao nome
do usuário, mostrando uma mensagem de erro e
voltando a pedir as informações
 */
public class lista16exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       boolean infoValidas = false;

        do {
            System.out.println("Digite o nome do usuário:");
            String usuario = sc.nextLine();

            System.out.println("Digite a senha:");
            String senha = sc.nextLine();

            if (usuario.equalsIgnoreCase(senha)){ /*equalsIgnoreCase não é sensível.
            Se quiser diferenciar lera maiúscula de minúscula, usar aqenas equals.*/
                System.out.println("A senha não pode ser igual ao nome do usuário. Digite novamente");}else {
                infoValidas = true;
                System.out.println("Senha e usuarios aceitos");
            }

        }while (infoValidas == false);
    }

}
