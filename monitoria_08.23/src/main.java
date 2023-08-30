package src;

public class main {
    public static void main(String[] args) {
        /*
            Exemplo de como acontece o instanciamento/a criação de um objeto:
            1 - Tipo da instância/objeto.
            2 - Nome da instância/objeto.
            3 - Operador usado para criar uma nova instância
                de uma classe, ou seja, criar um novo objeto.
            4 - Função do tipo que será criado a nova instância.
            5 - Toda função contém parênteses no
                final, essa não vai ser exceção.
        */
        
        // Criação de um objeto do tipo 'Personagem'
        // 1        2        3       4     5
        Personagem pessoa = new Personagem();

        // Criação de um objeto do tipo 'Kart'
        // 1  2      3   4   5
        Kart kart = new Kart();

        /*
            O encapsulamento é uma forma de proteger os dados de
            uma variável qualquer de uma classe qualquer.

            Quando uma classe é devidamente encapsulada, seus
            valores só podem ser alterados por meio das funções
            'Setters', explicadas mais a fundo em 'Personagem.java'.

            Agora que o encapsulamento foi atribuído á variável
            'nome', em 'Personagem', a troca de valores não irá
            mais acontecer de forma direta, mas sim, apenas pelas
            funções que fazem esse trabalho (nesse caso, setNome()).
        */

        // Exemplo errado de atribuir um nome para pessoa:
        // pessoa.nome = "Samuel";

        /*
            Exemplo correto de atribuir um nome para pessoa:

            1 - Nome da instância/objeto.
            2 - Função 'set' a qual vai mudar
                o valor de uma variável.
            3 - Novo valor para a variável
                (entre "" pois nesse caso é esperado uma String)
        */
        // 1      2       3
        pessoa.setNome("Samuel");

        // Outro exemplo, mas agora com o kart:
        // 1   2        3
        kart.setCor("Azul");

        /*
            Podemos também atribuir valores que são do tipo
            de outras classes para os objetos que TEM UMA outra
            classe como atributo, isso inclui adicionar 'pessoa'
            em 'kart' e vice-versa.
        */

        // Adicionando kart à pessoa
        pessoa.setKart(kart);

        // Adicionando pessoa à kart
        kart.setPersonagem(pessoa);

        /*
            Agora que uma classe contém a outra, podemos
            mostrar seus valores de várias formas, como:
        */

        // Exibindo o nome da pessoa e a cor do kart que TEM em pessoa
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getKart().getCor());

        // Exibindo a cor do kart e o nome da pessoa que TEM em kart
        System.out.println(kart.getCor());
        System.out.println(kart.getPersonagem().getNome());

        /*
            Nesse caso, como um objeto TEM um ao outro, uma
            exibição muito grande pode ser chamada, apesar de
            existir uma forma mais simplificada. Ex.:
        */

        /*
            Exibindo o nome de 'pessoa' que existe em 'Personagem'
            que existe em 'Kart' que existe no objeto 'pessoa'.
        */
        System.out.println(pessoa.getKart().getPersonagem().getNome());

        /*
            Ou até mesmo exibindo a cor de 'kart' que existe em 'Personagem'
            que existe em 'Kart' que existe no objeto 'kart'
        */
        System.out.println(kart.getPersonagem().getKart().getCor());
    }
}