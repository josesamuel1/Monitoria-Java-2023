// 'Pessoa' foi criada como 'abstract' pois nessa explicação, ela não deve ser instanciada como objeto.
// Implementação da interface 'Metodos' para que todos os requisitos que estão lá, sejam cumpridos.
public abstract class Pessoa implements Metodos{
    // Variáveis
    private String nome;
    private String sexo;
    private int idade;

    // Construtor de Pessoa
    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    // Funções requeridas pela interface, implementada na classe.
    // Exibe as informações básicas de uma pessoa.
    public void informacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
    }

    // Função padrão para uma pessoa fazer aniversário.
    public void fazerAniv() {
        setIdade(getIdade() + 1);
        System.out.println(getNome() + " fez aniversário e está completando " + getIdade() + " anos.");
    }

    // Getters e Setters
    protected String getNome() {
        return nome;
    }
    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getSexo() {
        return sexo;
    }
    protected void setSexo(String sexo) {
        this.sexo = sexo;
    }

    protected int getIdade() {
        return idade;
    }
    protected void setIdade(int idade) {
        this.idade = idade;
    }
}
