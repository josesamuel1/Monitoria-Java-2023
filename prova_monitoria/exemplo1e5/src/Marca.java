public class Marca {
    // Variáveis
    private String nome;
    private int ano;

    // Construtor
    public Marca(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}
