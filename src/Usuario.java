import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //não precisa de mais um scanner
        // leitura e dados via teclado/usuario
        final int CONSTANTE = 5;
        int valorA = 3;
        int valorB = 7;
        int auxiliar;

        auxiliar = valorA; //a ordem é importante
        valorA = valorB;
        valorB = auxiliar;
        System.out.println(valorA);
        System.out.println(valorB);
        System.out.println("Escreva um número");
        int recebeValor = sc.nextInt();
        System.out.println(recebeValor);
        System.out.println("Escreva um número decimal");
        double abc = sc.nextDouble();
        System.out.println(abc);
        String def = sc.nextLine();

    }
}