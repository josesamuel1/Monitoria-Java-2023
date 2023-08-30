import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // Criação de um tratamento de exceção
        try {
            // Tentativa de criação incorreta de um objeto abstrato do
            // tipo 'Pessoa' pois a classe não pode ser instanciada.
            // Pessoa p1 = new Pessoa();
    
            // Objeto 'a1' criado como instância do tipo 'Aluno'.
            Aluno a1 = new Aluno("Samuel", "M", 20, "12345", "ADS");
            // Mostra uma mensagem dizendo que o aluno pagou sua mensalidade.
            a1.fazerAniv();
    
            // Mostra uma mensagem diferente para cada tipo de parâmetro que for inserido.
            // O método de polimorfismo de sobrecarga foi aplicado nesses comandos para
            // exibir
            // mensagens diferentes para cada tipo de parâmetro inserido com a função.
            a1.entregarAtividade();
            a1.entregarAtividade("Pablo");
            a1.entregarAtividade(13);
            a1.entregarAtividade(true);
            a1.entregarAtividade(false);
    
            // Objeto 'a2' criado como instância do tipo 'Aluno'.
            Aluno a2 = new Aluno("Bruna", "F", 23, "12347", "ADS");
    
            // O método de polimorfismo de inclusão foi aplicado na criação da ArrayList 'listaDeAlunos'.
            // Lista do tipo 'Aluno' foi criada e os alunos 'a1' e 'a2' foram inseridos nela.
            ArrayList<Aluno> listaDeAlunos = new ArrayList<>();
            listaDeAlunos.add(a1);
            listaDeAlunos.add(a2);
    
            // Caso de repetição que percorre a lista 'listaAlunos' e
            // informa o nome do aluno de acordo com seu índice na lista.

            // Haverá uma tentativa falha de que o caso de repetição tentará
            // acessar um índice inexistente, ou seja, um índice maior do que o
            // tamanho da 'listaDeAlunos', que consequentemente interrompe
            // o processo do programa e o código terá continuidade no caso 'catch'.
            for (int i = 0; i < 4; i++) {
                System.out.println("Nome do aluno do índice " + i);
                System.out.println(listaDeAlunos.get(i).getNome());
            }
    
            // Objeto 'f1' criado como instância do tipo 'Funcionario'.
            Funcionario f1 = new Funcionario("Carlos", "M", 35, "Financeiro", true);
    
            // Mostra uma mensagem dizendo que o funcionário fez aniversário.
            // O método de polimorfismo de sobreposição foi aplicado nesse comando para
            // exibir uma mensagem diferente da padrão.
            f1.fazerAniv();

            // A seguir, o tratamento de exceção para o caso de repetição anteriormente mencionado.
        } catch (IndexOutOfBoundsException e) {
            // Ao invés do programa ser interrompido, esta mensagem
            // será exibida e o progama continuará normalmente.
            System.out.println("Tentativa falha de listar algo que não possui tamanho suficiente.");
        } finally {
            // Algo que está mencionado dentro do 'finally' sempre será
            // executado independentemente se algum erro tenha sido tratado.
            System.out.println("Finalização do programa.");
        }

    }
}