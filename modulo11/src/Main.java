import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> feminino = new ArrayList<>();
        List<String> masculino = new ArrayList<>();

        String nome;
        String sexo;

        System.out.println("==== Lista de nomes ====");

        System.out.println("Digite a quantidade de nomes que irá adicionar:");

        int quantidade = scanner.nextInt();

       for (int i = 0; i < quantidade ; i++) {

           System.out.println("Digite o nome:");
           nome = scanner.next();

           System.out.println("Digite o sexo  [M] - Maculino /[F] - Feminino");
           sexo = scanner.next();

           if (sexo.equalsIgnoreCase("f")) {
               feminino.add(nome + " ");
           } else if (sexo.equalsIgnoreCase("m")) {
               masculino.add(nome + " ");
           } else {
               System.out.printf("sexo não identificado\n");
           }
       }

       Collections.sort(feminino);
        System.out.printf("==== MULHERES ==== \n");
        for (String mulher : feminino) {

            System.out.printf(mulher + "\n");
        }

        System.out.printf("\n");

        Collections.sort(masculino);
        System.out.printf("==== HOMENS ==== \n");
        for (String homem : masculino) {
            System.out.printf(homem + "\n");
        }
    }
}