import java.util.Arrays;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    System.out.println("Digite os nomes separados por , : ");
    String input = scanner.nextLine();

    String[] nomesArray = input.split(",");
    Arrays.sort(nomesArray);

    System.out.println("Nomes ordenados:");
    for (String nome :  nomesArray) {
        System.out.println(nome);
    }

    scanner.close();
    }
}