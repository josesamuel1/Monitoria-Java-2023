public class Professor extends Pessoa {
    // Variáveis
    private String especialidade;
    private float salario;

    // Construtor de Professor
    public Professor(String nome, String sexo, int idade, String especialidade, float salario) {
        super(nome, sexo, idade);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    // Método de polimorfismo de sobreposição.
    // A mensagem padrão de aniversário é alterada, pois nesse caso o professor teve seu método 'fazerAniv()' sobreposto (@Override), exibindo assim uma outra mensagem.
    @Override
    public void fazerAniv() {
        System.out.println("O professor " + getNome() + " fez aniversário e teve seu dia de folga.");
    }    

    // Função para ajustar o salário do professor.
    public void receberAum(float s) {
        setSalario(getSalario() + s);
        System.out.println("Aumento efetuado com sucesso.");
    }

    // Getters e Setters
    protected String getEspecialidade() {
        return especialidade;
    }
    protected void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    protected float getSalario() {
        return salario;
    }
    protected void setSalario(float salario) {
        this.salario = salario;
    }
}
