package modulo7;

/**
 * @Autor: Edvaldo Luiz da Silva Junior
 */

public class Main {

    public static void main(String[] args) {

        //Instanciando o objeto
        Caneta caneta = new Caneta(1, "BIC", "Azul");

        //Chamando os métodos
        caneta.propriedades();
        caneta.tirarTampa();
        caneta.escrever();
        caneta.colocarTampa();
    }
}
