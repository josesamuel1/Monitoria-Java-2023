package src;

public class Personagem {

    // Criação de atributos para a classe 'Personagem'
    private String nome;

    /*
        Sabemos que está havendo uma composição quando um atributo
        tem o mesmo tipo de uma classe que foi criada pelo usuário.
        
        No caso a seguir, dizemos que a classe 'Personagem' TEM UM
        'Kart', ou seja, ela tem um atributo X do tipo 'Kart'.
    */
    private Kart kart;

    // Criação de métodos: Getters e Setters

    /*
        Métodos Getters (ex.: getNome() e getKart())

        Quando sua função é chamada, deve retornar um valor do tipo informado
        Em 'getNome()', o valor que deve ser retornado é 'nome', que é do tipo String
        Em 'getKart()', o valor que ele vai retornar é 'kart', do tipo Kart
    */

    /*
        Métodos Setters (ex.: setNome() e setKart())
    
        Quando sua função é chamada, ela deve reescrever o valor já contido
        na variável para outro valor que o usuário informar como parâmetro.

        Em 'setNome()', o valor que for passado como parâmetro irá substituir o
        atual valor da variável, contanto que esse mesmo valor seja do mesmo tipo
        da variável.

        Em 'setKart()', acontece quase a mesma coisa. Mais explicações no 'main.java'

        Exemplo de como funciona um método Setter explicado passo a passo:
            1 - Tipo de visão/proteção do método (encapsulamento).
            2 - Tipo do valor que deve ser retornado
                (se não deve retornar nada, coloca void).
            3 - Nome do método.
            4 - Tipo do valor que vai ser recebido como parâmetro
                (dentro do parênteses).
            5 - Nome do valor que vai ser recebido como parâmetro
                (também dentro parênteses e depois do seu tipo).
            6 - 'this.' para falar que a variável da qual ele está
                mencionando é a da classe atual (no caso, do nome do personagem).
            7 - Variável que vai receber um novo valor.
            8 - Variável informada pelo parâmetro.
    */
    public String getNome() {
        return nome;
    }

    // 1    2      3      4     5
    public void setNome(String x) {
        this.nome = x;
    //   6    7      8
    }

    public Kart getKart() {
        return kart;
    }

    // 1    2      3     4    5
    public void setKart(Kart kart) {
        this.kart = kart;
    //   6    7      8
    }
}