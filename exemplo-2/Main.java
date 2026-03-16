//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // sempre começa com classe
    // toda classe começa com letra maiúscula (no caso o Main)
    public static void main(String[] args) {
        // método é conhecido como main, todo programa inicia e com letra minúscula
        // class, public, static e void são palavras chaves do Java, sendo em minúscula
        // e não podem ser utilizadas fora de contexto
        // case sensitive: diferencia letras maiúsculas de minúsculas
        // convenções: nomes em java seguem o formato CamelCase
        // atribuição de valores
        int valorInteiro = 10; // direita para esquerda
            System.out.println(valorInteiro); // imprimi o valor que armazenei dentro de valorInteiro
        double valorDouble = 15.5;
        valorDouble = 20; // ele altera o valor para o novo atribuído, mesmo declarando antes
            System.out.println(valorDouble);
           //String valorDouble = 10; // não daria certo por não poder usar números, apenas texto
        char armazenaUmCaractere='>'; // armazena apenas um caractere e com aspas simples
        String texto = ""; // armazena vários textos
        System.out.println("Ana");
        System.out.print("Bautzer");
        // toda chave começa e deve ser fechada, aberta na mesma linha do método/classe
        // ponto e virgula é utilizado para separar as instruções
    }
}