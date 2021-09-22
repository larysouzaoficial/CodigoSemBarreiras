package NewGenTeste.NewGen;

import java.util.Scanner;

public class Administrador {
    Integer senha = 321;

    public boolean acessoAdministrador(){
        Scanner senhaAdmin = new Scanner(System.in);
        System.out.println("##########################################");
        System.out.println("Acesso somente para o administrador");
        System.out.println("Digite a senha:");
        System.out.println("##########################################");
        int senhaDigitada = senhaAdmin.nextInt();
        if (senhaDigitada == senha){
            System.out.println("Senha correta!");
            return true;
        }else {
            System.out.println("A senha está incorreta!");
        }return false;
    }
}
