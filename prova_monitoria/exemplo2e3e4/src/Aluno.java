public class Aluno extends Pessoa {
    // Variáveis
    private String matricula;
    private String curso;

    // Construtor de Aluno
    public Aluno(String nome, String sexo, int idade, String matricula, String curso) {
        super(nome, sexo, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    // Função de cancelar a matrícula do aluno.
    public void cancelarMatricula() {
        System.out.println("Matrícula cancelada.");
    }

    // Função pagar mensalidade do aluno.
    public void pagarMensalidade() {
        System.out.println("Mensalidade do aluno " + getNome() + " paga.");
    }

    // Método de polimorfismo de sobrecarga.
    // Sobrecarga sem nenhum parâmetro
    public void entregarAtividade() {
        System.out.println("O aluno pode entregar uma atividade.");
    }

    // Sobrecarga com string
    public void entregarAtividade(String nomeProf) {
        System.out.println("O aluno " + getNome() + " entregou a atividade ao professor " + nomeProf);
    }

    // Sobrecarga com int
    public void entregarAtividade(int hora) {
        System.out.println("O aluno " + getNome() + " enviou a atividade às " + hora + " horas.");
    }

    // Sobrecarga com boolean
    public void entregarAtividade(boolean entregou) {
        if (entregou) {
            System.out.println("O aluno " + getNome() + " entregou a atividade.");
        } else {
            System.out.println("O aluno " + getNome() + " não entregou a atividade.");
        } 
    }

    // Getters e Setters
    protected String getMatricula() {
        return matricula;
    }
    protected void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    protected String getCurso() {
        return curso;
    }
    protected void setCurso(String curso) {
        this.curso = curso;
    }
}
