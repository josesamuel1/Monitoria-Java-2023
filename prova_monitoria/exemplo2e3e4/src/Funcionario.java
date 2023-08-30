public class Funcionario extends Pessoa {
    // Variáveis
    private String setor;
    private boolean trabalhando;

    // Construtor de Funcionário
    public Funcionario(String nome, String sexo, int idade, String setor, boolean trabalhando) {
        super(nome, sexo, idade);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    // Método de polimorfismo de sobreposição.
    // A mensagem padrão de aniversário é alterada, pois nesse caso o funcionário teve seu método 'fazerAniv()' sobreposto (@Override), exibindo assim uma outra mensagem.
    @Override
    public void fazerAniv() {
        System.out.println("O funcionário " + getNome() + " fez aniversário e teve seu dia de folga.");
    }

    // Função de mudar o trabalho do funcionário.
    public void mudarTrab(String setor) {
        if (this.trabalhando) {
            System.out.println("Trabalho mudado para '" + getSetor() + "' com sucesso");
        } else {
            System.out.println("O usuário não está trabalhando no momento.");
        }
    }

    // Função para empregar o funcionário ou demiti-lo.
    public void empregado() {
        if (this.trabalhando) {
            this.trabalhando = false;
            System.out.println("Funcionário retirado do trabalho.");
        } else {
            this.trabalhando = true;
            System.out.println("Funcionário está agora trabalhando.");
        }
    }

    // Getters e Setters
    protected String getSetor() {
        return setor;
    }
    protected void setSetor(String setor) {
        this.setor = setor;
    }

    protected boolean isTrabalhando() {
        return trabalhando;
    }
    protected void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
