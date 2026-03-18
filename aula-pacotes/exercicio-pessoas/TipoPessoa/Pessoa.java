package TipoPessoa;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int pesoEmGramas;
    private int alturaEmCentimentros;
    public Pessoa (String nome, String sobrenome, int pesoEmGramas, int alturaEmCentimentros) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.pesoEmGramas = pesoEmGramas;
        this.alturaEmCentimentros = alturaEmCentimentros;
    }
    public Pessoa () { // construtor padrão

    }
    public String nomeCompleto (String nome, String sobrenome) {
        return nome + sobrenome;
    }
    public double pesoEmKilogramas (int pesoEmGramas) {
        return pesoEmGramas/1000.0; //.0 para forçar a ser double
    }
    public double alturaEmMetros (int alturaEmCentimentros) {

        return alturaEmCentimentros/100.0;
    }
}
