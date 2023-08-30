public class main {
    public static void main(String[] args) {
        // Instanciamento de uma marca que será usada como exemplo de composição.
        Marca marca1 = new Marca("Samsung", 2019);

        /*
        Instanciamento de um novo objeto 'controle' do tipo 'Sistema'
        que recebe como parâmetro o objeto 'marca1', instância do tipo Marca.
        */
        Sistema controle = new Sistema(marca1);

        // Informa ao usuário o status da TV atualmente.
        controle.menu();

        // Algumas verificações sobre o teste de unidade a seguir:

        // Comando para tocar ou pausar a música.
        controle.executarApp();

        // Comando para ligar ou desligar a TV.
        controle.ligarOuDesligar();

        // Comando para aumentar o volume, usado 3x.
        controle.maisVolume();
        controle.maisVolume();
        controle.maisVolume();

        // Comando para tocar ou pausar a música.
        controle.executarApp();

        // Novamente o comando de informar ao usuário o status da TV atualmente.
        controle.menu();
    }
}