public class Utilidade {
    void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
    void exibirProduto(String nome, double preco, int quantidade) {
        double pq = preco * quantidade;
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println(String.format("Valor total do estoque: %.2f", pq));
    }
    void monstrarAluno(String nome, double nota) {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Nota: " + nota);
    }
    void mostrarAreaRetanulo(double base, double altura) {
        double area = base * altura;
        System.out.println("A área de " + base + " e " + altura + " é: " + area);
    }
}
