import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in); //guarda o valores
        System.out.println("De o valor de a: ");
        int ab = sd.nextInt();
        System.out.println("De o valor de b: ");
        int bc = sd.nextInt(); //o usuario escreve o valor
        int resul = ab + bc;
        System.out.println("A soma é: " + resul); /*System.out.println("A soma é: " + (ab + bc))
                                                  só exibe o resultado nessa linha, diminui o espaço de memoria*/
    }
}
