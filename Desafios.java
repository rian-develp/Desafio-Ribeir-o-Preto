import java.util.Scanner;

public class Desafios {

    // Desafio do número fibonacci
    public void calculaNumeroFibonacci() {
        int primeiroNumeroSequenciaFibonacci = 0;
        int segundoNumeroSequenciaFibonacci = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInsira um número para saber se está na sequência de fibonacci");
        int numeroDoUsuario = scanner.nextInt();

        if (numeroDoUsuario == primeiroNumeroSequenciaFibonacci || numeroDoUsuario == segundoNumeroSequenciaFibonacci) {
            System.out.println("Pertence à sequência de Fibonacci");
            scanner.close();
            return;
        }

        int numeroFinal = primeiroNumeroSequenciaFibonacci + segundoNumeroSequenciaFibonacci;

        while (numeroFinal <= numeroDoUsuario) {
            if (numeroFinal == numeroDoUsuario) {
                System.out.println("pertence à sequência de fibonacci");
                break;
            }
            primeiroNumeroSequenciaFibonacci = segundoNumeroSequenciaFibonacci;
            segundoNumeroSequenciaFibonacci = numeroFinal;
            numeroFinal = primeiroNumeroSequenciaFibonacci + segundoNumeroSequenciaFibonacci;
        }

        if (numeroFinal != numeroDoUsuario) {
            System.out.println("não pertence à sequência de fibonacci");
        }
        scanner.close();
    }

    // Desafio de verificar quantas letras 'a' maiúscula ou minúscula tem
    public void verificaLetra(String palavra) {

        int contador = 0;
        
        for (int index = 0; index < palavra.length(); index++) {
            char letraAtual = palavra.charAt(index);
            if (letraAtual == 'a' || letraAtual == 'A') {
                contador = contador + 1;
            }
        }
        System.out.println("A palavra tem " + contador + " letras a");
    }

    // Desafio de mostrar o valor da variável soma
    public void verificaSoma(){
        final int INDICE = 12; 
        int soma = 0;
        int k = 1;
        
        while (k < INDICE) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println(soma);
    }
}
