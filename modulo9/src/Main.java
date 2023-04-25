import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Instanciando a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Mensagem no console
        System.out.println("Digite um número");

        //Lendo numero com o Scanner
        int numero = scanner.nextInt();

        //Imprimindo no console
        System.out.println(numero);

        //Fazendo o Casting explicito de uma variavel primitiva para uma variavel Wrappers
        Double numero2 = (double) numero;

        //Imprimindo no console
        System.out.println(numero2);
    }
}