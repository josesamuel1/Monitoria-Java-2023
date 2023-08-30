public class Sistema {
    // Variáveis usadas em 'Sistema'.
    private boolean ligado;
    private int volume;
    private boolean tocando;
    private Marca marca;

    /*
    Construtor padrão de 'Sistema', sem requisitos
    sendo pedidos pelo usuário, apenas valores
    inseridos automaticamente pela classe.
    */
    public Sistema(Marca marca) {
        this.setLigado(false);
        this.setVolume(50);
        this.setTocando(false);
        this.marca = marca;
    }

    // Menu que informa valores para o usuário caso sua função seja chamada.
    public void menu () {
        System.out.println("-=-=-=- MENU -=-=-=-");

        // Informações da marca e do ano de lançamento da TV.
        System.out.println("Marca da TV: " + this.getMarca().getNome());
        System.out.println("Ano de lançamento: " + this.getMarca().getAno());

        // Caso a televisão esteja ligada.
        if (this.isLigado()) {
            System.out.println("TV Ligada.");
        } else {
            System.out.println("TV Desligada.");
        }

        // Caso a música esteja ligada.
        if (this.tocando) {
            System.out.println("Música ligada.");
        } else {
            System.out.println("Música desligada.");
        }

        // Informa o volume atual da televisão
        System.out.print("Volume: " + this.getVolume() + " ");
        for (int i = 0; i < this.getVolume(); i += 10) {
            System.out.print("█|");
        }

        System.out.println();
        System.out.println();
    }

    // Getters e Setters
    private boolean isLigado() {
        return this.ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return this.volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private Marca getMarca() {
        return this.marca;
    }

    // Funções do controle remoto que o usuário pode usar ou não.
    // Todas com verificações adequadas de ocasiões reais.
    public void ligarOuDesligar() {
        if (this.ligado) {
            setLigado(false);
            System.out.println("Desligou a TV.");
        } else {
            setLigado(true);
            System.out.println("Ligou a TV.");
        }
    }

    public void maisVolume () {
        if (this.ligado) {
            if (this.getVolume() == 100) {
                System.out.println("Volume máximo atingido.");
            } else {
                this.setVolume(this.getVolume() + 1);

                System.out.print("Volume: " + this.getVolume() + " ");
                for (int i = 0; i < this.getVolume(); i += 10) {
                    System.out.print("█|");
                }
                System.out.println();
            }
        } else {
            System.out.println("TV Desligada. Ligue-a para alterar o volume.");
        }
    }
    public void menosVolume () {
        if (this.ligado) {
            if (this.getVolume() == 0) {
                System.out.println("Volume mínimo atingido.");
            } else {
                this.setVolume(this.getVolume() - 1);

                System.out.print("Volume: " + this.getVolume() + " ");
                for (int i = 0; i < this.getVolume(); i += 10) {
                    System.out.print("█|");
                }
                System.out.println();
            }
        } else {
            System.out.println("TV Desligada. Ligue-a para alterar o volume.");
        }
    }

    public void executarApp () {
        if (this.ligado) {
            if (this.tocando) {
                this.setTocando(false);
                System.out.println("Música pausada.");
            } else {
                this.setTocando(true);
                System.out.println("Música tocando.");
            }
        } else {
            System.out.println("TV Desligada. Ligue-a para tocar música.");
        }
    }
}