package src;

public class Kart {
    // Para explicações mais aprofundadas, visite 'Personagem.java'

    // Criação de atributos para a classe 'Kart'
    private String cor;
    private Personagem personagem;

    // Criação de métodos: Getters e Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }
}