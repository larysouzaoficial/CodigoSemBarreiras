package Arrays;

import java.util.Random;
import java.util.Scanner;

public class jogoDaForca {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var tentativas = 10;

            String[] possiveisPalavras = {
                    "banana",
                    "abacaxi",
                    "mamute",
                    "hipocondriaco",
                    "java",
                    "alelo",
                    "chocolate",
                    " morango "
            };

            var random = new Random();//sortear as palavras aleatoriamente
            var palavra = possiveisPalavras[random.nextInt(possiveisPalavras.length)].trim().toLowerCase();
            //toLowerCase para valer as palavras maiúsculas e minúsculas

            System.out.printf("A palavra escolhida tem %d letras\n", palavra.length());

            var palavraRevelada = new String[palavra.length()];

            var palavraAcertada = false;

            while (tentativas > 0 && !palavraAcertada) {
                var houveAcerto = false;
                System.out.println("Digite uma letra");
                char letra = scanner.next().toLowerCase().charAt(0);

                var letraJaEscolhida = false;

                for (var letraAcertada: palavraRevelada) {
                    if (letraAcertada != null && letraAcertada.equals(String.valueOf(letra))) {
                        System.out.println("Você já escolheu essa letra!");
                        letraJaEscolhida = true;
                        break;
                    }
                }

                if (letraJaEscolhida) {
                    tentativas--;
                    System.out.printf("Você tem %d tentativas\n", tentativas);
                    continue;
                }

                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) == letra) {

                        // Com o uso de array da String
                        palavraRevelada[i] = String.valueOf(palavra.charAt(i));
                        houveAcerto = true;

                    }
                }

                if (!houveAcerto) {
                    tentativas--;
                }

                palavraAcertada = true;
                for (var letraRevelada : palavraRevelada) {
                    if (letraRevelada == null) {
                        palavraAcertada = false;
                        break;
                    }
                }

                for (var letraRevelada : palavraRevelada) {
                    if (letraRevelada != null) {
                        System.out.print(letraRevelada + " ");
                    } else {
                        System.out.print("- ");
                    }
                }
                System.out.println("");

                if (!palavraAcertada) {
                    System.out.printf("Você tem %d tentativas\n", tentativas);
                }


            }

            if (tentativas == 0) {
                System.out.println("Você pedeu.");
            } else {
                System.out.println("Você ganhou.");
            }
        }

    }
}
