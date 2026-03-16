import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("Escreva um número: ");
        int a = sa.nextInt();
        System.out.println("Escreva um número: ");
        int b = sa.nextInt();
        int soma = a + b;
        System.out.println("A soma de " + a + " e " + b + " é " + soma);
        int subtracao = a - b;
        System.out.println("A subtração de " + a + " e " + b + " é " + subtracao);
        int divisao = a / b;
        System.out.println("A divisão de " + a + " e " + b + " é " + divisao);
        int multiplicacao = a * b;
        System.out.println("A multiplicação de " + a + " e " + b + " é " + multiplicacao);

    }
}
